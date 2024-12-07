package com.mreblan.yandexgpt.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CompletionOptions {
	private boolean stream;
	private float   temperature;
	private String  maxTokens;
}
