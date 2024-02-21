package com.vasigaran.joblisting.repository;

import com.vasigaran.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
