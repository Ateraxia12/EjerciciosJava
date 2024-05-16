/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class EjerciciosJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println("Hello World!");
         String nombreUsuario = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");
         int codMenuPpal = 0, codMenuTipico = 0, codMenuPlatoCarta = 0, codMenuPlatoInternacional = 0;
         int totalPlatos = 0; 
         int totalPlatosTipicos = 0;
         int totalPlatosCarta = 0;
         int totalPlatosInternacionales = 0;
         double totalPagar = 0.0;
        do {
            String menu = "***MENU RESTAURANTE***\n\n1. Plato tipico\n2.Plato a la carta\n3. Plato Internacional\n4. salir\n\nPorfavor seleccione una opción\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO \n\n1. Frijoles\n2.Sopa de verduras\n3. Regresar\n\nPorfavor seleccione una opción\n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $" + 12000);
                                totalPagar += 12000;
                                totalPlatos++; 
                                 totalPlatosTipicos++; 
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una sopa de verduras, el costo es de $" + 8000);
                                 totalPagar += 8000;
                                totalPlatos++; 
                                 totalPlatosTipicos++; 
                                break;

                            case 3:
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un "
                                        + "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                                break;

                        }

                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "
                                + "el menu tipico, O 2 para regresar al menu principal "));

                        if (codMenuTipico != 1) {
                            codMenuTipico = 3;
                        }

                    } while (codMenuTipico != 3);
                    /* FIN CASO UNO */
                    break;

                case 2:

                    do {
                        String menuPlatoCarta = "********MENU*******\nPLATO A LA CARTA \n\n1. Cocido Castellano \n2.Lentejas con chorizo\n3. Regresar\n\nPorfavor seleccione una opción\n";
                        codMenuPlatoCarta = Integer.parseInt(JOptionPane.showInputDialog(menuPlatoCarta));

                        switch (codMenuPlatoCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Cocido castellano,\n El costo es de $" + 22000);
                                 totalPagar += 22000;
                                totalPlatos++;
                                 totalPlatosCarta++; 
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado Lentejas con chorizo,\n El costo es de $" + 11000);
                                 totalPagar += 11000;
                                totalPlatos++; 
                                 totalPlatosCarta++;
                                break;

                            case 3:

                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un "
                                        + "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                                break;

                        }
                        codMenuPlatoCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "
                                + "el menu tipico, O 2 para  regresar al menu principal "));

                        if (codMenuPlatoCarta != 1) {
                            codMenuPlatoCarta = 3;
                        }

                    } while (codMenuPlatoCarta != 3);

                    break;

                case 3:
                    String menuPlatoInternacional = "*******MENU******\nPLATO INTERNACIONAL \n\n1. Ensalada mixta \n2.Fabada Asturiana\n3. Regresar\n\nPorfavor seleccione una opción\n";
                    codMenuPlatoInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuPlatoInternacional));

                    switch (codMenuPlatoInternacional) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado ensalada mixta,\n el costo es de $" + 14000);
                             totalPagar += 14000;
                            totalPlatos++; 
                            totalPlatosInternacionales++;
                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha solicitado una fabada asturiana,\n el costo es de $" + 13000);
                             totalPagar += 13000;
                            totalPlatos++; 
                            totalPlatosInternacionales++;
                            break;

                        case 3:

                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un "
                                    + "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                            break;

                    }

          codMenuPlatoInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "
                                + "el menu tipico, O 2 para  regresar al menu principal "));

                    if (codMenuPlatoInternacional != 1) {
                        codMenuPlatoInternacional = 3;
                    }

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "¡Gracias por visitarnos, " + nombreUsuario + "!");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un "
                            + "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                    break;
            }

        } while (codMenuPpal != 4);
        
         String factura = "FACTURA:\n";
        factura += "Nombre del cliente: " + nombreUsuario + "\n";
        factura += "Platos pedidos:\n";
        factura += "- Platos típicos: " + totalPlatosTipicos + "\n";
        factura += "- Platos a la carta: " + totalPlatosCarta + "\n";
        factura += "- Platos internacionales: " + totalPlatosInternacionales + "\n";
        factura += "Total a pagar: $" + totalPagar;
        JOptionPane.showMessageDialog(null, factura);

/*
        JOptionPane.showMessageDialog(null, "Total de platos procesados: " + totalPlatos +
                                            "\nTotal de platos típicos: " + totalPlatosTipicos +
                                            "\nTotal de platos a la carta: " + totalPlatosCarta +
                                            "\nTotal de platos internacionales: " + totalPlatosInternacionales);
*/
    }
}
