import os
import string
def menu():
    print("0) Salir\n1) Buscar telefono\n2) Agregar teléfono\n3) Eliminar telefono\n4) Crear archivo")
    opc = input('Introduzca el número de la opción deseada: ')
    return opc

def crear_archivo_agenda(archivo):
    if os.path.isfile(archivo):
        respuesta = input('El fichero ' + archivo + ' ya existe. Quieres recrearlo?\nRespuesta [1) Si - 2) No]: ')
        if respuesta == "2": 
            return '\nNo se ha creado el archivo.\n'
    f = open(archivo, 'w')
    f.close()
    return '\nSe ha creado el archivo. Con el nombre: ' + archivo + '\n'

def agregar_telefono(archivo, persona, telf):
    try: 
        f = open(archivo, 'a')
    except FileNotFoundError:
        return('El archivo: ' + archivo + ' no existe\n')
    else:
        f.write(persona + ',' + telf + '\n')
        f.close()
        return('El teléfono se a agregado.\n')

def eleiminar_telefono(archivo, persona):
    try: 
        f = open(archivo, 'r')
    except FileNotFoundError:
        return('El archivo: ' + archivo + ' no existe\n')
    else:
        agenda = f.readlines()
        f.close()
        agenda = dict([tuple(line.split(',')) for line in agenda])
        if persona in agenda:
            del agenda[persona]
            f = open(archivo, 'w')
            for name, telf in agenda.items():
                f.write(name + ',' + telf)
            f.close()
            return ('¡El personae se ha borrado!\n')
        else:
            return('El archivo: ' + archivo + ' no existe\n')

def telefono(archivo, persona):
    try:
        f = open(archivo, 'r')
    except FileNotFoundError:
        return('El archivo: ' + archivo + ' no existe\n')
    else:
        agenda = f.readlines()
        f.close()
        agenda = dict([tuple(line.split(',')) for line in agenda])
        if persona in agenda:
            return agenda[persona]
        else:
            return('El archivo: ' + archivo + ' no existe\n')

def agenda():
    archivo = 'Agenda_2020.txt' 
    while True:
        opc = menu()
        if opc == '1':
            name = input('Introduce el nombre de la persona: ')
            print(telefono(archivo, name))
        elif opc == '2':
            name = input('Introduce el nombre de la persona: ')
            telf = input('Introduce el teléfono de la persona: ')
            print(agregar_telefono(archivo, name, telf))
        elif opc == '3':
            name = input('Introduce el nombre de la persona: ')
            print(eleiminar_telefono(archivo, name))
        elif opc == '4':
            print(crear_archivo_agenda(archivo))
        else:
            break
    return

agenda()