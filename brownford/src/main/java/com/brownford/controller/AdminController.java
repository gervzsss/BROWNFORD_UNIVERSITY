package com.brownford.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin-dashboard")
    public String adminDashboard() {
        return "/admin/admin-dashboard";
    }
}
