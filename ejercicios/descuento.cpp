#include <iostream>

int main() {
	float cantidad;
	float cantidad1;
	float descuento;
	float nombre;
	cout << "¿Cuál es tu nombre?" << endl;
	cin >> nombre;
	cout << "¿Cuántos escritorios deseas comprar?" << endl;
	cin >> cantidad;
	cantidad1 = cantidad*800000;
	if (cantidad<=5) {
		descuento = cantidad1*0.1;
		cout << nombre << " ,tu pago con descuento será de: " << descuento << endl;
	} else {
		if (cantidad>=5 && cantidad<10) {
			descuento = cantidad1*0.2;
			cout << nombre << " ,tu pago con descuento será de: " << descuento << endl;
		} else {
			if (cantidad>=10) {
				descuento = cantidad1*0.4;
				cout << nombre << " ,tu pago con descuento será de: " << descuento << endl;
			}
		}
	}
	return 0;
}
