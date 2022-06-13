package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertMoney {
//    @GetMapping("/convert")
//    public String show() {
//        return "convert";
//    }


//    @PostMapping("/convert")
//    public String calculator(@RequestParam double input, Model model) {
//        double rate = 23;
//        double result = input * rate;
//        model.addAttribute("result", result);
//        return "convert";
//    }
//
    @GetMapping("/convert")
    public ModelAndView showView() {
        ModelAndView modelAndView = new ModelAndView("convert");
        return modelAndView;
    }

    @PostMapping("/convert")
    public ModelAndView convert(@RequestParam double input) {
        ModelAndView modelAndView = new ModelAndView("convert");
        double result = input * 23;
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
