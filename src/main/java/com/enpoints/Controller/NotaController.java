package com.enpoints.Controller;

import com.enpoints.dto.NotaDTO;
import com.enpoints.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping(value = "/somar/{numero1}/{numero2}")
    public int somarNotas(@PathVariable int numero1, @PathVariable int numero2){
        return notaService.somarNotas(numero1,numero2);
    }

    @PostMapping(value = "/calcular-media")
    public double calcularMedia(@RequestBody ArrayList<Integer> notas){
        return notaService.calcularMedia(notas);
    }

    @PostMapping(value = "/converter")
    public List converterNotas(@RequestBody ArrayList<Integer> notas){
        return notaService.converterNotas(notas);
    }

    @PostMapping(value = "/limitar")
    public List<NotaDTO> limitarNotas(@RequestBody List<NotaDTO> notas,@RequestParam int limite){
        return notaService.limitarNotas(notas, limite);
    }
}
