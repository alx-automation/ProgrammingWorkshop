package com.ejercicios.tests;

import com.ejercicios.primero.Vendedor;

public class VendedorTest {

    public static void main(String[] args) {


        Vendedor lisa = new Vendedor("Lisa", "987654223");

        Vendedor vendedorPepe = new Vendedor();
//        verificarTiempoServicioValoresNegativos();

        int[] sueldosPepe = {99, 50, 80, 80, 110, 100, 101};

        int sueldoBasePepeOld = vendedorPepe.obtenerSueldoBaseVendedor(6);
        double sueldoTotalPepeOld = vendedorPepe.obtenerSueldoTotalVendedor(101, sueldoBasePepeOld);

        System.out.println("El sueldo total de pepe sin evaluación es: " + sueldoTotalPepeOld);

        int acumulado = vendedorPepe.evaluarSueldoTotalPepe(sueldosPepe);
        double nuevoSueldoBase = vendedorPepe.evaluarSueldoVendedor(acumulado);
        double sueldoTotalPepe = vendedorPepe.obtenerSueldoTotalVendedor(101, nuevoSueldoBase);

        System.out.println("El sueldo total de Pepe luego de la evaluación es: " + sueldoTotalPepe);
/*        Enero: 99 // posición 0
        Febrero: 50
        Marzo: 80
        Abril: 80
        Mayo: 110
        Junio: 100*/// posición 5
        
//        int[] sueldosPepeUltimoSemestre = new int[7];
        //indices/ 0 , 1, 2, 3....6


/*        sueldosPepeUltimoSemestre[0] = 99;
        sueldosPepeUltimoSemestre[1] = 50;
        sueldosPepeUltimoSemestre[2] = 80;
        sueldosPepeUltimoSemestre[3] = 80;
        sueldosPepeUltimoSemestre[4] = 110;
        sueldosPepeUltimoSemestre[5] = 100;
        sueldosPepeUltimoSemestre[6] = 101;*/

    }




    public static void verificarTiempoServicioValoresNegativos() {
        Vendedor vendedorX = new Vendedor();
        int sueldoBasePepe = vendedorX.obtenerSueldoBaseVendedor(-6);

        System.out.println("sueldo base de Pepe: " + sueldoBasePepe);
    }

}
