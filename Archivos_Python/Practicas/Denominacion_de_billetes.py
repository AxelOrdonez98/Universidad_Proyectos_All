from random import seed
from random import randint
numero = randint(1, 100000)/4
aux = numero
compar = numero
suma = 0.0
print("\tCantidad: ", str(numero))
tipos = (
    (1000, "billete"),
    (500, "billete"),
    (200, "billete"),
    (100, "billete"),
    (50, "billete"),
    (20, "billete"),
    (10, "moneda"),
    (5, "moneda"),
    (2, "moneda"),
    (1, "moneda"),
    (.5, ".5 centavos"),
    (.2, ".2 centavos"),
    (.1, ".1 centavos")
)
for tipo in tipos:
    valor = tipo[0]
    descripcion = tipo[1]

    def s(valor, text):
        return valor > 1 and text or text

    print("%d %s de %d" % ((numero / valor), s((numero / valor), descripcion), valor))
    numero = numero % valor


print("\tComparacion:")
round(compar , 1)
print(str(compar))