package com.mreblan.yandexgpt.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usage {

	private String inputTextTokens;
	private String completionTokens;
	private String totalTokens;
}
