/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;
import dto.UserDTO;
import entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper // anotação que indica ao map contructor que essa e a interface de conversão
public interface UserMapper {
    // mostra de forma explicita que a classe UserMappar e uma istancia de de um get do mapper
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class); 
     // formatacao da data
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    User toModel(UserDTO userDTO); //metodos de conversao
    UserDTO toDTO(User user);     
    
}
