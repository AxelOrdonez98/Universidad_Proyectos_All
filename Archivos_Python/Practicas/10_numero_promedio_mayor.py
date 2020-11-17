x = 1
mayor = 0
menor = 0
while x<=10:
    num = int(input("Ingrese la calificacion de 10 alumnos (1-10): "))
    if num >= 7:
        mayor += 1
    else :
        menor += 1
    x += 1
print("Numero de alumnos con calificacion mayor a 7: ", str(mayor))
print("Numero de alumnos con calificacion menor a 7: ", str(menor))