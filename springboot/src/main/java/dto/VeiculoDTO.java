/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
/**
 *
 * @author RENAN
 */
public class VeiculoDTO {
    
	private long id;
        
        @NotEmpty
        @Size(min = 2, max = 100)
	private String modelo;
        
        @NotEmpty
        @Size(min = 2, max = 100)
	private String marca;
        
        @NotEmpty
        @Size(min = 2, max = 100)
	private Date ano;
        
        @NotEmpty
        @Size(min = 2, max = 100)
	private BigDecimal valor;
}
