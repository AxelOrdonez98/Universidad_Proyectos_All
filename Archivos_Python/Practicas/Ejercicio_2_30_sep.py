estatura = [1.78, 1.62, 2.17, 1.79, .30]
acum = 0
altas = 0
bajas = 0
promedio = 0.1
for i in range(5):
    acum =+ estatura[i]
promedio = acum / 5
for i in range(5):
    if estatura[i] > promedio:
        altas += 1
    elif estatura[i] < promedio:
        bajas =+ 1
for i in range(5):
    print("Estaturas: ", str(estatura[i]))
print("\tEl promedio es estatura es:", str(promedio))
print("Numero de personas mas altas que el promedio: ", str(altas))
print("Numero de personas mas bajas que el promedio: ", str(bajas))