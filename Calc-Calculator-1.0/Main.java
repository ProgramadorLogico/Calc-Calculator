import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Listas
    public static final ArrayList<String> comandosExistentes = new ArrayList<> (Arrays.asList("1 - Fazer uma operação", "2 - Informações do projeto", "3 - Fechar programa"));
    public static void main(String[] args) {
        // Variáveis
        Scanner scanner = new Scanner(System.in);
        String versaoDoProjeto = "1.0";
        String nomeDoProjeto = "Calc Calculator";
        String criadorDoProjeto = "Programador Lógico";
        // Apresentação ao usuário
	print(1, "================================================");
        print(1, "");
        print(1, "Bem-vindo ao Calc Calculator!");
        print(1, "Você está utilizando a versão" + versaoDoProjeto);
        print(1, "Caso queira a versão mais recente, acesse: https://github.com/ProgramadorLogico/Calc-Calculator e baixe a versão mais recente");
        // Lista todos os comandos
	listarComandos();
	// Loop principal
        while (true) {
            // Pegar entrada do usuário
            String comandoSelecionado = scanner.nextLine();
            // Verifica qual comando foi selecionado
            switch (comandoSelecionado) {
                case "1":
		    double primeiroNumeroValor;
		    double segundoNumeroValor;
		    String operacaoValor;
		    print(2, "");
		    print(1, "Digite o primeiro número e aperte enter:");
                    double primeiroNumero = scanner.nextDouble();
		    primeiroNumeroValor = primeiroNumero;
		    scanner.nextLine();
		    print(2, "");
    		    print(1, "Digite a operação e aperte enter: (/, *, -, +)");
		    String operacao = scanner.next().trim();
		    operacaoValor = operacao;
		    print(2, "");
		    print(1, "Digite o segundo número e aperte enter:");
		    double segundoNumero = scanner.nextDouble();
		    segundoNumeroValor = segundoNumero;
		    if (operacaoValor == "-") {
		    	subtracao(primeiroNumero, segundoNumero);
		    } else if (operacaoValor.equals("+")) {
			adicao(primeiroNumero, segundoNumero);
		    } else if (operacaoValor == "*") {
			multiplicacao(primeiroNumero, segundoNumero);
		    } else if (operacaoValor == "/") {
		   	System.out.println(primeiroNumero / segundoNumero);
		    } else {
			print(2, "");
			print(1, "Operação não encontrada");
		    }
		    scanner.nextLine();
		    listarComandos();
		    break;
                case "2":
                    // Exibi as informações do projeto
                    print(2, "");
                    System.out.println("Informações do projeto:");
                    print(1, "");
                    System.out.println("Nome do projeto: " + nomeDoProjeto);
                    System.out.println("Versão do projeto: " + versaoDoProjeto);
                    System.out.println("Criador do projeto: " + criadorDoProjeto);
		    listarComandos();
                    break;
                case "3":
                    // Fecha o programa
                    System.exit(0);
                    break;
                default:
                    // Retorna um aviso de comando inválido
                    print(2, "");
                    print(3, "O comando digitado não existe");
		    listarComandos();
                    break;
            }
        }
    }
    public static double subtracao(double A, double B) {
        return A - B;
    }
    public static double adicao(double A, double B) {
        return A + B;
    }
    public static double multiplicacao(double A, double B) {
        return A * B;
    }
    public static double divisao(double A, double B) {
        return A / B;
    }

    public static void print(int tipo, String texto) {
        if (tipo == 1) {
            System.out.println(texto);
        } else if (tipo == 2) {
            print(1, "");
            print(1, "================================================");
            print(1, "");
        } else if (tipo == 3) {
            System.err.println(texto);
        } else {
            print(3, "A variável tipo recebeu um valor inválido");
        }
    }
    public static void listarComandos() {
	print(2, "");
	for (int i = 0; i < comandosExistentes.size(); i++) {
	    System.out.println(comandosExistentes.get(i));
	}
    }
}
