package com.carolinachang.teste.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carolinachang.teste.domain.App1;


@Repository
public interface App1Repository extends MongoRepository<App1, String>{

}
