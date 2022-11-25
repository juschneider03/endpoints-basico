package com.enpoints.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NotaService {

    public int somarNotas(int nota1, int nota2) {
        var soma = nota1 + nota2;
        return soma;
    }

    public double calcularMedia(ArrayList<Integer> notas){
        int total = notas.stream().mapToInt(nota -> nota).sum();
        return total/notas.size();
    }
}
