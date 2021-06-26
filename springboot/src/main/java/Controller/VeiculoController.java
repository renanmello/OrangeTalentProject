/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Service.UserService;
import Service.VeiculoService;
import dto.MessageResponseDTO;
import dto.UserDTO;
import dto.VeiculoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.validation.Valid;

public class VeiculoController {
    
    private VeiculoService veiculoService;

    
    @PostMapping //mapeia um post
    @ResponseStatus(HttpStatus.CREATED) // Indica ao Spring a msg criada no codigo 201
    public MessageResponseDTO createVeiculo(@RequestBody @Valid VeiculoDTO veiculoDTO) {
        return veiculoService.createVeiculo(veiculoDTO);
    }
}
