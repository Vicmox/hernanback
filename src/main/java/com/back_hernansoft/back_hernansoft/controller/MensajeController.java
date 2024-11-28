
package com.back_hernansoft.back_hernansoft.controller;

import com.back_hernansoft.back_hernansoft.entity.Mensaje;
import com.back_hernansoft.back_hernansoft.repository.MensajeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")
public class MensajeController{

  @Autowired
  private MensajeRepository mensajeRepository;
  
 
  public String mensaje(@RequestParam(value = "mensaje") String mensaje){
    return mensaje;
  }

  @GetMapping
  public List<Mensaje> listar() {
        return mensajeRepository.findAll();
    }
  
}