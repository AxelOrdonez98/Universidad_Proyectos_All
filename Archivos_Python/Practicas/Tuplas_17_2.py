# -*- coding: utf-8 -*-
"""
Confeccionar un programa con las siguientes funciones:
1)Cargar una lista de 5 enteros.
2)Retornar el mayor y menor valor de la lista mediante una tupla.
Desempaquetar la tupla en el bloque principal y mostrar el mayor y menor
"""
lista=[1,3,5,6,2]
mayor=lista[0]
menor=lista[0]
for x in range(5):
    if lista[x]>mayor:
        mayor=lista[x]
    elif lista[x]<menor:
        menor=lista[x]
        
tupla=(mayor,menor)    
print(tupla)