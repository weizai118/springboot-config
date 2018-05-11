package com.forezp.controller;

import com.forezp.entity.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: LucyController</p>
 * <p>Description: </p>
 * <p>Company: www.guochengsh.com</p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-03-29 14:50
 */
@RestController
@EnableConfigurationProperties(ConfigBean.class) //springboot2.0 不加该注解也可以 ?
public class LucyController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    public String miya(){
        return configBean.toString();
    }

}
