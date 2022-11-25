package com.enpoints.Controller;

import com.enpoints.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping(value = "/somar/{numero1}/{numero2}")
    public int somarNotas(@PathVariable int numero1, @PathVariable int numero2){
        return notaService.somarNotas(numero1,numero2);
    }

    @PostMapping(value = "/calcular-media")
    public double calcularMedia(ArrayList notas){
        return notaService.calcularMedia(notas);
    }

//    @PostMapping(value = "/converter")
//    public double converterNotas(){
//
//    }
}
