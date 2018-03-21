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

    @RequestMapping("/cyhDebugPath")
    public String cyhDebugMethod(Map<String, Object> map) {
        System.err.println("map.getClass().getName(): " + map.getClass().getName());
        map.put("companies", Arrays.asList("Google", "Microsoft", "Alibaba"));
        return "success";
    }


}
