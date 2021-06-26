/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RENAN
 
@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/app")
    public String getAppMessage() {

        return appMessage;
    }

}
*/