diccionario = {"hi": "hola", "bye": "adios", "table": "mesa", "chesee": "queso", "heard": "corazon",
               "shirt": "camisa", "floor": "piso", "hair": "cabello", "nose": "nariz", "wall": "pared"}
seguir = 1
buscar = ""

def imprimir(diccionario):
    for palabra in diccionario:
        print("-",palabra," -", diccionario[palabra])

def consula():
    buscar = input("Ingrese la palabra a buscar: ")
    existe = diccionario.get(buscar)
    if existe:
        print(diccionario.get(buscar))
    else:
        opc = int(
            input("\tLa pabra que buscar no existe, desea agrgarla\n1) Agregar\n2) Salir\nOpcion: "))
        if opc == 1:
            ingles = input("Palabra en ingles: ")
            traduccion = input("traduccion en español: ")
            diccionario[ingles] = traduccion
            print("\tLa palabra fue agregada con exito")
        else:
            print("\tAdios")

while seguir != 0:
    seguir = int(input(
        "\tSeleecione una opcion\n0) Salir\n1) Imprimir diccionario\n2) Cosulta\nOpcion: "))
    if seguir == 1:
        imprimir(diccionario)
    elif seguir == 2:
        consula()