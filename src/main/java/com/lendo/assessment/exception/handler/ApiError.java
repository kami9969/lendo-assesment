/** */
package com.lendo.assessment.exception.handler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ApiError {
  private String message;
  private Integer status;
}
