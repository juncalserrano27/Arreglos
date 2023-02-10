
public class ProgramaArreglos {

	public static void main(String[] args) {
		int [] enteros=new int[15];
		String[] nombres=new String[20];
		Estudiante[] estudiantes=new Estudiante[100];
		enteros[10]=5;
		nombres[0]="Francisco";
		estudiantes[1]=new Estudiante();
		estudiantes[1].cambiarId(178054);
		estudiantes[0]=new Estudiante();
		estudiantes[0].cambiarId(178055);
		ejerciciosArreglos uno=new ejerciciosArreglos();
		uno.eliminarValor(enteros);
	}

}
