palabra = input("Ingresa una cadena:")
aux = "".join(palabra.split()).lower()
abc = ["a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p","q","r","s","t","w","x","y","z"]
num = ["0","1","2","3","4","5","6","7","8","9"]
letras = ""
numeros = ""
caracter = ""
for i in range(len(aux)):
    if aux[i] in abc:
        letras += aux[i]
    elif aux[i] in num:
        numeros += aux[i]
    elif aux[i] != abc and aux[i] != num:
        caracter += aux[i]
print("\nLas letras son: ", letras)
print("Los numeros son: ", numeros)
print("Los caracteres son: ", caracter)