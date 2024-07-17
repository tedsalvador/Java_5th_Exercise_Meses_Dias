package com.example.meses;

import java.time.Year;

public class MesService {
    private static final Mes[] meses = {
        new Mes(1, "Enero", 31),
        new Mes(2, "Febrero", 28),
        new Mes(3, "Marzo", 31),
        new Mes(4, "Abril", 30),
        new Mes(5, "Mayo", 31),
        new Mes(6, "Junio", 30),
        new Mes(7, "Julio", 31),
        new Mes(8, "Agosto", 31),
        new Mes(9, "Septiembre", 30),
        new Mes(10, "Octubre", 31),
        new Mes(11, "Noviembre", 30),
        new Mes(12, "Diciembre", 31)
    };

    public Mes getMesInfo(int numero) {
        if (numero < 1 || numero > 12) {
            throw new IllegalArgumentException("Número de mes inválido: " + numero);
        }
        
        Mes mes = meses[numero - 1];

        if (numero == 2 && Year.now().isLeap()) {
            mes.setDias(29);
        }

        return mes;
    }
}
