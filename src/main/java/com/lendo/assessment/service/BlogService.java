/** */
package com.lendo.assessment.service;

import com.lendo.assessment.dto.BlogCommentDTO;
import com.lendo.assessment.dto.BlogPostDTO;
import com.lendo.assessment.dto.BlogUserDTO;

import java.util.List;

public interface BlogService {
  List<BlogUserDTO> getAllUsers();

  List<BlogPostDTO> getAllPosts(Long userId);

  List<BlogCommentDTO> getAllComments(Long postId);
}
