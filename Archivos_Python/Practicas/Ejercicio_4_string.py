nombre1 = input("Ingrese un nombre: ")
nombre2 = input("Ingrese otro nombre: ")
print("----------------------------------------")
print(nombre1)
print(nombre2)
print("----------------------------------------")
aux = ""
aux1 = ""
if  nombre1 >  nombre2:
        aux = nombre2
        aux1 = nombre1
        nombre1 = aux
        print(nombre1)
        print(aux1)
else :
    print(nombre1)
    print(nombre2)
print("----------------------------------------")