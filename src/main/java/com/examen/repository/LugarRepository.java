/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.repository;

import com.examen.entity.Lugar;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author wimmermadrigal
 */
public interface LugarRepository extends CrudRepository <Lugar,Long>{
    
}
