/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entity.Veiculo;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
        
	private long id;
        
        @NotEmpty
        @Size(min = 2, max = 100)
	private String name;
        
        @NotEmpty
        @Size(min = 11, max = 11) 
	private String cpf;                       
        
        @NotEmpty
        @Size(min = 6, max = 30)
	private String email;
        
        @NotEmpty
        @Size(min = 2, max = 100)
	private Date nascimento;
        
        @Size(min = 2, max = 100)
        private List<Veiculo> veiculo;
    
}
