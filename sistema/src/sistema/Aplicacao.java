package sistema;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        boolean rodando = true;
        String opcao;
        String nome;
        int numero;
        int idade;
        String especialidade;
        String dataConsulta;

        Scanner ler = new Scanner(System.in);
        Paciente paciente;
        Arvore arvore = new Arvore();
    
        
        

        while(rodando){
            System.out.println("==================================================");
            System.out.println("Bem Vindo Ao Sistema De Cadastramento De Pacientes");
            System.out.println("Escolha Uma Opção:");
            System.out.println("1- Cadastrar Paciente");
            System.out.println("2- Buscar paciente pelo prontuário");
            System.out.println("3- Remover Paciente");
            System.out.println("4- Exibir pacientes em ordem crescente");
            System.out.println("5- Exibir pacientes em pré-ordem");
            System.out.println("6- Exibir pacientes em pós-ordem");
            System.out.println("7- Mostrar paciente com maior prontuário");
            System.out.println("8- Mostrar paciente com menor prontuário");
            System.out.println("9- Mostrar quantidade de pacientes cadastrados");
            System.out.println("10- Mostrar altura da árvore");
            System.out.println("11- Encerrar Programa");
            System.out.println("==================================================");
            opcao = verificarNull(ler);
            
            switch (opcao) {
                case "1":

                    System.out.println("Digite o nome do paciente: ");
                    nome = ler.nextLine();

                    System.out.println("Digite a idade do paciente: ");
                    idade = ler.nextInt();

                    System.out.println("Digite o número do prontuário: ");
                    numero = ler.nextInt();

                    ler.nextLine();
                    System.out.println("Digite a especialidade da consulta: ");
                    especialidade = ler.nextLine();

                    System.out.println("Digite o dia da consulta: ");
                    dataConsulta = ler.nextLine();

                    paciente = new Paciente(numero, nome, idade, especialidade, dataConsulta);
                    arvore.inserir(paciente, arvore.raiz);

                    break;
                
                case "2":

                    int protuario;
                    System.out.println("Digite o número do prontuário: ");
                    protuario = ler.nextInt();
                    arvore.buscarProtuario(arvore.raiz, protuario);
                    break;
                case "3":

                    String localPaciente;
                    System.out.println("Digite o nome do paciente para remover: ");
                    localPaciente = ler.nextLine();
                    break;
                case "4":

                    System.out.println("Lista Exibida Em Ordem Crescente:");
                    arvore.ordemCres(arvore.raiz);
                    break;
                case "5":

                    System.out.println("\nPré-Ordem: ");
                    arvore.preOrdem(arvore.raiz);
                    break;
                case "6":
                    System.out.println("Pós-Ordem:");
                    arvore.posOrdem(arvore.raiz);
                    break;
                case "7":
                    System.out.println("Paciente Com Maior Protuário: ");
                    paciente = arvore.maiorProtuario(arvore.raiz);
                    paciente.toString();
                    break;
                case "8":
                    System.out.println("Paciente Com Menor Protuário: ");
                    paciente = arvore.menorProtuario(arvore.raiz);
                    paciente.toString();
                    break;
                case "9":
                    System.out.println("Quantidade de Clientes Cadastrados: " + arvore.getTamanho());
                    break;
                case "10":
                    System.out.println("Altura Da Arvore: " + arvore.altura(arvore.raiz));

                    break;
                case "11":
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
    public static String verificarNull(Scanner ler){
        int opcao;
        while (true) {
			String txt = ler.nextLine();
            opcao = Integer.parseInt(txt);
			if (!txt.isBlank() && opcao > 0 && opcao < 12) {
				return txt;
			}
			System.out.println("Digite novamente!");
		}
    }
}
