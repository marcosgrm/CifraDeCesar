import java.util.Scanner;

public class CifraCesar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensagem;
		int chave;

		System.out.println("Digite a mensagem: ");
		mensagem = sc.nextLine();
		System.out.println("Digite a chave: ");
		chave = sc.nextInt();

		System.out.println(criptografa(mensagem, chave));
	}

	public static String criptografa(String mensagem, int chave) {
		char[] caractNovo = new char[mensagem.length()];
		
		// ASCII minúsculas: 97(a)-122(z)

		for (int i = 0; i < mensagem.length(); i++) {
			if ((int) (mensagem.charAt(i) + chave) > 122) {
				caractNovo[i] = (char) (((mensagem.charAt(i) + chave) - 122) + 96); 
			} else {
				caractNovo[i] = (char) (mensagem.charAt(i) + chave);
			}
		}
		
		return new String(caractNovo);
	}

}
