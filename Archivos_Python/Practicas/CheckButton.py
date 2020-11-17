import tkinter as tk


class Aplicacion:
    def __init__(self):
        self.ventana1 = tk.Tk()
        self.seleccion1 = tk.IntVar()
        self.check1 = tk.Checkbutton(self.ventana1, text="Chrome", variable=self.seleccion1)
        self.check1.grid(column=0, row=0)
        self.seleccion2 = tk.IntVar()
        self.check2 = tk.Checkbutton(self.ventana1, text="FireFox", variable=self.seleccion2)
        self.check2.grid(column=0, row=1)
        self.seleccion3 = tk.IntVar()
        self.check3 = tk.Checkbutton(self.ventana1, text="Edge", variable=self.seleccion3)
        self.check3.grid(column=0, row=2)
        self.seleccion4 = tk.IntVar()
        self.check4 = tk.Checkbutton(self.ventana1, text="Safari", variable=self.seleccion4)
        self.check4.grid(column=0, row=3)
        self.seleccion5 = tk.IntVar()
        self.check5 = tk.Checkbutton(self.ventana1, text="Opera", variable=self.seleccion5)
        self.check5.grid(column=0, row=4)
        self.boton1 = tk.Button(self.ventana1, text="Verificar", command=self.verificar)
        self.boton1.grid(column=0, row=5)
        self.label1 = tk.Label(text="cantidad:")
        self.label1.grid(column=0, row=6)
        self.ventana1.mainloop()

    def verificar(self):
        cant = ""
        if self.seleccion1.get() == 1:
            cant += "Chrome - "
        if self.seleccion2.get() == 1:
            cant += "FireFox - "
        if self.seleccion3.get() == 1:
            cant += "Edge - "
        if self.seleccion4.get() == 1:
            cant += "Safari - "
        if self.seleccion5.get() == 1:
            cant += "Opera"
        self.ventana1.title(cant)


aplicacion1 = Aplicacion()