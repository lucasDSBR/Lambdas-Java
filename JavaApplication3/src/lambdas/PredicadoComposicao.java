/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Predicate;

/**
 *
 * @author lucas
 */
public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num %2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
        
        System.out.println(isPar.and(isTresDigitos).test(22));
    }
}
