def notas():
    materia = []
    notas = []
    for i in range(5):
        aux = input("Ingrese una asignatura: ")
        materia.append(aux)
    for i in materia:
        nota = int(input("Calificacion obtenida en " + i + ": "))
        notas.append(nota)
    print("\tMaterias a repetir")
    for i in range(len(materia)):
        if notas[i] < 6:
            print("Materia a repetir: ",materia[i])
            print("Calificacion: ", str(notas[i]))
notas()