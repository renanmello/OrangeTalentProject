/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author RENAN
 */
@ResponseStatus(HttpStatus.NOT_FOUND) // classe do erro 
public class UserNotFoundException extends Exception{
    public UserNotFoundException(Long id) {
        super("User not found with ID " + id);
    }

}
