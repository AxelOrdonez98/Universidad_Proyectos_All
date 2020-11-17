def nombre():
    print("\tOscar Axel Ortiz\n\t1er Parcial\n\tTurno Matutino\n\t5.-A\n\tIng. en Software")
nombre()
uno = 0
dos = 1
acum = 0
for i in range(10):
    print(uno)
    acum = uno + dos
    uno = dos
    dos = acum