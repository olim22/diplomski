/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.controller;

import fon.silab.njt.diplomski.domain.Sluzbenik;
import fon.silab.njt.diplomski.service.SluzbenikService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Olja
 */
@Controller
public class HomeController {

    @Autowired
    private SluzbenikService sluzbenikService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("sluzbenik", new Sluzbenik());
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @ModelAttribute("sluzbenik") Sluzbenik sluzbenik,
            HttpSession httpSession,
            Model model) {
        Sluzbenik sluzbenik1 = sluzbenikService.login(sluzbenik.getUsername(), sluzbenik.getPassword());
        if (sluzbenik1 == null) {
            model.addAttribute("error", "Fail error");
            return "index";
        } else {
            httpSession.setAttribute("username", sluzbenik.getUsername());
            return "/success";
        }
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        return "redirect:/index";
    }

}
