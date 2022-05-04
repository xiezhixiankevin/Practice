package bjtu.shixun.webdemo2.controller;

;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <Description> HelloController
 *
 * @author 26802
 * @version 1.0
 * @ClassName HelloController
 * @taskId
 * @see bjtu.shixun.webdemo2.controller
 */
@Controller
public class HelloController {

    @RequestMapping("/hello11")
    public String hello(){
        return "sssaDs";
    }

}
