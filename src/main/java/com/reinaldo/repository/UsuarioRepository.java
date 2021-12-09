package com.reinaldo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinaldo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
