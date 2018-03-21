package com.cyh;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CYH
 * @date 2018/3/21
 */
@Controller
public class ForDebugSpringMvcController {

    @RequestMapping("/debug")
    public String debug(Map<String, Object> map) {
        map.put("companies", Arrays.asList("Nokia", "tsing", "guoXiaoMei"));
        return "success";
    }


}
