package com.lendo.assessment.config;

import com.lendo.assessment.interceptor.IntegrationClientHttpInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

  @Value("${gorest.api.base.url}")
  private String gorestApiBaseUrl;

  @Bean
  public RestTemplate gorestRestTemplate(RestTemplateBuilder builder) {
    builder = builder.rootUri(gorestApiBaseUrl);
    builder = builder.interceptors(new IntegrationClientHttpInterceptor());
    return builder.build();
  }
}
