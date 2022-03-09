/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.service;

import com.examen.entity.Evento;
import com.examen.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wimmermadrigal
 */
@Service
public class EventoService implements IEventoService{
    
     @Autowired
    
    private EventoRepository EventoRepository;
    
 
    @Override
    public List<Evento> getAllPerson() {
        return (List<Evento>) EventoRepository.findAll();
    }

    @Override
    public void savePerson(Evento evento) {
        EventoRepository.save(evento);
    }

    @Override
    public Evento getPersonById(long id) {
        return EventoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        EventoRepository.deleteById(id);
    }
    
}
