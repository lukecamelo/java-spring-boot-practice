package io.practice.bootstart.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  @ResponseBody
  public String sayHi(@RequestParam String id) {
    return "paramId: " + id;
  }

}