package com.mshop.monitorbackend.config;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PaymentRestDTO implements Serializable {

	private String status;
	private String message;
	private String URL;
}
