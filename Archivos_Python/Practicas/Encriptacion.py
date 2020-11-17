print("\tCodigo Murcielago")
x = int(input("0) Salir\n1) Encriptar\n2) Desencriptar\nOpcion: "))
murcielago = ["m", "u", "r", "c", "i", "e", "l", "a", "g", "o"]
salida = ""
palabra = ""
while (x != 0):
    if x == 2 and palabra == "":
        print("\n\tIngrese una palabra antes de desencriptar")
    if x == 1:
        palabra = input("Escriba una oracion: ").lower()
        for i in range(len(palabra)):
            if palabra[i] in murcielago:
                salida += str(murcielago.index(palabra[i]))
            else:
                salida += palabra[i]
    if x == 2 and palabra != "":
        for i in range(len(palabra)):
            if palabra[i].isdigit():
                salida += murcielago[int(palabra[i])]
            else:
                salida += palabra[i]
    print("\t", salida)
    salida = ""
    x = int(input("0) Salir\n1) Encriptar\n2) Desencriptar\nOpcion: "))
print("Adios")