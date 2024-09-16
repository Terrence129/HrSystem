package io.yaqi.hrsystem.config;

import io.yaqi.hrsystem.utils.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.login.LoginException;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/9/16 11:58
 * @Param
 **/

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public ResponseResult<Object> loginException(LoginException e) {
        log.error(e.getMessage());
        return ResponseResult.fail(null, e.getMessage(), 500);
    }
}
