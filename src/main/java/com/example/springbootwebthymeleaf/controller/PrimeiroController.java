package com.example.springbootwebthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PrimeiroController {

    @GetMapping("/")
    public String HelloWorld(Model model)  {

        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        model.addAttribute("hostname",inetAddress.getHostName());
        model.addAttribute("ip_address",inetAddress.getHostAddress());

        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");
        String date = dateFormat.format(new Date());

        model.addAttribute("date_hour",date);

        return "index";
    }

}
