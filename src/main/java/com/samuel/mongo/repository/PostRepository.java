package com.samuel.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samuel.mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
