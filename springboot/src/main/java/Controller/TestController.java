/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RENAN

@RestController
public class HellowController {
    @GetMapping("/")
    public String Hellow() {
        return "hellow word";
    }
}
*/