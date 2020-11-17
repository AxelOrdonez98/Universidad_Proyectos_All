import random
lado1 = random.randint(1, 3)
lado2 = random.randint(1, 3)
lado3 = random.randint(1, 3)
print("Lado 1: ", str(lado1))
print("Lado 2: ", str(lado2))
print("Lado 3: ", str(lado3))
if lado1 == lado2 and lado1 == lado3 and lado2 == lado3:
    print("\tEl trinagulo es equilatero")
elif lado1 == lado2 or lado2 == lado3 or lado1 == lado3:
    print("\tEl trinagulo es isosel")
else:
    print("\tEl trinagulo es escaleno")