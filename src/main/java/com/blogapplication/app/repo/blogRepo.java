package com.blogapplication.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogapplication.app.model.Post;

@Repository
public interface blogRepo extends CrudRepository<Post, Integer>
{

}
