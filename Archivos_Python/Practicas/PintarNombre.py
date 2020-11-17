import tkinter as tk
class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.canvas1=tk.Canvas(self.ventana1, width=1050, height=600, background="white")
        self.canvas1.grid(column=0, row=0)
        #Letra O
        self.canvas1.create_rectangle(27, 23, 147, 159, fill='black')
        #letra S
        self.canvas1.create_rectangle(219, 33, 352, 69, fill='black')
        self.canvas1.create_rectangle(219, 70, 266, 134, fill='black')
        self.canvas1.create_rectangle(175, 141, 269, 172, fill='black')
        #letra C
        self.canvas1.create_rectangle(393, 41, 542, 71, fill='black')
        self.canvas1.create_rectangle(398, 76, 434, 193, fill='black')
        self.canvas1.create_rectangle(434, 194, 536, 198, fill='black')
        #letra A
        self.canvas1.create_rectangle(574, 56, 608, 206, fill='black')
        self.canvas1.create_rectangle(613, 65, 704, 92, fill='black')
        self.canvas1.create_rectangle(612, 125, 705, 150, fill='black')
        self.canvas1.create_rectangle(712, 69, 739, 219, fill='black')
        #letra R
        self.canvas1.create_rectangle(794, 88, 823, 237, fill='black')
        self.canvas1.create_rectangle(828, 93, 919, 146, fill='black')
        self.canvas1.create_line(829, 157, 910, 246, fill='black')
        self.ventana1.mainloop()
aplicacion1=Aplicacion() 