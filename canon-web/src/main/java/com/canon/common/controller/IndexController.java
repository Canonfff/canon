package com.canon.common.controller;

import com.canon.base.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/4 18:50
 * @Description:
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public Model hello() {
        return new Model();
    }
}
