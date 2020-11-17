sueldo = [1203.55, 1890.23, 1785.03, 1456.32, 1587.032]
acum = 0
for i in range(5): 
    acum += sueldo[i]
    print("Sueldo del empleado: ", str(sueldo[i]))
prom = acum / len(sueldo)
print("\tPromedio de sueldo: ", str(prom))