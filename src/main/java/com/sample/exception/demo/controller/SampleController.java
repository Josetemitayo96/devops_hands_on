/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.exception.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CUgorji
 */
@RestController
@RequestMapping("api/v1/exception")
public class SampleController {
    @GetMapping("/test/{a}")
    public String tryUserException(@PathVariable("a")String a) throws ClientException {
        if(a.length() > 1)
            throw new ClientException(ClientException.ErrorType.OTP_USED.getValue());
        return "Hey";
    }
}
