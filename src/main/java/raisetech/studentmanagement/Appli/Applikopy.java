package raisetech.studentmanagement.Appli;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.studentmanagement.StudentmanagementApplication;

@SpringBootApplication
@RestController

public class Applikopy {
  public static void main(String[] args) {

    SpringApplication.run(StudentmanagementApplication.class, args);
  }
  @GetMapping("/hello")
  public String hello(){
    return "Hello, World";

    }
  }

//localhost:8080/hello