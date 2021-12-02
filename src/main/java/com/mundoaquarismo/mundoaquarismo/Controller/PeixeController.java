package com.mundoaquarismo.mundoaquarismo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeixeController {
    @RequestMapping("/selecionarPeixes")
    public String form(){
        return "PeixesEventos/formpeixes";
    }

}
