numeros = [99, 20, 101, 101, 42, 2048, 15, 102]
maxi = 0
conta = 0
for i in range(8):
    maxi = numeros[i]
    print("Nuemro de lista: ", str(numeros[i]))
    if maxi > 100 :
        conta += 1
print("\tNumero mayores a 100: ", str(conta))