/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author lucas
 */
public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> umLista = 
                () -> Arrays.asList("Ana", "Bia", "Lya", "Gui");
        
        System.out.println(umLista.get());
    }
}
