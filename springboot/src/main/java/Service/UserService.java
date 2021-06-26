/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dto.MessageResponseDTO;
import dto.UserDTO;
import entity.User;
import exception.UserNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import repository.UserRepository;

@Service // indica ao Spring que essa classe é de serviço ou seja irá ter as regras de negocio da API
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private UserRepository userRepository;
    
    
    
    private final UserMapper personMapper = UserMapper.INSTANCE; //estanciando a classe 

    //metodo para criar o usuario endpoint 1
    public MessageResponseDTO createUser(UserDTO userDTO) {
        User userToSave = UserMapper.toModel(userDTO); //valida a entrada e converte no padrao

        User savedUser = UserRepository.save(userToSave); //depois salva
        return createMessageResponse(savedUser.getId(), "Created user with ID ");
    }
    
    // metodo para listar os usuarios endpoint 3
    public List<UserDTO> listAll() {
        List<User> allusers = UserRepository.findAll(); //cria uma lista com todos os usuarios
        return allusers.stream()                       // retornado pelo metodo findall()
                .map(personMapper::toDTO)               // transforma cada entidade em DTO
                .collect(Collectors.toList());         // e retorna na lista
    }
    // metodo que acha o usuario pelo id
    public UserDTO findById(Long id) throws UserNotFoundException {
        User user = verifyIfExists(id);

        return personMapper.toDTO(user);
    }
    //metodo que verifica se o usuario existe
    private User verifyIfExists(Long id) throws UserNotFoundException {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    
    //metodo que retorna a mensagem
    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }


}
