
package com.Tienda1.controller;

import com.Tienda1.domain.Cliente;
import comTienda1.dao.ClienteDao;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j 
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var texto = "Estamos en semana 4";
                
        model.addAttribute("mensaje", texto);
        
        var clientes=clienteDao.findAll();
      
        
        model.addAttribute("cliente", clientes);
        return "index";

    }
    
}
