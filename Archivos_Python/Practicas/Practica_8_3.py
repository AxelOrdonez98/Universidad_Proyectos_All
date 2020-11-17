manana = []
noche = []

print("sueldo turno por la mañana")
for x in range(5):
    valor = float(input("Ingrese sueldo " + str(x+1) + ": "))
    manana.append(valor)

print("sueldo turno por la noche")
for x in range(5):
    valor = float(input("Ingrese sueldo " + str(x+1) + ": "))
    noche.append(valor)

print("- sueldos turno por la mañana -")    
print(manana)

print("- sueldos turno por la noche -")    
print(noche)