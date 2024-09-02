package calculadora_java;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Calculadora");
		
		try {
		
		Calculos calculadora = new Calculos();
		
		
		} catch (Exception erro) {
			System.out.println("Um dos valores digitados não é um número.");
		}
		
		System.out.println("'Fim'.");	
	}

}
