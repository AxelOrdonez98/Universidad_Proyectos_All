def cargar_Sueldos():
    empleado = []
    totalCobrado = 0
    for x in range(5):
        nomEmpleado = input("Ingresar nombre de empleado: ")
        sueldo = float(input("Ingrese el primer sueldo: "))
        sueldo2 = float(input("Ingrese e segundo sueldo: "))
        sueldo3 = float(input("Ingrese el tercer sueldo: "))
        totalCobrado = sueldo + sueldo2+sueldo3
        empleado.append((nomEmpleado, sueldo, sueldo2, sueldo3))
    print("Total de sueldo pago de empleados: ", str(totalCobrado))
    return empleado


def imprimir(empleado):
    print("\tEmpleado: y sueldos")
    for x in range(len(empleado)):
        print(empleado[x][0], empleado[x][1])
        print(empleado[x][1], empleado[x][2])
        print(empleado[x][2], empleado[x][3])


def mayor_Ganancia(empleado):
    pos = 0
    for x in range(1, len(empleado)):
        if empleado[x][1] > empleado[pos][1]:
            pos = x
    print("Mayor ganancia:", empleado[pos][0])

empleado = cargar_Sueldos()
imprimir(empleado)
mayor_Ganancia(empleado)