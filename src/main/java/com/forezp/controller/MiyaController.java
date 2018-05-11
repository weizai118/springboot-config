package com.forezp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: MiyaController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-03-29 14:29
 */
@RestController
public class MiyaController {

    @Value( "${my.name}" )
    private String name;
    @Value( "${my.age}" )
    private int age;

    @RequestMapping(value = "/miya")
    public String miya(){
        return name + ":" + age;
    }


}
