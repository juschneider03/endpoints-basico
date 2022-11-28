package com.enpoints.service;

import com.enpoints.dto.NotaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotaService {

    public int somarNotas(int nota1, int nota2) {
        int soma = nota1 + nota2;
        return soma;
    }

    public double calcularMedia(ArrayList<Integer> notas){
       // int total = notas.stream().mapToInt(nota -> nota).sum();
        double total = 0;
        for( int nota : notas){
            total += nota;
        }
        //o foreach não pode utilizar variaveis de fora
//        notas.forEach(nota -> {
//            total += nota;
//        });
        return total/notas.size();
    }

    public List<NotaDTO> converterNotas(ArrayList<Integer> notas){
        List<NotaDTO> notasDTO = notas.stream().map(nota ->
                new NotaDTO(nota)
        ).collect(Collectors.toList());
        return notasDTO;
    }

    public List<NotaDTO> limitarNotas (List<NotaDTO> notas, int limite){
        return notas.stream().limit(limite).collect(Collectors.toList());
    }
}
