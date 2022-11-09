import java.io.*;

public class salario {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double horario;
		String nombre;
		double salariohora;
		double salariomensual;
		System.out.println("Escribe tu nombre");
		nombre = bufEntrada.readLine();
		System.out.println("Escribe tu salario por hora");
		salariohora = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Escribe tus horas trabajadas al mes");
		horario = Double.parseDouble(bufEntrada.readLine());
		salariomensual = salariohora*horario;
		if (salariomensual>450000) {
			System.out.println("Tu salario mensual es "+salariomensual);
		} else {
			System.out.println("Tu nombre es"+nombre);
		}
	}


}

