package br.com.senaiscfuturodev.crudusuario.controller;

import br.com.senaiscfuturodev.crudusuario.model.Usuario;
import br.com.senaiscfuturodev.crudusuario.model.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping ("/usuario")

public class UsuarioController {
    UsuarioService usuarioService = new UsuarioService();

    @GetMapping

        public List<Usuario> listarUsuario() {

            Usuario usuario = new Usuario();
            usuario.setNome("Gismi");
            usuario.setCpf("06958745693");
            usuario.setIdade(28);
            this.usuarioService.salvar(usuario);
            return usuarioService.getUsuarios();


        }



}
