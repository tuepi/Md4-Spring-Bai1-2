package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class Dictionary {
    @GetMapping("/dictionary")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/dictionary")
    public ModelAndView translate(@RequestParam("input") String input) {
        ModelAndView modelAndView = new ModelAndView("index");
        Map<String, String> map = new HashMap<>();
        map.put("dog", "chuong");
        map.put("cat", "tom");
        map.put("fish", "hoa");
        Set<String> strings = map.keySet();
        for (String s : strings
             ) {
            if (s.equals(input)) {
                modelAndView.addObject("result", map.get(s));
                break;
            } else {
                modelAndView.addObject("result", "Not found");
            }
        }
        return modelAndView;
    }
}
