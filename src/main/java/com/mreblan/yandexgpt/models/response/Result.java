package com.mreblan.yandexgpt.models.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {

	private List<Alternative> alternatives;	
	private Usage usage;
	private String modelVersion;
}
