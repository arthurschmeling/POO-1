
package jogador;

public class Jogador {
    
    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(){
        this.nome = "";
        this.posicao = "";
        this.anoNascimento = 0;
        this.nacionalidade = "";
        this.altura = 0;
        this.peso = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public String getPosicao(){
        return posicao;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

   public int calcularIdade(){
        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        return idade;
    }

    public void tempoAposentadoria(){

        int idade = calcularIdade();
        int idadeAposentadoria = 0;

        if(posicao.equalsIgnoreCase("defesa")){
            idadeAposentadoria = 40;
        }
        else if(posicao.equalsIgnoreCase("meio-campo")){
            idadeAposentadoria = 38;
        }
        else if(posicao.equalsIgnoreCase("atacante")){
            idadeAposentadoria = 35;
        }

        int tempoFalta = idadeAposentadoria - idade;

        if(tempoFalta > 0){
            System.out.println("Faltam " + tempoFalta + " anos para aposentar.");
        }else{
            System.out.println("O jogador já pode se aposentar.");
        }
    }

    public void mostrarDados(){

        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Idade: " + calcularIdade());
        
    }
    
}
