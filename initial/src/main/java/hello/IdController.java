package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IdController {

    @GetMapping("/{id}")
    @ResponseBody
    public String foo(@PathVariable int id) {
      return "Welcome to the home page! You are visitor number " + id;
    }
}
