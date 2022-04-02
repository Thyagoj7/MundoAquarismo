package com.mundoaquarismo.mundoaquarismo.Controller;

import com.mundoaquarismo.mundoaquarismo.Models.ElementosPeixe;
import com.mundoaquarismo.mundoaquarismo.repository.PeixesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PeixeController {

    @Autowired
    private PeixesRepository er;

    @RequestMapping(value ="/cadastrarPeixes", method=RequestMethod.GET)
    public String form(){
        return "PeixesEventos/formpeixes";
    }

    @RequestMapping(value ="/cadastrarPeixes", method = RequestMethod.POST)
    public String form(ElementosPeixe elementospeixe){  //ElementoPeixe = Entidade
        er.save(elementospeixe);

        return "redirect:/cadastrarPeixes";
    }

    @RequestMapping("/peixes")
    public ModelAndView listarPeixes(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<ElementosPeixe> peixe = er.findAll();
        mv.addObject("peixes",peixe);
        return mv;
    }

}
