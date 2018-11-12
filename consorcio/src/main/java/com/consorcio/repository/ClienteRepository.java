package com.consorcio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consorcio.entidad.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
