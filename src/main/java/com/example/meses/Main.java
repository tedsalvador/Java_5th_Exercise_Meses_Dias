package com.example.meses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MesService mesService = new MesService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de un mes (1-12): ");
        int numeroMes = scanner.nextInt();
        
        try {
            Mes mes = mesService.getMesInfo(numeroMes);
            System.out.println("Nombre del mes: " + mes.getNombre());
            System.out.println("Número de días: " + mes.getDias());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

