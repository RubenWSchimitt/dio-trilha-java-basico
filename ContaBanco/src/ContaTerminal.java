import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira os dados solicitados: ");
		System.out.println("\nPor favor, digite o número da agência: ");
		String Agencia = scanner.next();
		
		System.out.println("\nPor favor, digite o número da sua conta bancária: ");
		int Numero = scanner.nextInt();	
		scanner.nextLine();
		
		System.out.println("\nPor favor, digite o seu nome completo: ");
		String Nome = scanner.nextLine();
		
		System.out.println("\nPor favor, digite o saldo que você deseja sacar: ");
		double Saldo = scanner.nextDouble();
		
		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo de R$ %.2f já está disponível para saque.",
							Nome, Agencia, Numero, Saldo);
		
	}
	
}
