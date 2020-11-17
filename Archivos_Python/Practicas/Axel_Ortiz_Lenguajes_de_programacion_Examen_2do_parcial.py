class Agenda():
    def __init__(self, nombre, edad, direccion):
        self.nombre = nombre
        self.edad = edad
        self.direccion = direccion

    def __str__(self):
        return "{}, {}, {}".format(self.nombre, self.edad, self.direccion)

opc = 1
lista = []
while opc != 0:
    print("Ingresa manualmente todas los campos. Si esta vacio, primero tiene que agregar y despues continuar")
    opc = int(input(
        "\tAgenda\n0) Salir\n1) Añadir\n2) Ver contactos\n3) Buscar\n4) Editar\n-Opcion: "))
    if opc == 1:
        print("\tAñadir Contacto")
        Nom = input("Ingrese el nombre de la persona: ")
        Ed = input("Ingrese el edad de la persona: ")
        D1r = input("Ingrese el direccion de la persona: ")
        lista.append(Agenda(Nom, Ed, D1r))
        print("\t! Contacto agregado con exito ¡")
    elif opc == 2:
        print("\tVer Contacto")
        for i in lista:
            print(i)
    elif opc == 3:
        print("\nBuscar Contacto")
        buscar = input("Ingrese el nombre del contacto: ")
        for i in lista:
            if i.nombre == buscar:
                print("Contacto: ", str(i))
            else:
                print("\n\tEl contacto no esta en la agenda")
    elif opc == 4:
        print("\tEditar Contacto")
        buscar = input("Ingrese el nombre del contacto a modificar: ")
        for i in lista:
            if i.nombre == buscar:
                print("Que desea editar")
                op = int(
                    input("1) Nombre\n2) edad\n3) direccion\n4) Todo\n-Opcion: "))
                if op == 1:
                    auxnombre = input("Ingrese el nuevo nombre: ")
                    i.nombre = auxnombre
                    print("Contacto modificado")
                elif op == 2:
                    auxedad = input("Ingrese el nuevo edad: ")
                    i.edad = auxedad
                    print("Contacto modificado")
                elif op == 3:
                    auxdireccion = input("Ingrese el nuevo direccion: ")
                    i.direccion = direccion
                    print("Contacto modificado")
                elif op == 4:
                    auxnombre = input("Ingrese el nuevo nombre: ")
                    i.nombre = auxnombre
                    auxedad = input("Ingrese el nuevo edad: ")
                    i.edad = auxedad
                    auxdireccion = input("Ingrese el nuevo direccion: ")
                    i.direccion = auxdireccion
                    print("Contacto modificado")
                print("\t! Contacto modificado con exito ¡")
            else:
                print("\n\tEl contacto no esta en la agenda")
#Axel Ordoñez