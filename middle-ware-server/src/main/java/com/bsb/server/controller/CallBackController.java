package com.bsb.server.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zeng on 18-10-22.
 * @version 1.0
 */
@RestController
@RequestMapping("/callBack")
public class CallBackController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/test")
    public void oauth2CallBack(HttpServletRequest request) {
        String code = request.getParameter("code");
        if (code != null) {
            logger.info(code);
        }
    }

    @GetMapping
    public String hello() {
        return "hello";
    }
}
