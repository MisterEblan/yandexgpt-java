package com.mreblan.yandexgpt.models.response;

import com.mreblan.yandexgpt.models.Message;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Alternative {

	private Message message;
	private String status;
}
