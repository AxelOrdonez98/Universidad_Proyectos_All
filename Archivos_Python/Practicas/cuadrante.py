x = float(input("Ingrese un coordena en X: "))
y = float(input("Ingrese un coordena en Y: "))
if x > 0 and y > 0 :
    print("La coordenada que ingreso se encuentra en el cuandrante 1")
elif x < 0 and y > 0 :
    print("La coordenada que ingreso se encuentra en el cuadrantre 2")
elif x < 0 and y < 0 :
    print("La coordenada que ingreso se encuentra en el cuadrante 3")
elif x > 0 and y < 0 :
    print("La coordenada que ingreso se encuentra en el cuadrante 4")
else :
    print("La coordenada que ingreso se encuentra en el origen")