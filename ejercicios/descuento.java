import java.io.*;

public class escritorios {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidad;
		double cantidad1;
		double descuento;
		String nombre;
		System.out.println("¿Cuál es tu nombre?");
		nombre = bufEntrada.readLine();
		System.out.println("¿Cuántos escritorios deseas comprar?");
		cantidad = Double.parseDouble(bufEntrada.readLine());
		cantidad1 = cantidad*800000;
		if (cantidad<=5) {
			descuento = cantidad1*0.1;
			System.out.println(nombre+" ,tu pago con descuento será de: "+descuento);
		} else {
			if (cantidad>=5 && cantidad<10) {
				descuento = cantidad1*0.2;
				System.out.println(nombre+" ,tu pago con descuento será de: "+descuento);
			} else {
				if (cantidad>=10) {
					descuento = cantidad1*0.4;
					System.out.println(nombre+" ,tu pago con descuento será de: "+descuento);
				}
			}
		}
	}


}