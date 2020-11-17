import tkinter as tk
import math

class Aplicacion:
    def __init__(self):
        self.valor=0 #valor a incrementar o decrementar
        self.ventana1=tk.Tk() #clase que representa una nueva ventana
        self.ventana1.title("Calculadora") #titulo de la ventana

        self.dato1 = tk.StringVar()
        self.entry1 = tk.Entry(self.ventana1, width=10, textvariable = self.dato1)
        self.entry1.grid(column=0, row=0)

        self.dato2 = tk.StringVar()
        self.entry2 = tk.Entry(self.ventana1, width=10, textvariable = self.dato2)
        self.entry2.grid(column=1, row=0)

        

        self.boton1=tk.Button(self.ventana1, text="Suma", command=self.sumar)
        self.boton1.grid(column=0, row=1, sticky = "we") #posicion del boton

        self.boton2=tk.Button(self.ventana1, text="Multiplicacion", command=self.multiplicar)
        self.boton2.grid(column=1, row=1, sticky = "we")

        self.boton3=tk.Button(self.ventana1, text="Potencia", command=self.potencia)
        self.boton3.grid(column=2, row=1, sticky = "we") #posicion del boton

        self.boton4=tk.Button(self.ventana1, text="Resta", command=self.restar)
        self.boton4.grid(column=0, row=2, sticky = "we") #posicion del boton

        self.boton5=tk.Button(self.ventana1, text="Divicion", command=self.dividir)
        self.boton5.grid(column=1, row=2, sticky = "we")

        self.boton6=tk.Button(self.ventana1, text="Limpiar", command=self.borrar)
        self.boton6.grid(column=2, row=2, sticky = "we") #posicion del boton


        self.label1=tk.Label(self.ventana1, text=self.valor)
        self.label1.grid(column=1, row=4)
        self.label1.configure(foreground="red")

        self.ventana1.mainloop()

    def sumar(self):
        self.valor=int(self.dato1.get()) + int(self.dato2.get())
        self.label1.config(text=self.valor)

    def multiplicar(self):
        self.valor= int(self.dato1.get()) * int(self.dato2.get())
        self.label1.config(text=self.valor)
    def potencia(self):
        self.valor= pow(int(self.dato1.get()),  int(self.dato2.get()))
        self.label1.config(text=self.valor)
    def dividir(self):
        self.valor=int(self.dato1.get()) / int(self.dato2.get())
        self.label1.config(text=self.valor)      
    def restar(self):
        self.valor= int(self.dato1.get()) - int(self.dato2.get())
        self.label1.config(text=self.valor) 
    def borrar(self):
        self.dato1.set("")
        self.dato2.set("")
        self.valor=0
        self.label1.config(text=self.valor)             



aplicacion1=Aplicacion()