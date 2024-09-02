package calculadora_java;

import java.util.Scanner;

public class Calculos {
	
	Scanner teclado=new Scanner(System.in);
	float valor1=0, valor2=0, resultado=0;
	String operacao;
						
		public Calculos () {
		setValor1();
		setOperacao();
		setValor2();
		setResultado(resultado);
		}
			
		
		public float getValor1() {
		return valor1;
		}
		
		
	public void setValor1() {
		System.out.println("Digite o valor 1: ");
		this.valor1 = teclado.nextFloat();	
		}

	public String getOperacao()
	{
		return operacao;
	}
	
	public void setOperacao() {
		System.out.println("Digite a operacao: ");
		System.out.println(" + soma");
		System.out.println(" - subtracao");
		System.out.println(" * multiplicacao");
		System.out.println(" / divisão");
		operacao=teclado.next();
	}
	
	public float getValor2() {
		return valor2;
		}
	
	public void setValor2() {
	
		System.out.println("Digite o valor 2: ");
		this.valor2 = teclado.nextFloat();
		}

	
	public float getResultado() {
		return resultado; 
	}

   	public void setResultado(float resultado) {
   		
   		try{
   			switch (operacao) {
   		
   		
   		case "+":
   			resultado = valor1 + valor2;
   			System.out.println("Resultado: " + resultado);
   			break;
   		case "-":
   			resultado = valor1 - valor2;
   			System.out.println("Resultado: " + resultado);
   			break;
   		case "*":
   			resultado = valor1 * valor2;
   			System.out.println("Resultado: " + resultado);
   			break;
   		case "/":
   			if (valor2 ==0)
   			{
   				System.out.println("Não é possível dividir por 0");
   			}
   			else {
   				resultado = valor1 / valor2;
   				System.out.println("Resultado: " + resultado);
   				
   			}
   			this.resultado = resultado;
   		
   			}
   		}
   			catch (Exception erro){
   	System.out.println("Você não digitou um valor válido. Digite um valor numérico.");}  		
   	
   		}
   
	
   	
   	public void imprimirResultado()
   	{
   		
   		System.out.println("Resultado: " + getValor1() +getOperacao() +getValor2() + "=" +getResultado());
   		   		
   		   	}
   	
}


	
	
	
		

