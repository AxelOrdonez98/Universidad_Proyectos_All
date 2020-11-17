sueldo = float(input("Ingrese su sueldo actual: "))
años = float(input("Ingrese los años que tiene en la empresa: "))
if sueldo < 500 and años >= 10 :
    aumento = sueldo + (sueldo*.20)
    print("Tiene un aumento del 20%. Sueldo final: " + str(aumento))
elif sueldo < 500 and años <= 10 :
    aumento = sueldo + (sueldo * .05)
    print("Tiene un aumento del 5%. Sueldo final: " + str(aumento))
else :
    print("No cumple requisitos para aumento. Su sueldo es: " + str(sueldo))