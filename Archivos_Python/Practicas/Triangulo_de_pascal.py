x = int(input("Ingrese el tamaño del trianguloangulo: "))
for i in range(0, x+1):
    x = 1
    for j in range(0, i+1):
        print(str(x), " ", end = "")
        x = x*(i-j)/(j+1)
    print()