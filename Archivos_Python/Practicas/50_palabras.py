import random
lista = []
primera = []
abc = "abcdefghijklmnpqrsutvwxyz"
auxPal = ""
for i in range(50):
    for j in range(8):
        aux = random.choice(abc)
        auxPal += aux
    lista.append(auxPal)
    auxPal = ""
auxPal = ""
for i in range(len(lista)):
    auxPal = lista[i][0]
    primera.append(auxPal)
    auxPal = ""
primera.sort()
coincidencias = {}
temp = {}
for x in range(50):
    key_temp = primera[x]
    value_temp = 0
    for y in range(50):
        if key_temp == primera[y]:
            value_temp = value_temp + 1
    temp = {
        key_temp: value_temp
    }
    coincidencias.update(temp)
print(lista, "\n")
print(primera, "\n")
print(coincidencias)
