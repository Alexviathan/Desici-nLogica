
import java.io.*;

public class universidad {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String entero;
		String nivelacademico;
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota5;
		double nota6;
		String posgrado;
		String pregado;
		String pregrado;
		double promedio;
		double valor1;
		double valor2;
		promedio = entero;
		System.out.println("Ingresa tu nivel academico: pregrado o posgrado");
		nivelacademico = bufEntrada.readLine();
		System.out.println("¿Cual es tu promedio?");
		promedio = bufEntrada.readLine();
		valor1 = 50000;
		valor2 = 300000;
		if (pregrado==nivelacademico || pregrado==nivelacademico || pregado==nivelacademico) {
			if (promedio>=4.5) {
				nota1 = valor1*0.75*(28);
				System.out.println("El valor de tu credito es de: "+nota1+"solo cursaras 28 creditos");
			} else {
				if (promedio>=4.0 && promedio<4.5) {
					nota2 = valor1*0.9*(25);
					System.out.println("El valor de tu credito es de: "+nota2+"solo cursaras 25 creditos");
				} else {
					if (promedio>=3.5 && promedio<4.0) {
						nota3 = valor1*(20);
						System.out.println("El valor de tu credito es: "+nota3+"solo cursaras 20 creditos");
					} else {
						if (promedio>=2.5 && promedio<3.0) {
							nota4 = valor1*(15);
							System.out.println("El  valor de tu credito es: "+nota4+"solo cursaras 15 creditos");
						} else {
							if (promedio<25) {
								System.out.println("No podra matricularse");
							}
						}
					}
				}
			}
		}
		if (posgrado==nivelacademico || posgrado==nivelacademico || posgrado==nivelacademico) {
			if (promedio>=4.5) {
				nota5 = valor2*0.8*(20);
				System.out.println("El valor de tu credito es: "+nota5+"Solo cursaras 20 creditos");
			} else {
				if (promedio<4.5) {
					nota6 = valor2*(10);
					System.out.println("El valor de tu credito es: "+nota6+"Solo cursaras 10 creditos");
				} else {
					System.out.println("No es un valor valido");
				}
			}
		} else {
			System.out.println("No es valor valido");
		}
	}

	// profe no entiendo por que no me corre correctamente, te lo envio asi y espero tu retroalimentacion

}

