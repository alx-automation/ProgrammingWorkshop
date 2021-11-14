package com.ejercicios.tests;

import com.ejercicios.primero.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorTest2 {



    public static void main(String[] args) {
        List<Integer> sueldos = new ArrayList<Integer>();
        int sueldoPorMes = 0;
        Vendedor vendedorPepe = new Vendedor();

        asignarItemsAUnaLista(sueldos);
        mostrarItemsLista(sueldos);

    }

    private static void mostrarItemsLista(List<Integer> sueldos) {
        int i = 1;
        for (Integer sueldo : sueldos) {
            System.out.println("El sueldo de pepe en el mes (" + (i) + "): " + sueldo);
            i++;
        }
    }

    private static void asignarItemsAUnaLista(List<Integer> sueldos) {
        int sueldoMes = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese la cantidad de ventas del mes (" + (i + 1) + "): ");
            Scanner scanner = new Scanner(System.in);
            sueldoMes = scanner.nextInt();
            sueldos.add(sueldoMes);
        }
    }
}
