import tkinter as tk
import sys
class Ventana:
    def __init__(self):
        self.ventana = tk.Tk()
        self.ventana.title("UwwwU")
        self.label1 = tk.Label(self.ventana, text="UwwwU")
        self.label1.grid(column=0, row=0)
        self.label2 = tk.Label(self.ventana, text="jueves 31 de octubre del 2019")
        self.label2.grid(column=0, row=1)
        self.boton1 = tk.Button(self.ventana, text="Salirs", command=self.finalizar)
        self.boton1.grid(column=0, row=2)
        self.ventana.resizable(False, False)
        self.ventana.mainloop()
    def finalizar(self):
        sys.exit()

Abrir = Ventana()