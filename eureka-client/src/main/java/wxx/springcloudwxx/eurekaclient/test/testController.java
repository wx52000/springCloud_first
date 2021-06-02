package wxx.springcloudwxx.eurekaclient.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {

    @RequestMapping("test")
    public String test(){
        return "hello spring cloud";
    }
}
