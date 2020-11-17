calificaciones= [] 
promedio = 0
for x in range(5):
	calificacion = float(input("Ingrese calificacion " + str(x+1) + ": "))
	calificaciones.append(calificacion) 

for x in range(5):
    promedio += calificaciones[x]

promedio = promedio / 5    

print(calificaciones)
print("Promedio: " + str(promedio))