x = 10
def suma(i, j):
    result = i+j
    bin1 = bin(result)
    print("El resultado de la suma es: ", str(bin1))

def resta(i, j):
    result = i-j
    bin1 = bin(result)
    print("El resultado de la resta es: ", str(bin1))

def multiplicacion(i, j):
    result = i*j
    bin1 = bin(result)
    print("El resultado de la multiplicacion es: ", str(bin1))

def division(i, j):
    result = 0
    if j != 0:
        result = i/j
        print("El resultado de la division es: ", int(bin(int(result))[2:]))
    else:
        print("No se puede divir entre 0")

while x != 0:
    num1 = input("Ingrese el primer numero: ")
    num2 = input("Ingrese el segundo numero: ")
    num1 = int(str(num1), 2)
    num2 = int(str(num2), 2)
    x = int(input("0) Salir\n1) Suma\n2) Restan\n3) Multiplicacion\n4) Division\nOpcion: "))
    if x == 0:
        print("Adios")
    elif x == 1:
        suma(num1, num2)
    elif x == 2:
        resta(num1, num2)
    elif x == 3:
        multiplicacion(num1, num2)
    elif x == 4:
        division(num1, num2)
    else:
        print("Opcion invalida")