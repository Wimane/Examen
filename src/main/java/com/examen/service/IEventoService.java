/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.service;

import com.examen.entity.Evento;
import java.util.List;

/**
 *
 * @author wimmermadrigal
 */
public interface IEventoService {
        public List<Evento> getAllPerson();
    public void savePerson (Evento evento);
    public Evento getPersonById(long id);
    public void delete(long id);
    
    
}
