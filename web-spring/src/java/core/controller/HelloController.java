/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(HttpServletRequest request, ModelMap model) {
        String nama = request.getParameter("nama");
        String[] data = {"Data satu","Data dua","Data tiga","Data empat"};
        model.addAttribute("data", data);
        model.addAttribute("nama", nama);
        return "hello";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String sayWelcome() {
        return "welcome";
    }

}
