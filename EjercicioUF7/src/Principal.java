import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
		//Creamos una Array de bebidas con la lista de bebidas disponibles
		static Bebida[] lista = new Bebida[4];
		//Creamos el ArrayList con el que vamos a trabjar
		static ArrayList<Bebida> pedida = new ArrayList<Bebida>();

	public static void main(String[] args) {
		
		//Propiedades
		int opc = 0;
		float rec = 0;
		Scanner leer = new Scanner(System.in);
		//Indicamos nuestras bebidas disponibles
		lista[0] = new Bebida("Coca Cola", (float)1.30);
		lista[1] = new Bebida("Fanta Naranja", (float)1.20);
		lista[2] = new Bebida("Fanta Limón", (float)1.20);
		lista[3] = new Bebida("Agua", (float)1.00);
		
		//Bucle principal
		do {
			
			menu();
			opc = leer.nextInt();
			
			switch (opc) {
				case 1:
					venta(opc);
					break;
				
				case 2:
					venta(opc);
					break;
				
				case 3:
					venta(opc);
					break;
				
				case 4:
					venta(opc);
					break;
					
				case 5:
					System.out.println("HASTA PRONTO");
					System.out.println("INFORME DE VENTAS");
					break;
					
				default:
					System.out.println("OPCIÓN INCORRECTA");
			}	
			
		} while (opc != 5);
		
		leer.close();
		
		//Mostramos contenido del ArrayList y calculamos recaudación
		for (Bebida b : pedida) {
			System.out.println(b.toString());
			rec += b.getPrecio();
		}
		
		System.out.println("RECAUDACIÓN: " + rec);

	}
	
	//Metodos
	public static void menu() {
		System.out.println("MÁQUINA DE BEBIDAS");
		System.out.println("---------------------------");
		System.out.println("1. Coca Cola ------ 1,30 €");
		System.out.println("2. Fanta Naranja -- 1,20 €");
		System.out.println("3. Fanta Limón ---- 1,20 €");
		System.out.println("4. Agua ----------- 1,00 €");
		System.out.println("5. Apagar máquina");
		System.out.println("---------------------------");
		System.out.println("¿Que opción elige?");
	}
	
	//Metodo venta
	//Metemos la bebida vendida en el ArrayList
	public static void venta(int opc) {
		pedida.add(lista[opc-1]);
		System.out.println("Su " + lista[opc-1].getBebida() + " Gracias");
	}

}
