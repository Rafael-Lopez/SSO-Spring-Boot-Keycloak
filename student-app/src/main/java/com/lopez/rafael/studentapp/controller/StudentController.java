package com.lopez.rafael.studentapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping(value = {"/", "login"})
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @GetMapping("/manage-students")
    @PreAuthorize("hasAuthority('PROFESSOR')")
    // For multiple roles you have options:
    // @PreAuthorize("hasAuthority('PROFESSOR') or hasAuthority('STUDENT')")
    // @PreAuthorize("hasAuthority('PROFESSOR') and hasAuthority('STUDENT')")
    public ModelAndView manageStudents() {
        return new ModelAndView("manage-students");
    }

    @GetMapping("/access-denied")
    public ModelAndView accessDenied() {
        return new ModelAndView("access-denied");
    }
}
