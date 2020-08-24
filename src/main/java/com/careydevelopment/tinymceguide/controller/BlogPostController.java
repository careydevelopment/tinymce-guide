package com.careydevelopment.tinymceguide.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.careydevelopment.tinymceguide.model.BlogPost;

@Controller
@RequestMapping("/admin")
public class BlogPostController {

	private static final Logger LOG = LoggerFactory.getLogger(BlogPostController.class);

		
	@GetMapping("/addEditPost")
	public String addEditPost(Model model, @RequestParam("blogPostId") Optional<String> blogPostId) {		
		setDefaultBlogPost(model);					
		return "admin/addEditPost";
	}
	

	@PostMapping("/addEditPost")
	public String addEditPostSubmit(Model model, @Valid BlogPost blogPost, BindingResult bindingResult, HttpServletResponse response) {
		if (bindingResult.hasErrors()) {
			for (ObjectError err : bindingResult.getAllErrors()) {
				LOG.debug(err.getCode() + " " + err.getDefaultMessage() + " " + err.getObjectName() + " " +err);
			}
			
			return "admin/addEditPost";
		}
		
		return "admin/addEditPost";
	}

	
	private void setDefaultBlogPost(Model model) {
		BlogPost blogPost = new BlogPost();		
		model.addAttribute("blogPost", blogPost);
	}
}
