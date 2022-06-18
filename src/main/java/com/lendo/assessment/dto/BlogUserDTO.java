package com.lendo.assessment.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class BlogUserDTO {
  private Long id;
  private String name;
  private String email;
  private String gender;
  private String status;
}
