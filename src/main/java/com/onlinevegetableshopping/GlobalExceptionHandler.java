package com.onlinevegetableshopping;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalExceptionHandler {
	/*
	 * @ExceptionHandler is an annotation used to handle the specific exceptions and
	 * sending the custom responses to the client.
	 * 
	 * @ResponseBody is a Spring annotation which binds a method return value to the
	 * web response body. HttpServeletRequest is an interface and extends the
	 * serveletRequest interface and give url path. LocalDateTime.now tells on which
	 * date and time the exception occurs.
	 */
	//@ExceptionHandler(StudentNotFoundException.class)
	//public @ResponseBody ErrorInformation checkOrderExistence(StudentNotFoundException e, HttpServletRequest req) {
		//ErrorInformation ef = new ErrorInformation(e.getLocalizedMessage(), req.getRequestURI(), LocalDateTime.now());
		//return ef;
	}

