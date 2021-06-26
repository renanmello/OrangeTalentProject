/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import Controller.UserController;
import entity.User;
import entity.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author RENAN
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    
    
    
    }
    

