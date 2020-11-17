def numerosEnteros(b = []):
    con = aux
    a = [9,6,7]
    if con == 0:
        for i in range(3):
            print("Numero: ", a[i])
        b = sorted(a)
        return print("Numero acomodados: ", str(b))
    else:
        n1= input("Ingrese un numero: ")
        n2= input("Ingrese un numero: ")
        n3= input("Ingrese un numero: ")
        a = [n1, n2, n3]
        b = sorted(a)
        return print("Numero acomodados: ", str(b))
aux = 0
numerosEnteros()
aux += 1
numerosEnteros()