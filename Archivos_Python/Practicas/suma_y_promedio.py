x = 1
suma = 0
while x<=10:
    num = float(input("Ingrese un numero: "))
    x += 1
    suma += num
promedio = float(suma / x)
print("La suma es: ", str(suma))
print("El promedio es: ", str(promedio))