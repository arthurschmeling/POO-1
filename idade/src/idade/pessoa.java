
package idade;


public class pessoa {
     private String nome;
    private int idade;
    private double altura;

    public pessoa(){
        this.nome = "";
        this.idade = 0;
        this.altura = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public void mostrarDados(){

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public void verificarMaiorIdade(){

        if(idade >= 18){
            System.out.println("A pessoa é maior de idade.");
        }else{
            System.out.println("A pessoa é menor de idade.");
        }
    }

    public void anosPara100(){

        int falta = 100 - idade;

        if(falta > 0){
            System.out.println("Faltam " + falta + " anos para chegar aos 100 anos.");
        }else{
            System.out.println("A pessoa já tem 100 anos ou mais.");
        }
    }
}
