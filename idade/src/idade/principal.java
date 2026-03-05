
package idade;

import java.util.Scanner;


public class principal {
     public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        pessoa p1 = new pessoa();

        System.out.println("Digite o nome:");
        p1.setNome(ler.nextLine());

        System.out.println("Digite a idade:");
        p1.setIdade(ler.nextInt());

        System.out.println("Digite a altura:");
        p1.setAltura(ler.nextDouble());

        System.out.println("--- DADOS DA PESSOA ---");

        p1.mostrarDados();

        p1.verificarMaiorIdade();

        p1.anosPara100();
    }
}
