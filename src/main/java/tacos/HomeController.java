package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 控制器
@Controller
public class HomeController {
  // 处理对根路径"/"的get请求
  @GetMapping("/")
  public String home() {
    // 返回视图名
    return "home";
  }

}
