class Agenda():
    def __init__(self, nombre, telefono, email):
        self.nombre = nombre
        self.telefono = telefono
        self.email = email

    def __str__(self):
        return "{}, {}, {}".format(self.nombre, self.telefono, self.email)


opc = 1
lista = []
while opc != 0:
    opc = int(input(
        "\tAgenda\n0) Salir\n1) Añadir\n2) Ver contactos\n3) Buscar\n4) Editar\n-Opcion: "))
    if opc == 1:
        print("\tAñadir Contacto")
        Nom = input("Ingrese el nombre de la persona: ")
        Tel = input("Ingrese el telefono de la persona: ")
        Ema = input("Ingrese el email de la persona: ")
        lista.append(Agenda(Nom, Tel, Ema))
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
                    input("1) Nombre\n2) Telefono\n3) Email\n4) Todo\n-Opcion: "))
                if op == 1:
                    auxnombre = input("Ingrese el nuevo nombre: ")
                    i.nombre = auxnombre
                    print("Contacto modificado")
                elif op == 2:
                    auxtel = input("Ingrese el nuevo telefono: ")
                    i.telefono = auxtel
                    print("Contacto modificado")
                elif op == 3:
                    auxemail = input("Ingrese el nuevo email: ")
                    i.email = email
                    print("Contacto modificado")
                elif op == 4:
                    auxnombre = input("Ingrese el nuevo nombre: ")
                    i.nombre = auxnombre
                    auxtel = input("Ingrese el nuevo telefono: ")
                    i.telefono = auxtel
                    auxemail = input("Ingrese el nuevo email: ")
                    i.email = auxemail
                    print("Contacto modificado")
                print("\t! Contacto modificado con exito ¡")
            else:
                print("\n\tEl contacto no esta en la agenda")
