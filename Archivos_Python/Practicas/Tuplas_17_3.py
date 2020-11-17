# -*- coding: utf-8 -*-
"""
 Confeccionar un programa con las siguientes funciones:
1)Cargar el nombre de un empleado y su sueldo. Retornar una tupla con dichos valores
2)Una función que reciba como parámetro dos tuplas con los nombres y sueldos 
    de empleados y muestre el nombre del empleado con sueldo mayor.
En el bloque principal del programa llamar dos veces a la función de carga y
 seguidamente llamar a la función que muestra el nombre de empleado con sueldo mayor
"""
def nombre(nombre, sueldo):
    tupla=(nombre,sueldo)
    return tupla
def fun(tupla1,tupla2):
    nombre=""
    if tupla1[1]>tupla2[1]:
        nombre=tupla1[0]
    elif tupla1[1]<tupla2[1]:
        nombre=tupla2[0]
    return nombre
    
nombre1=input("Digite un nombre: ")
sueldo1=int(input("Digite un sueldo: "))
nombre2=input("Digite un nombre: ")
sueldo2=int(input("Digite un sueldo: "))
print(fun(nombre(nombre1,sueldo1), nombre(nombre2,sueldo2)))