/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Service.UserService;
import dto.MessageResponseDTO;
import dto.UserDTO;
import entity.User;
import exception.UserNotFoundException;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;
import javax.validation.Valid;
/**
 *
 * @author RENAN
 */
@RestController // indica que Ã© um controlador que vai ser acessar atraves de uma API REST
@RequestMapping("/cadastro/usuario") // caminho principal de acesso a API
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    
    private UserService userService;

    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Indica ao Spring a msg criada no codigo 201
    public MessageResponseDTO createUser(@RequestBody @Valid UserDTO userDTO) {
        return userService.createUser(userDTO); //cria o usuario
    }
    //lista os usuarios
    @GetMapping
    public List<UserDTO> listAll() {
        return userService.listAll();
    }
    //busca por id
    @GetMapping("/{id}") 
    public UserDTO findById(@PathVariable Long id) throws UserNotFoundException { //senao achar lanca erro
        return userService.findById(id);
    }

    
}


