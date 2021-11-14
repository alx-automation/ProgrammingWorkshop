package com.ejercicios.primero;

public class Vendedor {

    String nombre;
    String dni;
    int sueldoBaseVendedor;
    double sueldoTotalVendedor;

    public Vendedor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Vendedor() {

    }

    public int obtenerSueldoBaseVendedor(int tiempoDeServicio) {
        if ((tiempoDeServicio >= 0) && (tiempoDeServicio <= 5)) {
            sueldoBaseVendedor = 2500;
        } else {
            if ((tiempoDeServicio > 5) && (tiempoDeServicio <= 7)) {
                sueldoBaseVendedor = 4000;
            } else {
                if ((tiempoDeServicio > 7) && (tiempoDeServicio <= 10)) {
                    sueldoBaseVendedor = 6000;
                }
            }
        }
        return sueldoBaseVendedor;
    }

    public int evaluarSueldoTotalPepe(int[] sueldoPepe) {
        int contadorVentasMensuales = 0;
        for (int i = 0; i < 7; i++) {
            if (sueldoPepe[i] >= 100) {
                contadorVentasMensuales = contadorVentasMensuales + 1;
            }
        }
        return contadorVentasMensuales;
    }

    public double evaluarSueldoVendedor(int acumulado) {
        double nuevoSueldoBaseVendedor = 0;
        if (acumulado >= 3) {
            nuevoSueldoBaseVendedor = sueldoBaseVendedor * 1.15;
        }
        return nuevoSueldoBaseVendedor;
    }

    public double obtenerSueldoTotalVendedor(int cantidadProductosVendidos, double sueldoBaseVendedor) {

        if ((cantidadProductosVendidos >= 0) && (cantidadProductosVendidos <= 50)) {
            sueldoTotalVendedor = (sueldoBaseVendedor) * (1.1);
        }

        if ((cantidadProductosVendidos > 50) && (cantidadProductosVendidos <= 100)) {
            sueldoTotalVendedor = (sueldoBaseVendedor) * (1.15);
        }

        if ((cantidadProductosVendidos > 100) && (cantidadProductosVendidos <= 150)) {
            sueldoTotalVendedor = (sueldoBaseVendedor) * (1.2);
        }
        return sueldoTotalVendedor;
    }

    public void mostrarSueldoTotalVendedor() {
        System.out.println("el sueldo total del vendedor es: " + sueldoTotalVendedor);
    }

}
