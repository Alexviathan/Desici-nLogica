if __name__ == '__main__':
	print("Escribe tu nombre")
	nombre = input()
	print("Escribe tu salario por hora")
	salariohora = float(input())
	print("Escribe tus horas trabajadas al mes")
	horario = float(input())
	salariomensual = salariohora*horario
	if salariomensual>450000:
		print("Tu salario mensual es ",salariomensual)
	else:
		print("Tu nombre es",nombre)