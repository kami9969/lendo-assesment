package com.lendo.assessment.controller;

import com.lendo.assessment.dto.BlogCommentDTO;
import com.lendo.assessment.dto.BlogPostDTO;
import com.lendo.assessment.dto.BlogUserDTO;
import com.lendo.assessment.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
@RequestMapping("/blog")
public class BlogController {

  @Autowired private BlogService blogService;

  @GetMapping("/users")
  public List<BlogUserDTO> getAllUsers() {
    return blogService.getAllUsers();
  }

  @GetMapping("/posts")
  public List<BlogPostDTO> getAllPosts(@RequestParam(required = false) Long userId) {
    return blogService.getAllPosts(userId);
  }

  @GetMapping("/comments")
  public List<BlogCommentDTO> getAllComments(@RequestParam(required = false) Long postId) {
    return blogService.getAllComments(postId);
  }
}
