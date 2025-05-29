/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluada.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author emmac
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Solicitar cuanto gana
        String entrada = JOptionPane.showInputDialog("Digite el salario del empleado");
        double salario = Double.parseDouble(entrada);

        // Deducciones
        double sem = salario * 0.0925;
        double ivm = salario * 0.0508;
        double asociacion = salario * 0.025;

        // Variable que me guarda el monto total
        double MontoTotal = sem + ivm + asociacion;

        // Muestra de datos para abonar a la ccss
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de: "
                + (sem + ivm) + "por concepto de SEM y IVM");

        // Muestra de datos para la asociacion
        JOptionPane.showMessageDialog(null, "Para la asociacion de la empresa se abona un monto de: " + asociacion);

        // Muestra el monto total
        JOptionPane.showInternalMessageDialog(null, "El monto total de deduciones es de: " + MontoTotal);
    }

}
