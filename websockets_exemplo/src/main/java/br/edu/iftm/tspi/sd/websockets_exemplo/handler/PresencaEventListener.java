package br.edu.iftm.tspi.sd.websockets_exemplo.handler;

import java.time.Instant;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class PresencaEventListener {

  private final PresencaService presenca;
  private final SimpMessagingTemplate template;

  public PresencaEventListener(PresencaService presenca, SimpMessagingTemplate template) {
    this.presenca = presenca;
    this.template = template;
  }

  @EventListener
  public void onDisconnect(SessionDisconnectEvent event) {
    var sha = StompHeaderAccessor.wrap(event.getMessage());
    String usuario = (String) sha.getSessionAttributes().get("username");
    if (usuario != null && !usuario.isBlank()) {
      presenca.remover(usuario); 
      template.convertAndSend("/topic/online", presenca.listarOnline()); // atualiza front

      Mensagem mensagem = new Mensagem();
      mensagem.setTipoMensagem(TipoMensagem.SAIR);
      mensagem.setDataHora(Instant.now());
      mensagem.setTexto(usuario + " saiu");      
      template.convertAndSend("/topic/public", mensagem);    
    }
  }
}
