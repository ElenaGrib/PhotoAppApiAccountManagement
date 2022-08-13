package com.grib.api.accountmanagement.photoappapiaccountmanagement.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {

    @GetMapping("/status/check")
    public String status() {
        return "Working...";
    }
}
