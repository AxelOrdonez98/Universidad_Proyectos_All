def nombre():
    print("\tOscar Axel Ortiz\n\t1er Parcial\n\tTurno Matutino\n\t5.-A\n\tIng. en Software")
nombre()
abecedario = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","w","x","y","z"]
aux = 3
acum = []
print("Alfabeto: ",abecedario)
for i in range(len(abecedario)):
    res = abecedario[i]
    if res != "b" or res != "d" or res != "g" or res != "j" or res != "m" or res != "p" or res != "s" or res != "x":
        acum += res
print("Alfabeto sin multiplo de 3: ", acum)
