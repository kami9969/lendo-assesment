package com.lendo.assessment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class BlogCommentDTO {
  private Long id;

  @JsonProperty("post_id")
  private Long postId;

  private String name;
  private String email;
  private String body;
}
