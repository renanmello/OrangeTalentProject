/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Veiculo;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//Classe do usuário 
@Entity // indica que é uma entidade no bando de dados
@Data //inseri os getters e setters 
@Builder // cria um padrão na construção dos objetos
@AllArgsConstructor // essas duas anotações inserem construtores com e sem argumentos
@NoArgsConstructor //
public class User {
        @Id //identificacao do campo
        @GeneratedValue(strategy = GenerationType.IDENTITY) // insere ids automaticamente
	private long id;
        
        @Column(nullable = false) // notação de coluna
	private String name;
        
        @Column(nullable = false, unique = true) // como cpf e email sao unicos
	private String cpf;                      // precisa passar "unique" como parametro 
        
        @Column(nullable = false, unique = true)
	private String email;
        
        @Column(nullable = false)
	private Date nascimento;
        
        // como o veiculo está ligado ao usuario e preciso fazer essa ligação entre eles
        @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Veiculo> veiculo;

    
    }
        
    
    

