package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Nim");
        return "greeting";
      }

    @GetMapping("/form")
    public String greetingForm(Model model) {
      model.addAttribute("greeting", new Greeting());
      return "form";
    }

    @PostMapping("/form")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
      return "result";
    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String goodbye() {
      return "Goodbye!";
    }

}
