package calculadora;
import java.util.Scanner;
public class Principal {

		
		

		    public static void main(String[] args) {

		        System.out.println("Selecciona la operaci�n que prefieras realizar: ");
		        System.out.println("1. Sumar");
		        System.out.println("2. Restar");
		        System.out.println("3. Multiplicar");
		        System.out.println("4. Dividir (divisi�n entera)");
		        System.out.println("5. Dividir (divisi�n con decimales)");

		        int opcion = leerEnteroEntrada();

		         int num1,num2; 

		        switch (opcion) {
		            case 1: 
		            
		                    break;
		            case 2: System.out.println("Diga primer numero de resta");
		            
		                    System.out.println("Diga segundo numero de entrada");
		                    break;
		            case 3: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su producto.
		                    break;
		            case 4: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su divisi�n entera.
		                    break;
		            case 5: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su divisi�n con decimales.
		                    break;

		        }

		    }

		    public static int suma(int a, int b) {
		        return a + b;
		    }

		    public static int resta(int a, int b) {
		        return a - b;
		    }

		    public static int multiplicacion(int a, int b) {
		        return a * b;
		    }

		    public static int divisionEntera(int a, int b) {
		        return a / b;
		    }

		    public static double divisionConDecimales(int a, int b) {
		        return a / (b * 1.0);
		    }

		    public static int leerEnteroEntrada() {
		        try {
		            Scanner sc = new Scanner(System.in);
		            int result = Integer.parseInt(sc.next());
		            sc.close();
		            return result;
		        } catch (NumberFormatException ex) {
		            System.err.println("Lo que has introducido no es un n�mero entero!");
		            System.exit(1);
		            return -1;
		        }

		    }

		

	}


