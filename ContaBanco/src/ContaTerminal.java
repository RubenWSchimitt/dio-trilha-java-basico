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
		
		System.out.println("\nOlá "+Nome+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "
							+Numero+" e seu saldo de R$"+Saldo+" já está disponível para saque.");
		
	}
	
}
