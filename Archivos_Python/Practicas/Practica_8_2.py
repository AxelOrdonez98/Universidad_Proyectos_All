estaturas= [] 
promedio = 0
menor = 0
mayor = 0
for x in range(5):
	valor = float(input("Ingrese estatura " + str(x+1) + ": "))
	estaturas.append(valor) 

for x in range(5):
    promedio += estaturas[x]

promedio = promedio / 5 

for x in range(5):
    if estaturas[x] < promedio:
        menor = menor + 1
    else:
        mayor = mayor + 1    

print(estaturas)
print("Promedio: " + str(promedio))
print("Personas mas altas que el promedio: " + str(mayor))
print("Personas mas bajas que el promedio: " + str(menor))