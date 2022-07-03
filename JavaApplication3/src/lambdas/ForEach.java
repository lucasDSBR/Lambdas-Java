/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ForEach {
    public static void main(String[] args){
        List<String> aprovados = Arrays.asList("Ana", "Lya", "Bia");
        
        System.out.println("Forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        
        System.out.println("\nLambda na v.1");
        aprovados.forEach( nome -> {
            System.out.println(nome);
        });
        
        System.out.println("Method reference...");
        aprovados.forEach(System.out::println);
        
        System.out.println("\nLambda v.2");
        aprovados.forEach( nome -> meuImprimir(nome));
        
        System.out.println("Method reference v.2...");
        aprovados.forEach(ForEach::meuImprimir);
    }
    
    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é: "+ nome);
    }
}
