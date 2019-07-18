package com.example.demo.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**全局异常处理对象
 * 通过此类实现所有Controller中的异常处理
 * @author Lenovo
 * @ControllerAdvice:声明类可以作为统一异常处理对象
 *
 */
@ControllerAdvice
public class ControllerException {
    //处理相应的异常
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public JsonResult handleServiceException(ServiceException e){
        return new JsonResult(e);
    }

}

