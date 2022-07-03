/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author lucas
 */
public class Desafio {
    public static void main(String[] args) {
                
        /*
        1. A partir do produto calcular o preco real(com desconto);
        2. Imposto Municipal: >= 2500 (8.5%)/ < 2500(Isento);
        3. Frete: >= 3000(100)/ < 3000(50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: R$1234.56
        */
        Function<Produto, Double> precoFinal = 
                p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal = 
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = 
                preco -> preco >= 2000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = 
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Produto, String> formatar = 
                preco -> ("R$"+preco).replace(".", ",");
        
        Produto p = new Produto("iPad", 3235.89, 0.13);
        
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println(preco);
        
        
        
    }
}
