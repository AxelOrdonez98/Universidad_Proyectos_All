import requests
from bs4 import BeautifulSoup
import csv
from datetime import datetime

url_page = 'http://www.bolsamadrid.es/esp/aspx/Indices/Resumen.aspx'

page = requests.get(url_page).text
soup = BeautifulSoup(page, "html.parser")

tabla = soup.find('table', attrs={'id': 'ctl00_Contenido_tblÍndices'})
name = ""
price = ""
for fila in tabla.find_all("tr"):
    nroCelda = 0
    for celda in fila.find_all('td'):
        if nroCelda == 0:
            name = celda.text
            print("Indice:", name)
        if nroCelda == 2:
            price = celda.text
            print("Valor:", price)
        nroCelda = nroCelda+1
with open('bolsa_ibex35_1.csv', 'a') as csv_file:
    writer = csv.writer(csv_file)
    writer.writerow([name, price, datetime.now()])