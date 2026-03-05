
package jogador;

import java.util.Scanner;

public class principal {
     public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Jogador j1 = new Jogador();

        System.out.println("Digite o nome do jogador:");
        j1.setNome(ler.nextLine());

        System.out.println("Digite a posição (defesa / meio-campo / atacante):");
        j1.setPosicao(ler.nextLine());

        System.out.println("Digite o ano de nascimento:");
        j1.setAnoNascimento(ler.nextInt());
        ler.nextLine();

        System.out.println("Digite a nacionalidade:");
        j1.setNacionalidade(ler.nextLine());

        System.out.println("Digite a altura:");
        j1.setAltura(ler.nextDouble());

        System.out.println("Digite o peso:");
        j1.setPeso(ler.nextDouble());

        System.out.println("--- DADOS DO JOGADOR ---");
        j1.mostrarDados();

        j1.tempoAposentadoria();
     }
}
     
