package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class OSSConfig {
	@Value("${live.oss.endpoint.video.gaokao}")
	private String endpoint;
}
