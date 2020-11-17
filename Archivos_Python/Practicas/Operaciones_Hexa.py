segmento = [0x0950, 0x0CD1, 0x08F1,0x09DE, 0xA179, 0xB844, 0x5D37]
desplazamiento = [0x0100, 0x02E0, 0x0100, 0x0250, 0x0200, 0x0100, 0x02E0]
for i in range(7) :
    ajuste = segmento[i] * 10
    print("-----------------------------------------------------------------------------")
    print("Segmento:\t\t\t", hex(segmento[i]))
    print("Desplazamiento:\t\t\t", hex(desplazamiento[i]))
    print("Valor de segmento ajustado:\t", hex(ajuste))
    print("Se suma el desplazamiento:\t", hex(desplazamiento[i]))
    direc = ajuste + desplazamiento[i]
    print("Direccion lineal:\t\t", hex(direc))
print("-----------------------------------------------------------------------------")
print("Adios")