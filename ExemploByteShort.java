public class ExemploByteShort {

	public static void main(String[] args) {
		byte idade = 127;
		// byte idade = 127; // não compila

		short quantidadeEstoque = 32767; // valor máximo
		short quantidadeEstoque = 32768; // não compila
	}

}