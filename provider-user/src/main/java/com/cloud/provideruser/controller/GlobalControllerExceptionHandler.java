package com.cloud.provideruser.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

import static org.apache.commons.lang.exception.ExceptionUtils.getStackTrace;

@Slf4j
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String NPEHanlder(NullPointerException e){
        //手工將StackTrace輸出
//	CharArrayWriter cw = new CharArrayWriter();
//	PrintWriter w = new PrintWriter(cw);
//	e.printStackTrace(w);
//	w.close();
        log.error(e.getMessage());
        log.debug("=================");
        log.error(e.getLocalizedMessage());
	log.debug("=================");
	//叫API,較簡潔,但是原理一樣
        log.error(getStackTrace(e));

        return "ERROR!!";
    }

}
