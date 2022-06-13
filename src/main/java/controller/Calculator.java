package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {

    @GetMapping("/calculator")
    public ModelAndView loadIndex() {
        return new ModelAndView("calculator");
    }


    @PostMapping("/calculator")
    public ModelAndView select(@RequestParam("number1") double number1, @RequestParam("opera") String opera, @RequestParam("number2") double number2) {
        ModelAndView modelAndView = new ModelAndView("calculator");
        double select = calculator(number1, number2, opera);
        modelAndView.addObject("result", select);
        return modelAndView;
    }

    private double calculator(double number1, double number2, String opera) {
        switch (opera) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "/":
                if (number2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                } else {
                    return number1 / number2;
                }
            case "*":
                return number1 * number2;
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}