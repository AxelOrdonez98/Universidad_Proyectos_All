preguntas = float(input("Ingrese el nuero de preguntas: "))
correctas = float(input("Ingrese el nuero de preguntas contestadas correctamente: "))
porcentaje = ((preguntas * correctas) / preguntas) * 10
if porcentaje >= 90:
    print("Nivel alto en indice de preuntas")
elif porcentaje >= 75 and porcentaje < 90:
    print("Nivel medio en indice de preuntas")
elif porcentaje >= 50 and porcentaje < 75:
    print("Nivel bajo en indice de preuntas")
else:
    print("Fuera de rango")