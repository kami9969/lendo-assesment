package com.lendo.assessment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class BlogPostDTO {
  private Long id;

  @JsonProperty("user_id")
  private Long userId;

  private String title;
  private String body;
}
