 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Function;

/**
 *
 * @author lucas
 */
public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = 
                numero -> numero %2 == 0? "Par" : "Impar";
        
        System.out.println(parOuImpar.apply(3));
        
        Function<String, String> oResultadoE =
                valor -> "O Resultado é: "+valor;
        
        System.out.println(parOuImpar.andThen(oResultadoE).apply(34));
    }
}
