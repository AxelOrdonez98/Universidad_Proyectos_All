host = 'localhost'
port = 8050
import socket
obj = socket.socket()
obj.connect((host, port))
print("Conectado al servidor")
while True:
    mens = print("Mensaje desde Cliente a Servidor >> ")
    obj.send(mens)
obj.close()
print("Conexión cerrada")