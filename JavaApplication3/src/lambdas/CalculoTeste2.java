/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lambdas;

/**
 *
 * @author acerte
 */
public class CalculoTeste2 {
    public static void main(String[] args){
        Calculo calc = (x, y) -> { return x + y };
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));

    }
}
