/** */
package com.lendo.assessment.service.impl;

import com.lendo.assessment.dto.BlogCommentDTO;
import com.lendo.assessment.dto.BlogPostDTO;
import com.lendo.assessment.dto.BlogUserDTO;
import com.lendo.assessment.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {

  @Autowired private RestTemplate gorestRestTemplate;

  @Override
  public List<BlogUserDTO> getAllUsers() {
    return gorestRestTemplate
        .exchange(
            "/v2/users",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<BlogUserDTO>>() {})
        .getBody();
  }

  @Override
  public List<BlogPostDTO> getAllPosts(Long userId) {
    List<BlogPostDTO> list;
    list =
        gorestRestTemplate
            .exchange(
                "/v2/posts",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<BlogPostDTO>>() {})
            .getBody();
    if (Objects.nonNull(userId) && !CollectionUtils.isEmpty(list)) {
      list = list.stream().filter(l -> l.getUserId().equals(userId)).collect(Collectors.toList());
    }
    return list;
  }

  @Override
  public List<BlogCommentDTO> getAllComments(Long postId) {
    List<BlogCommentDTO> list =
        gorestRestTemplate
            .exchange(
                "/v2/comments",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<BlogCommentDTO>>() {})
            .getBody();
    if (Objects.nonNull(postId) && !CollectionUtils.isEmpty(list)) {
      list = list.stream().filter(l -> l.getPostId().equals(postId)).collect(Collectors.toList());
    }
    return list;
  }
}
