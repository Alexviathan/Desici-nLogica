if __name__ == '__main__':
	promedio = entero
	print("Ingresa tu nivel academico: pregrado o posgrado")
	nivelacademico = input()
	print("¿Cual es tu promedio?")
	promedio = input()
	valor1 = 50000
	valor2 = 300000
	if pregrado==nivelacademico or pregrado==nivelacademico or pregado==nivelacademico:
		if promedio>=4.5:
			nota1 = valor1*0.75*(28)
			print("El valor de tu credito es de: ",nota1,"solo cursaras 28 creditos")
		else:
			if promedio>=4.0 and promedio<4.5:
				nota2 = valor1*0.9*(25)
				print("El valor de tu credito es de: ",nota2,"solo cursaras 25 creditos")
			else:
				if promedio>=3.5 and promedio<4.0:
					nota3 = valor1*(20)
					print("El valor de tu credito es: ",nota3,"solo cursaras 20 creditos")
				else:
					if promedio>=2.5 and promedio<3.0:
						nota4 = valor1*(15)
						print("El  valor de tu credito es: ",nota4,"solo cursaras 15 creditos")
					else:
						if promedio<25:
							print("No podra matricularse")
	if posgrado==nivelacademico or posgrado==nivelacademico or posgrado==nivelacademico:
		if promedio>=4.5:
			nota5 = valor2*0.8*(20)
			print("El valor de tu credito es: ",nota5,"Solo cursaras 20 creditos")
		else:
			if promedio<4.5:
				nota6 = valor2*(10)
				print("El valor de tu credito es: ",nota6,"Solo cursaras 10 creditos")
			else:
				print("No es un valor valido")
	else:
		print("No es valor valido")

# profe no entiendo por que no me corre correctamente, te lo envio asi y espero tu retroalimentacion
