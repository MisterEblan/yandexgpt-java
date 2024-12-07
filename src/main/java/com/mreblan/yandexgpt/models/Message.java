package com.mreblan.yandexgpt.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Message {

	private String role;
	private String text;
}
