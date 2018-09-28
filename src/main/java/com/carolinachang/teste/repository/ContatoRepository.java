package com.carolinachang.teste.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carolinachang.teste.domain.Contato;

@SuppressWarnings("rawtypes")
@Repository
public interface ContatoRepository extends MongoRepository<Contato, String>{

}
