precio = [100, 789, 20, 78, 63]
producto = ["carne","amburgruesas","buebito","tony","aguacate"]
auxPrais = 0
auxPro = ""
y = 0
var = 1
#for i in range(5):
  #  nomPro = input("Ingrese el nombre del producto: ")
   ## producto.append(nomPro)
    #prais = float(input("Ingrese el precio del preducto: "))
    #precio.append(prais)
for x in range(5):
    for y in range(4-y):
        if precio[x] < precio[x+var]:
            auxPrais = precio[x]
            precio[x] = precio [x+var]
            precio[x+var] = auxPrais
            producto[x] = producto[x+var]
            producto[x+var] = auxPro
for a in range(5):
    print(str(producto[a]), str(precio[a]))