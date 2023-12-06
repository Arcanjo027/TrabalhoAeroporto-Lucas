import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Primeira Avaliação

public class Aeroporto {
    public static void main(String[] args) {
        String voos [] = new String [5];
        voos[0] = "Origem: Vitoria. Destino: São Paulo. Horario de partida: 15:00."
                + "Horario de chegada:17:00. Quantidade maxima de passageiros: 650";
        
        voos[1] = "Origem: Sao Paulo. Destino: Rio de Janiero. Horario de partida: 16:00."
                + "Horario de chegada:17:11. Quantidade maxima de passageiros: 847";
        
        voos[2] = "Origem: Rio de Janeiro. Destino: Brasilia. Horario de partida:12:00 ."
                + "Horario de chegada:14:47. Quantidade maxima de passageiros: 653";
        
        voos[3] = "Origem: Brasilia. Destino: Porto Alegre. Horario de partida: 9:00."
                + "Horario de chegada:10:53. Quantidade maxima de passageiros: 853";
        
        voos[4] = "Origem: Porto Alegre. Destino: Belo Horizonte. Horario de partida: 17:00."
                + "Horario de chegada:19:07. Quantidade maxima de passageiros: 798";
        
        try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Senhor passageiro, antes de reservar o voo, e necessario que nos"
                        + "informe o seu nome, idade, cpf e um email valido, respectivamente");
                String nome = scan.nextLine();
                String idade = scan.nextLine();
                String cpf = scan.nextLine();
                String email = scan.nextLine();
                
                Queue<String> reservas = new LinkedList<>();
                reservas.add(nome);
                reservas.add(idade);
                reservas.add(cpf);
                reservas.add(email);
                
                Stack<String> check_in = new Stack <>();
                check_in.push(nome + cpf);
        }
        System.out.println("");
        System.out.println("Parabens caro passageiro, agora voce está cadastrado em nosso sistema,"
                + "a seguir vira a lista com os voos disponiveis");
        System.out.println(voos[0]);
        System.out.println(voos[1]);
        System.out.println(voos[2]);
        System.out.println(voos[3]);
        System.out.println(voos[4]);
        System.out.println("");
        System.out.println("Selecione o voo que vos queiras reservar");
        
    }
}
class Passageiros{
    private String Nome;
    private int idade;
    private String Cpf;
    private String Email;

    public Passageiros(String Nome, int Idade, String Cpf, String Email) {
        this.Nome = Nome;
        this.idade = Idade;
        this.Cpf = Cpf;
        this.Email = Email;
    }

   
       public String getname() { 
       return Nome; }
    ]oi[
