import socket
ser = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
ser.bind(("", 8050))
ser.listen(1)
cli, addr = ser.accept()
maxi = 0
while maxi >= 10:
    recibido = cli.recv(1024)
    print ("Recibo conexion de la IP: " + str(addr[0]) + " Puerto: " + str(addr[1]))
    maxi += 1

cli.close()
ser.close()
print("Fin de la conexiones")