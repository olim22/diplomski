/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.controller;

import fon.silab.njt.diplomski.domain.Dobavljac;
import fon.silab.njt.diplomski.service.DobavljacService;
import fon.silab.njt.diplomski.service.GradService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Olja
 */
@Controller
@RequestMapping(value = "/dobavljaci/*")
public class DobavljacController {

    @Autowired
    private GradService gradService;
    
    @Autowired
    private DobavljacService dobavljacService;
    
    @GetMapping("/all")
    public ModelAndView vratiDobavljace() {
        System.out.println("fon.silab.njt.diplomski.controller.DobavljacController.vratiDobavljace()");
        List<Dobavljac> dobavljaci = dobavljacService.getAll();
        for (Dobavljac dobavljac : dobavljaci) {
            System.out.println(dobavljac);
        }
        ModelAndView modelAndView = new ModelAndView("/dobavljaci/all");
        modelAndView.addObject("dobavljaci", dobavljaci);
        return modelAndView;
    }
}
