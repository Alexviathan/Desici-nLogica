
#include<iostream>
using namespace std;
#define string


int main() {
	SIN_TIPO entero;
	SIN_TIPO nivelacademico;
	float nota1;
	float nota2;
	float nota3;
	float nota4;
	float nota5;
	float nota6;
	string posgrado;
	string pregrado;
	string pregrado;
	float promedio;
	float valor1;
	float valor2;
	promedio = entero;
	cout << "Ingresa tu nivel academico: pregrado o posgrado" << endl;
	cin >> nivelacademico;
	cout << "¿Cuál es tu promedio?" << endl;
	cin >> promedio;
	valor1 = 50000;
	valor2 = 300000;
	if (pregrado==nivelacademico || pregrado==nivelacademico || pregado==nivelacademico) {
		if (promedio>=4.5) {
			nota1 = valor1*0.75*(28);
			cout << "El valor de tu credito es de: " << nota1 << "solo cursarás 28 creditos" << endl;
		} else {
			if (promedio>=4.0 && promedio<4.5) {
				nota2 = valor1*0.9*(25);
				cout << "El valor de tu credito es de: " << nota2 << "solo cursaras 25 creditos" << endl;
			} else {
				if (promedio>=3.5 && promedio<4.0) {
					nota3 = valor1*(20);
					cout << "El valor de tu credito es: " << nota3 << "solo cursaras 20 creditos" << endl;
				} else {
					if (promedio>=2.5 && promedio<3.0) {
						nota4 = valor1*(15);
						cout << "El  valor de tu credito es: " << nota4 << "solo cursaras 15 creditos" << endl;
					} else {
						if (promedio<25) {
							cout << "No podra matricularse" << endl;
						}
					}
				}
			}
		}
	}
	if (posgrado==nivelacademico || posgrado==nivelacademico || posgrado==nivelacademico) {
		if (promedio>=4.5) {
			nota5 = valor2*0.8*(20);
			cout << "El valor de tu credito es: " << nota5 << "Solo cursaras 20 creditos" << endl;
		} else {
			if (promedio<4.5) {
				nota6 = valor2*(10);
				cout << "El valor de tu credito es: " << nota6 << "Solo cursares 10 creditos" << endl;
			} else {
				cout << "No es un valor valido" << endl;
			}
		}
	} else {
		cout << "No es valor valido" << endl;
	}
	return 0;
}

// profe no entiendo por que no me corre correctamente, te lo envio asi y espero tu retroalimentacion