/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dto.MessageResponseDTO;
import dto.VeiculoDTO;
import entity.Veiculo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import repository.VeiculoRepository;


@Service
public class VeiculoService {
    private VeiculoRepository veiculoRepository;
    RestTemplate restTemplate = new RestTemplate();
    // exemplo para pegar as requisicoes do veiculo
    Veiculo pedido = restTemplate.getForObject("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/", Veiculo.class);
    
    //metodo cria veiculo endpoint 2
    public MessageResponseDTO createVeiculo(VeiculoDTO veiculoDTO) {
       
        Veiculo savedVeiculo = veiculoRepository.save(veiculoDTO); 
        return createMessageResponse(savedVeiculo.getId(), "Created veiculo with ID ");
    }
    
    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
