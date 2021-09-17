/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.taskme.repository;

import com.br.taskme.models.Prioridade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Vinicius
 */
public interface PrioridadeRepository extends JpaRepository<Prioridade, Integer>{
    
}
