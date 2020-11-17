import re
def buscar(pais):
    try:
        f = open("PIBLatinoameria.txt", "r")
        for line in f:
            if re.match(pais, line):
                print("\n" + line)
    except:
        print("el archivono existe")
letra = input("Ingrese la letra a buscar (Solo en mayusculas) : ")
buscar(letra)
