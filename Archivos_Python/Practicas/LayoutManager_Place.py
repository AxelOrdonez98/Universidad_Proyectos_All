import tkinter as tk
from tkinter import ttk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.geometry('800x600')
        self.ventana1.resizable(height = 0, width = 0)
        self.boton=ttk.Button(self.ventana1, text="Cancelar")
        self.boton.place(x=690,y=550,width=100,height=30)
        self.boton2=ttk.Button(self.ventana1, text="Confirmar")
        self.boton2.place(x=590,y=550,width=100,height=30)
        self.ventana1.mainloop()

aplicacion1=Aplicacion()