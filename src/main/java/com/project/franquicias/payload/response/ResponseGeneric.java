package com.project.franquicias.payload.response;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseGeneric {
	
	private String code;
	private String message;
	private List<?> msg;
	
	public ResponseGeneric (String code, String message) {
		this.code = code;
		this.message = message;		
	}

	public ResponseGeneric (String code, String message, List<?> msg) {
		this.code = code;
		this.message = message;
		this.msg = msg;
	}
}
