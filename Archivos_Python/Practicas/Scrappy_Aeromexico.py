import requests
from bs4 import BeautifulSoup
import csv
from datetime import datetime

url_page = 'https://aeromexico.com/es-mx/reserva/opciones?itinerary=MEX_MAD_2020-01-31.MAD_MEX_2020-02-03&leg=1&travelers=A1_C0_I0_PH0_PC0'

page = requests.get(url_page).text
soup = BeautifulSoup(page, "html.parser")

tabla = soup.find('table', attrs={'id': 'FlightOptionsGrid-table'})
name = ""
price = ""

for fila in tabla.find_all('tr'):
    nroCelda = 0
    for celda in fila.find_all('th'):
        if nroCelda == 0:
            name = celda.text
            print("Indice:", name)
        if nroCelda == 2:
            price = celda.text
            print("Valor:", price)
        nroCelda = nroCelda+1
with open('Aeromexico.csv', 'a') as csv_file:
    writer = csv.writer(csv_file)
    writer.writerow([name, price, datetime.now()])