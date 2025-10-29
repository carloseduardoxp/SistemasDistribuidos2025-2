package br.edu.iftm.tspi.sd.websockets_exemplo.handler;

import java.time.Instant;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private final PresencaService presenca;
    private final SimpMessagingTemplate template;

    public ChatController(PresencaService presenca,SimpMessagingTemplate template) {
        this.presenca = presenca;
        this.template = template;
    }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public Mensagem enviarTexto(Mensagem mensagem) {
        mensagem.setTipoMensagem(TipoMensagem.ENVIAR_TEXTO);
        mensagem.setDataHora(Instant.now());
        return mensagem;
    }

    @MessageMapping("/chat.join") 
    @SendTo("/topic/public")
    public Mensagem entrar(Mensagem mensagem) {
        mensagem.setTipoMensagem(TipoMensagem.ENTRAR);
        mensagem.setDataHora(Instant.now());
        mensagem.setTexto(mensagem.getOrigem() + " entrou");
        presenca.adicionar(mensagem.getOrigem());
        template.convertAndSend("/topic/online", presenca.listarOnline());
        return mensagem;
    }

    @MessageMapping("/chat.leave") 
    @SendTo("/topic/public")
    public Mensagem sair(Mensagem mensagem) {
        mensagem.setTipoMensagem(TipoMensagem.SAIR);
        mensagem.setDataHora(Instant.now());
        mensagem.setTexto(mensagem.getOrigem() + " saiu");
        presenca.remover(mensagem.getOrigem());
        template.convertAndSend("/topic/online", presenca.listarOnline());
        return mensagem;
    }

    @MessageMapping("/chat.private")
    public void enviarPrivado(Mensagem mensagem) {
        mensagem.setTipoMensagem(TipoMensagem.PRIVADO);
        mensagem.setDataHora(java.time.Instant.now());
        template.convertAndSend("/topic/dm." + mensagem.getDestino(), mensagem);
    }

}
