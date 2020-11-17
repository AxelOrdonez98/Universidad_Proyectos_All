class Galleta():
    chocolate = False
    def __init__(self, sabor, color):
        self.sabor = sabor
        self.color = color
        print(f"Soy una galleta xd: {self.sabor} y {self.color} ")
galleta1 = Galleta("cafe", "moras")
galleta2 = Galleta("blanca", "vainilla")