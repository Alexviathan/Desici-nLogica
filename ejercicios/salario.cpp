#include <iostream>

int main() {
	float horario;
	float nombre;
	float salariohora;
	float salariomensual;
	cout << "Escribe tu nombre" << endl;
	cin >> nombre;
	cout << "Escribe tu salario por hora" << endl;
	cin >> salariohora;
	cout << "Escribe tus horas trabajadas al mes" << endl;
	cin >> horario;
	salariomensual = salariohora*horario;
	if (salariomensual>450000) {
		cout << "Tu salario mensual es " << salariomensual << endl;
	} else {
		cout << "Tu nombre es" << nombre << endl;
	}
	return 0;
}
