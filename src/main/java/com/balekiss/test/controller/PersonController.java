package com.balekiss.test.controller;


import com.balekiss.test.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PersonController {
    public final static Integer maximumAge = 150;
    /**
     * show All person in apps with alphabetic order
     * @deprecated
     *
     * @param machine instance
     * @return list Of person
     */
    @Deprecated
    @GetMapping("/getClients")

    public String showPersons(Model model) {
        try {
            model.addAttribute("newPerson", new Person() {
            });

        } catch (Exception e) {
            e.toString();
        }
        return "itinovBank";
    }
}
