import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> informacoesDoProjeto = new ArrayList<> (Arrays.asList("Nome do projeto - Calc Calculator", "Dara de criação - 6/09/2026", "Criador - Programador Lógico"));
		Scanner scanner = new Scanner(System.in);
		boolean programaRodando = true;
		while (programaRodando) {
			espacadorDeTexto();
			System.out.println("Bem-vindo ao Calc Calculator!");
			espacadorDeTexto();
			System.out.println("	1 - Fazer um cálculo");
			System.out.println("    2 - Registro de cálculos");
			System.out.println("    3 - Sobre o projeto");
			System.out.println("    4 - Sair");
			espacadorDeTexto();
			System.out.println("Selecione uma das opções acima e aperte enter:");
			String comandoEscolhidoPeloUsuario = scanner.nextLine().trim().toLowerCase();
			switch (comandoEscolhidoPeloUsuario) {
				case "1":
					limparTerminal();
					espacadorDeTexto();
					System.out.println("Digite o primeiro numero e aperte enter:");
					String receberPrimeiroNumero = scanner.nextLine().trim();
					// Parei aqui, fazer sistema para verificar se à entrada é válida
					break;
			}
		}
	}
	public static void limparTerminal() {
		System.out.print("\033[H\033[2J");
	}
	public static void espacadorDeTexto() {
		System.out.println("======================================================");
	}
}
