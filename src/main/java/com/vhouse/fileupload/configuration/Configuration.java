/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vhouse.fileupload.configuration;

import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;


/**
 *
 * @author ammar
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
        // Turn off suffix-based content negotiation
        configurer.favorPathExtension(false);
    }
}
