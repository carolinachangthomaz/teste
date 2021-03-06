package com.carolinachang.teste.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carolinachang.teste.domain.Profile;


@Repository
public interface ProfileRepository extends MongoRepository<Profile, String>{

}
