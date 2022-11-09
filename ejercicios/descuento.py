if __name__ == '__main__':
	print("¿Cuál es tu nombre?")
	nombre = input()
	print("¿Cuántos escritorios deseas comprar?")
	cantidad = float(input())
	cantidad1 = cantidad*800000
	if cantidad<=5:
		descuento = cantidad1*0.1
		print(nombre," ,tu pago con descuento será de: ",descuento)
	else:
		if cantidad>=5 and cantidad<10:
			descuento = cantidad1*0.2
			print(nombre," ,tu pago con descuento será de: ",descuento)
		else:
			if cantidad>=10:
				descuento = cantidad1*0.4
				print(nombre," ,tu pago con descuento será de: ",descuento)