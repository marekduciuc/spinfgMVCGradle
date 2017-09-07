package com.duciuc.smallcrm.web;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WellComeController {

@RequestMapping(method = RequestMethod.GET)
    public String wellcome(Model model){

    DateTime today = DateTime.now();
    model.addAttribute("today",today);
    return "welcome";

}

}
