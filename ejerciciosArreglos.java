import java.util.Scanner;
public class ejerciciosArreglos {
	Scanner scan= new Scanner (System.in);
	public ejerciciosArreglos() {
		
	}
	public void imprimeArregloInt(int arreglo[], int size) {
		int i;
		for(i=0; i<size; i++) {
			System.out.println(arreglo[i]);
		}	
	}
	public void imprimeArregloString(String arreglo[], int size) {
		int i;
		for(i=0; i<size; i++) {
			System.out.println(arreglo[i]);
		}	
	}
	public void buscarValorInt(int arreglo[]) {
		int i; 
		int size=15;
		System.out.println("Escriba el valor entero que desea buscar:");
		int valor=scan.nextInt();
		for(i=0;i<size; i++) {
			if (arreglo[i]==valor) {
				System.out.println("El valor se encuentra en la posición "+i+"");
				System.exit(0);
			}else {
				continue;
			}System.out.println("El numero no se encuentra");
		}
		
	}
	public void buscarValorString(String arreglo[], String nombre) {
		int i;
		int size=20;
		for(i=0;i<size; i++) {
			if (arreglo[i]==nombre) {
				System.out.println("El nombre se encuentra en la posición "+i+"");
				System.exit(0);
			}else {
				continue;
			}System.out.println("El nombre no se encuentra");
			
		}
	}
	public void buscarEstudiante(Estudiante arreglo[],int ID) {
		int i;
		int size=100;
		for(i=0;i<size; i++) {
			if (arreglo[i].idEstudiante()==ID) {
				System.out.println("El estudiante con ese ID se encuentra en la posición "+i+"");
				System.exit(0);
			}else {
				continue;
			}System.out.println("El estudiante no se encuentra");
			
		}
	
	}
	public void eliminarValor(int arreglo[]) {
		int i;
		int j;
		int size=15;
		System.out.println("Escriba el valor entero que desea eliminar:");
		int valor=scan.nextInt();
		for(i=0;i<size; i++) {
			if (arreglo[i]==valor) {
				while(i<size) {
					arreglo[i]=arreglo[1+1];
					i++;
				}for(i=0;i<size;i++) {
					System.out.println(arreglo[i]);
				}
				System.exit(0);
				
			}else {
				continue;
			}System.out.println("El numero no se encuentra");
		}
	}
}
