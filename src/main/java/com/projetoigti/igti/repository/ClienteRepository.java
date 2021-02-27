package com.projetoigti.igti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoigti.igti.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findById(long id);

}
