numero1 = int(input("Ingrese un numero positivo de (1 al 99): "))
if numero1 <= 9:
    print("El numero ingrsado tiene un digito: " + str(numero1))
elif numero1 >=10 and numero1 <= 99 :
    print("El numero Ingresado tiene dos digitos: " + str(numero1))
else :
    print("El numero ingresado no cumple con los requisitos: " + str(numero1))