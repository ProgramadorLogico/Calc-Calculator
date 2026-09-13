// Importa recursos essenciais
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// Classe principal
public class Main {
	// Corpo principal
	public static void main(String[] args) {
		// Declaração de variáveis e listas
		ArrayList<String> informacoesDoProjeto = new ArrayList<> (Arrays.asList("Nome do projeto - Calc Calculator", "Data de criação - 06/09/2026", "Criador - Programador Lógico"));
		ArrayList<String> historicoDeCalculos = new ArrayList<> ();
		Scanner scanner = new Scanner(System.in);
		boolean entradaValida = false;
		char operacao;
		// Loop principal
		while (true) {
			// Apresentação
			espacadorDeTexto();
			System.out.println("Bem-vindo ao Calc Calculator!");
			espacadorDeTexto();
			System.out.println("1 - Fazer um cálculo");
			System.out.println("2 - Registro de cálculos");
			System.out.println("3 - Sobre o projeto");
			System.out.println("4 - Sair");
			espacadorDeTexto();
			// Pegando a escolha do usuário
			System.out.println("Selecione uma das opções acima e aperte enter:");
			String comandoEscolhidoPeloUsuario = scanner.nextLine().trim().toLowerCase();
			// Verificando a escolha
			switch (comandoEscolhidoPeloUsuario) {
				// Caso de cálculo
				case "1":
					print("Digite o primeiro número:");
					String primeiroNumeroEntrada = scanner.nextLine();
					while (!entradaValida) {
						try {
							int primeiroNumeroFinal = Integer.parseInt(primeiroNumeroEntrada);
							entradaValida = true;
						} catch (NumberFormatException e) {
							espacadorDeTexto();
							print("Você não digitou um número!");
						}
					}
					entradaValida = false;
					print("Digite o segundo número:");
					String segundoNumeroEntrada = scanner.nextLine();
					while (!entradaValida) {
						try {
							int segundoNumeroFinal = Integer.parseInt(segundoNumeroEntrada);
							entradaValida = true;
						} catch (NumberFormatException e) {
							espacadorDeTexto();
							print("Você não digitou um número!");
						}
					}
					entradaValida = false;
					print("Digite a operação (+, -, *, /):");
					String operacaoEntrada = scanner.nextLine();
					while (!entradaValida) {
						try {
							char operacaoFinal = operacaoEntrada.charAt(0);;
							entradaValida = true;
						} catch (NumberFormatException e) {
							espacadorDeTexto();
							print("Você não digitou uma operação!");
						}
					}
					espacadorDeTexto();
					switch (operacaoFinal) {
						case '+':
							System.out.println("Este é o resultado: " + (primeiroNumeroFinal + segundoNumeroFinal));
							break;
					}
					break;
				// Caso de registro de cálculos
				// Caso de sobre o projeto
				// Caso de sair
			}
		}
	}
	// Função de limpar o terminal
	public static void limparTerminal() {
		System.out.print("\033[H\033[2J");
	}
	// Função de separar texto
	public static void espacadorDeTexto() {
		System.out.println("======================================================");
	}
	// Função de printar algo (apenas texto)
	public static void print(String texto) {
		System.out.println(texto);
	}
}
