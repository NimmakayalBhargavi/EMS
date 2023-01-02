package com.cg.ems.exception;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class UserGlobalExceptionHandler {
	@ExceptionHandler(UserException.class)
	public @ResponseBody UserErrorInfo userIdException(UserException e,HttpServletRequest req) {
	  
		String msg=e.getMessage();
		String uri= req.getRequestURI();
		return new UserErrorInfo(msg,uri,LocalDateTime.now());
}



	
	
}




	
