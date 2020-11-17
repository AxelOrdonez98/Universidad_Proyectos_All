semillas = 2
total = 0
for i in range(64):
    total += semillas ** i
print("El pago es: ", str(total))