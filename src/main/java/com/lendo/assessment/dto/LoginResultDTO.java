package com.lendo.assessment.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginResultDTO {

  @NonNull private String jwt;
}
