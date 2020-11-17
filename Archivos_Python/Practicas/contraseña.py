import random
import string
contraseñas = []
un = "BCDFGHJKLMNÑPQRSTVWXYZ"
do = "bcdfghjklmnñpqrstvwxyz"
tr = "aeiou"
def contra():
    for i in range(20):
        aux = 0
        contr = ""
        for j in range(4):
            if aux == 0:
                mayus = random.choice(un)
                contr += mayus
            else:
                demas = random.choice(do)
                contr += demas
            vocal = random.choice(tr)
            contr += vocal
            aux += 1
    contr += "_"
    num = random.randint(10, 99)
    contr += str(num)
    contraseñas.append(contr)
    print(contr)
    aux = 0
for i in range(20):
    contra()