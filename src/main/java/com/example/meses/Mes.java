package com.example.meses;

public class Mes {
    private int numero;
    private String nombre;
    private int dias;

    public Mes(int numero, String nombre, int dias) {
        this.numero = numero;
        this.nombre = nombre;
        this.dias = dias;
    }

    public int getNumero() {
        return numero;
    }
    public String getNombre() {
        return nombre;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
