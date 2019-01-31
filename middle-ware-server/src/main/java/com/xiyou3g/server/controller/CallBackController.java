package com.xiyou3g.server.controller;

import com.xiyou3g.oauth2.dao.IUserDao;
import com.xiyou3g.oauth2.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author zeng on 18-10-22.
 * @version 1.0
 */
@RestController
@RequestMapping("/callBack")
@Slf4j
public class CallBackController {

    @Autowired
    private IUserDao userDao;

    @GetMapping("/test")
    public void oauth2CallBack(HttpServletRequest request) {
        String code = request.getParameter("code");
        if (code != null) {
            log.info(code);
        }
    }

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/testSelectUser")
    public void selectUser() {
        Set<User> set = userDao.selectDistinctUser();
        for (User user : set) {
            log.info("userName {}", user.getUserName());
        }
    }
}
