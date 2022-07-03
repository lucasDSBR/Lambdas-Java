/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author lucas
 */
public class Consumidor {
    public static void main(String[] args) {
             
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        
        Produto p1 = new Produto("Bolsa O", 89.00, 0.10);
        
        imprimir.accept(p1);
        
        
        Produto p2 = new Produto("Notebook", 2987.00, 0.25);
        Produto p3 = new Produto("CAderno", 19.90, 0.03);
        Produto p4 = new Produto("Borracha", 7.80, 0.18);
        Produto p5 = new Produto("LApis", 4.39, 0.19);
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        
        produtos.forEach(imprimir);
        
        
        
    }
}
