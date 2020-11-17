import random
import string
import os

dire = "C:/Users/solda/Downloads/correo.txt"

def randomString(stringLength = 10):
    letters = string.ascii_lowercase
    return ''.join(random.choice(letters) for i in range(stringLength))

file = open(dire, "w")

for i in range(100):
    file.write("\nCorreo: " + randomString() + "@gmail.com" + os.linesep)
    file.write("\nContra: " + randomString())
    file.write("\nNumero: " + str(i))
    file.write("\n--------------------------------------------------")

file.close()
print("Fin")