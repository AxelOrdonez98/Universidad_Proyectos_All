n = int(input("Ingrese el numero de empleados: "))
x = 1
sueldo = 0
mayor = 0
menor = 0
importe = 0
while x <= n :
    gasto = int(input("Ingrese el sueldo del empleado: "))
    if gasto < 1000:
        menor += 1
    else :
        mayor += 1
    importe += gasto
    x += 1
print("-En los sueldos de [500-900] a un total de empleados de: ", str(menor))
print("-En los sueldos de [1000-1500] a un total de empleados de: ", str(mayor))
print("-La empresa gasta un total de: ", str(importe),"en un total de empleados de: ", str(n))