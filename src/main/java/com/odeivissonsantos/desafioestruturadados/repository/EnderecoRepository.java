package com.odeivissonsantos.desafioestruturadados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
