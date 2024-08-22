package dominio;
import java.util.Scanner;

public class Calculadora {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Integer a, b, opcion, resultado;

		do{
			opcion = ingresarInteger("**CALCULADORA**\n1 SUMA\n2 RESTA\n3 MULTIPLICACION\n4 DIVISION\nIngrese su operación:");
		} while(opcion < 1 || opcion > 4);

		a = ingresarInteger("Ingrese el primer numero");
		b = ingresarInteger("Ingrese el segundo numero");

		resultado = calculadora(opcion, a, b);

		mostrarPorPantalla("El resultado es " + resultado.toString());
	
	}
	
		private static Integer calculadora(Integer opcion, Integer valor1, Integer valor2) {
			
			Integer resultado = null;
			
			switch (opcion) {
			case 1:
				resultado = operacionSumar(valor1, valor2);
				break;
			case 2: 
				resultado = operacionRestar(valor1, valor2);
				break;
			case 3:
				resultado = operacionMultiplicar(valor1, valor2);
				break;
			case 4:
				resultado = operacionDividir(valor1, valor2);
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			return resultado;
		}
	
		private static Integer ingresarInteger(String mensaje) {
			mostrarPorPantalla(mensaje);
			return teclado.nextInt();
		}
	
		private static void mostrarPorPantalla(String mensaje) {
			System.out.println(mensaje);
		}
		
		private static Integer operacionSumar(Integer valor1, Integer valor2) {
			return valor1 + valor2;
		}
	
		private static Integer operacionRestar(Integer valor1, Integer valor2) {
			return valor1 - valor2;
		}
		
		private static Integer operacionMultiplicar(Integer valor1, Integer valor2) {
			return valor1 * valor2;
		}
		
		private static Integer operacionDividir(Integer valor1, Integer valor2) {
			return valor1 / valor2;
		}
	}
