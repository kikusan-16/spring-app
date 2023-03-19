package work.sehippocampus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import work.sehippocampus.ctrl.MyService;

@SpringBootApplication(scanBasePackages = "work.sehippocampus")
@RestController
public class DemoApplication {

  private final MyService myService;

  public DemoApplication(MyService myService) {
    this.myService = myService;
  }

  @GetMapping("/")
  public String home() {
    return myService.message();
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}