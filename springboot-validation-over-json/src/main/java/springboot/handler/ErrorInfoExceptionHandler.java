package springboot.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import springboot.consts.ResponseInfo;
import springboot.domain.result.ResultBody;
import springboot.exception.ErrorInfoException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/12/29.
 */
@RestControllerAdvice
public class ErrorInfoExceptionHandler {

    @ExceptionHandler(ErrorInfoException.class)
    public ResultBody handleException(HttpServletRequest request, ErrorInfoException exception){
        ResultBody resultBody = new ResultBody(exception.getResponseInfo());
        return resultBody;
    }
}
