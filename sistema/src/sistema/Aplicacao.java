package sistema;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        String nome;
        int numero;
        int idade;
        String especialidade;
        String dataConsulta;

        Scanner ler = new Scanner(System.in);
        Paciente paciente;
        Arvore arvore = new Arvore();
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do paciente: ");
            nome = ler.nextLine();
            System.out.println("Digite a idade do paciente: ");
            idade = ler.nextInt();
            System.out.println("Digite o número do prontuário: ");
            numero = ler.nextInt();
            System.out.println("Digite a especialidade da consulta: ");
            especialidade = ler.nextLine();
            System.out.println("Digite o dia da consulta: ");
            dataConsulta = ler.nextLine();
            paciente = new Paciente(numero, nome, idade, especialidade, dataConsulta);
            arvore.inserir(paciente, arvore.raiz);
        }
    }
}
