package com.blogapplication.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapplication.app.model.Post;
import com.blogapplication.app.repo.blogRepo;

@Service
public class postServices
{
	@Autowired
	blogRepo blogRepo;

	public void createPost(Post p)
	{
		blogRepo.save(p);
	}
	
	public ArrayList<Post> viewAllPost()
	{
		return (ArrayList<Post>) blogRepo.findAll();
	}
}
