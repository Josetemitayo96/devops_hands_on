/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.exception.demo.controller;

/**
 *
 * @author CUgorji
 */
public class ClientException extends Exception{
    
    public ClientException(String errorType) {
        super(errorType);
    }

    public enum ErrorType{
        SECURITY_ANSWER_MISMATCH("Security answer mismatch"),
        INVALID_OTP("OTP is invalid"),
        OTP_EXPIRED("OTP is expired"),
        OTP_USED("OTP has been used already"),
        CLIENT_BLOCKED("Client is blocked"),
        PASSWORD_MISMATCH("Password does not match"),
        INVALID_BIOMETRIC_TOKEN("Invalid credentials"),
        INVALID_PHONE("Invalid phone number");

        private String value;

        ErrorType(String s) {

            value = s;
        }

        public String getValue() {
            return value;
        }
    }  
    
    
}
