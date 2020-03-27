package com.ufro.cl.talle_recuperativ.controladores;

import com.ufro.cl.talle_recuperativ.modelo.Asignatura;
import com.ufro.cl.talle_recuperativ.modelo.Horario;
import com.ufro.cl.talle_recuperativ.modelo.enumerations.Dia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/asignatura")
public class AsignaturaControlador {
    Horario hor = Horario.getHorario();

    @GetMapping("/")
    public String getAsignatura(Model model){
        int[]per ={1,2,3,4,5,6,7,8,9,10};
        model.addAttribute("periodos",per);
        model.addAttribute("dias", Dia.values());
        return "/asignaturaPag";
    }

    @PostMapping("/")
    public String postAsignatura(@ModelAttribute Asignatura asig){
        int dia=0;
        switch (asig.getDia()){
            case LUNES:
                dia=0;
                break;
            case MARTES:
                dia=1;
                break;
            case MIERCOLES:
                dia=2;
                break;
            case JUEVES:
                dia=3;
                break;
            case VIERNES:
                dia=4;
        }
        hor.agregarAsignatura(dia,asig.getPeriodo(),asig);
        return "redirect:/";
    }
}
