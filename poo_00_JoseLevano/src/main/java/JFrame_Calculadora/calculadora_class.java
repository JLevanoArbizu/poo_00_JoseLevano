/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame_Calculadora;

/**
 *
 * @author joseLevanoArbizu
 */
public class calculadora_class {

    //metodos
    public String sumar(String a, String b) {
        int resultado = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(resultado);
    }

    public String restar(String a, String b) {
        int resultado = Integer.parseInt(a) - Integer.parseInt(b);
        return String.valueOf(resultado);
    }

    public String multiplicar(String a, String b) {
        int resultado = Integer.parseInt(a) * Integer.parseInt(b);
        return String.valueOf(resultado);
    }

    public String dividir(String a, String b) {
        double resultado = Double.parseDouble(a) / Double.parseDouble(b);
        return String.format("%.2f",resultado);
    }
}
