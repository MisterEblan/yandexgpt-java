package com.mreblan.yandexgpt.models.request;

import java.util.List;

import com.mreblan.yandexgpt.models.Message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Request {

	private String modelUri;
	private CompletionOptions completionOptions;
	private List<Message> messages;
}
