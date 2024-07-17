package com.blogapplication.app;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blogapplication.app.model.Post;
import com.blogapplication.app.service.postServices;


@SpringBootApplication
public class BlogApplication implements CommandLineRunner
{

	
	@Autowired
	private  postServices postSer;
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter ldt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Blog Application Running");
		System.out.println("1. For Add Post");
		System.out.println("2. For View All Post");
		System.out.println("Enter Choice - ");
		int ch = sc.nextInt();
		if(ch==1)
		{
			
			Post p=new Post();
			System.out.println("Enter Post Title - ");
			p.setTitle(sc.next());
			System.out.println("Enter Post Content - ");
			p.setContent(sc.next());
			postSer.createPost(p);
			System.out.println("Post Created Succesfully");
		
		}
		else if(ch==2)
		{
			ArrayList<Post> allPost = postSer.viewAllPost();
			for(Post post:allPost)
			{
				System.out.println(post);
				
			}
		}
		
	}

}
