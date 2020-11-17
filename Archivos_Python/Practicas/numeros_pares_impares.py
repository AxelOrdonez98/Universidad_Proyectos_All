n = int(input("Ingrese un un maximo: "))
x = 1
par = 0
impar = 0
while x <= n :
    valor = int(input("Ingrese un valor: "))
    if valor%2 == 0:
        par += 1
    else :
        impar +=1
    x += 1
print("La cantidad de numeros pares es: ", str(par))
print("La canidad de numeros impares es: ", str(impar))