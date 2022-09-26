import java.util.Scanner;
public class Exercicio01 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal, c, d, u, resto;
        int novoNumero;

        //entrada de dados
        System.out.println("Digite um numero inteiro de 3 digitos: ");
        numeroOriginal = teclado.nextInt();

        //processamento
        c = numeroOriginal / 100; //ex: 234 / 100 = 2  portanto C = 2
        resto = numeroOriginal % 100; //ex: 234 % 100 = 14  portanto resto=34
        d = resto / 10; //ex: 34 / 10 = 3  portanto D = 3
        u = resto % 10; //ex: 34 % 10 = 4  portanto U = 4

        novoNumero = u * 100 + d * 10 + c;

        //saida
        System.out.println("O novo numero vale: " + novoNumero);

        teclado.close();

    }
}
        /*
         234 - como decompor este numero
         234 - 2 centenas + 3 dezenas + 4 unidades
         
         234/100
            34   2 (centenas )
            34/10
             4       3(dezenas)
             (unidade)
             novo numero > unidade * 100 + dezena *10 + centena
         */
