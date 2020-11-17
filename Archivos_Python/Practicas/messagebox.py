import tkinter as tk
from tkinter import messagebox as mb
import sys
import math

class Aplicacion:
    def __init__(self):
        self.valor = 0
        self.ventana = tk.Tk()
        self.ventana.title("UwwU")

        self.campo = tk.StringVar()
        self.x = tk.Entry(self.ventana, width = 10, textvariable = self.campo)
        self.x.grid(column = 0, row = 0)

        self.campo1 = tk.StringVar()
        self.y = tk.Entry(self.ventana, width = 10, textvariable = self.campo1)
        self.y.grid(column = 1, row = 0)

        self.boton = tk.Button(self.ventana, text = "Suma", command = self.sumar)
        self.boton.grid(column = 0, row = 1)

        self.boton1 = tk.Button(self.ventana, text = "Salirs", command = self.finalizar)
        self.boton1.grid(column = 1, row = 1)

        self.label1 = tk.Label(self.ventana, text=self.valor)
        self.label1.grid(column = 1, row = 2)
        self.label1.configure(foreground = "green")

        self.ventana.mainloop()

    def sumar(self):
        if self.campo.get() != "" and self.campo1.get() != "":
            self.valor = int(self.campo.get()) + int(self.campo1.get())
            self.label1.config(text=self.valor)
            mb.showinfo("Suma", str(self.valor))
        else:
            mb.showerror("ERROR", "Favor de llenar todos los campos")

    def borrar(self):
        self.campo.set("")
        self.campo1.set("")
        self.valor = 0
        self.label1.config(text = self.valor)

    def finalizar(self):
        respuesta = mb.askyesno("! Atencion ¡", "¿Desea salir del programa?")
        if respuesta == True:
            sys.exit()

aplicacion1 = Aplicacion()