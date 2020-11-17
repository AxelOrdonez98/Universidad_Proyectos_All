nombre = ["Axel", "Carlos", "Tony", "Mauricio", "Leonardo"]
num = len(nombre)
cont = 0
for i in range(0,num) :
    print("Nombres: ", str(nombre[i]))
    if nombre[i].isdigit() <= 5 :
        cont += 1
print("\tCantidad de nombre con 5 oh mas letras: ", str(cont-2))