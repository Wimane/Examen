/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.controller;

import com.examen.entity.Evento;
import com.examen.service.IEventoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author wimmermadrigal
 */

@Controller  // sirve para indicar que es un controlador
@Slf4j
public class EventosController {@Autowired
    private IEventoService eventoService;
    
    @GetMapping("/eventos")
    public String index (Model model){
        List<Evento> listaEventos=eventoService.getAllPerson();
        model.addAttribute("titulo","eventos");
        model.addAttribute("eventos",listaEventos);
        return "eventos";
        
    }
    
    @GetMapping("/eventosN")
    public  String nuevaPersona(Model model){
        model.addAttribute("evento" , new Evento());
        return "crear";
    }
    
    @PostMapping("/guardarEvento")
    public String guardarPersona( @ModelAttribute Evento evento){
        eventoService.savePerson(evento);
        return "redirect:/eventos";
    }
    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersonas){
        eventoService.delete(idPersonas);
        return "redirect:/evento";
    }
    
}
