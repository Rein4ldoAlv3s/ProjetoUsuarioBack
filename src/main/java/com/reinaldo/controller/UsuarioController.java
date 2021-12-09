package com.reinaldo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinaldo.model.Usuario;
import com.reinaldo.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/{idUsuario}")
	public ResponseEntity<Usuario> EncontrarUm(@PathVariable Long idUsuario){
		Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
		if (usuario.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(usuario.get());
		}
	}
		
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@PutMapping("/{idUsuario}")
	public ResponseEntity<Usuario> atualizarDados(@PathVariable Long idUsuario, @RequestBody Usuario usuario){
		if(usuarioRepository.existsById(idUsuario)) {
			usuario.setId(idUsuario);
			return ResponseEntity.ok(usuarioRepository.save(usuario));
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
}
