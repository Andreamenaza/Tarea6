/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 *
 * @author Andrea
 */
public class Calcular {

    private static final int LIMITE_HACER_DESCUENTO = 3;
    private static final double DESCUENTO_BASIC = 0.95;
    private static final double DESCUENTO_PRIME = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > LIMITE_HACER_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * DESCUENTO_PRIME;
            mostrarResultado(Total);
        } else {
            Total = precioProducto * DESCUENTO_BASIC;
            mostrarResultado(Total);
        }

    }

    private void mostrarResultado(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
}
