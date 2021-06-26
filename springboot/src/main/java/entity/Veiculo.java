package entity;


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
        
        @Column(nullable = false)
	private String modelo;
        
        @Column(nullable = false)
	private String marca;
        
        @Column(nullable = false)
	private String ano;
        
        @Column(nullable = false)
	private BigDecimal valor;
    
}
