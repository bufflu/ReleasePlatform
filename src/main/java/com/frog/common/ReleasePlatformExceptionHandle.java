package com.frog.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: RemindExceptionHandle
 * Description: global controller advicer that printing log and returning Result
 * Date: 2019/6/26 17:23
 *
 * @author guoxinlu
 */
@RestControllerAdvice
public class ReleasePlatformExceptionHandle {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e, HttpServletRequest request, HttpServletResponse response){

        logger.error("请求[{}]发生异常：", request.getRequestURI(), e);

        if (e instanceof ReleasePlatformException) {
            return Result.error(e.getMessage());
        } else {
            return Result.error("系统异常");
        }

    }
}
