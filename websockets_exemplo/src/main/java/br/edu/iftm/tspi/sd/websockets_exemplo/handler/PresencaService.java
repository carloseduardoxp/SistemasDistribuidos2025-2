package br.edu.iftm.tspi.sd.websockets_exemplo.handler;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class PresencaService {

    private final Set<String> usuariosOnline = ConcurrentHashMap.newKeySet();

    public void adicionar(String usuario) {
        usuariosOnline.add(usuario);
    }

    public void remover(String usuario) {
        usuariosOnline.remove(usuario);
    }

    public List<String> listarOnline() {
        return usuariosOnline.stream().sorted().toList();
    }
}

