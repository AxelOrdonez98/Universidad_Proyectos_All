progenitor(ramon,jose).
progenitor(susana, jose).
progenitor(alejandro,carla).
progenitor(pilar, carla).
progenitor(antonio,joaquina).
progenitor(joanna, joaquina).
progenitor(ana,mauricio).
progenitor(mauricio,mauricio).
progenitor(maria,ana).
progenitor(maria,miguel).
progenitor(maria,jorge).
progenitor(miguel,miguel).
progenitor(miguel,alejandra).
progenitor(miguel,mariajose).
progenitor(alejandra,miguel).
progenitor(alejandra,alejandra).
progenitor(alejandra,mariajose).
progenitor(jorge,jorge).
progenitor(jorge,karina).
progenitor(joaquina,mauricio).
progenitor(joaquina,antonio).
progenitor(antonio,ricardo).
progenitor(antonio,josemiguel).
progenitor(jose,maria).
progenitor(carla,maria).
progenitor(jose,luz).
progenitor(carla,luz).
progenitor(jose,gloria).
progenitor(carla,gloria).
progenitor(luz,julio).
progenitor(luz,victor).
progenitor(luz,arturo).
progenitor(arturo,arturo).
progenitor(arturo,julio).
progenitor(arturo,victor).
abuelo(maria,mauricio).
abuelo(maria,jorge).
abuelo(maria,karina).
abuelo(maria,mariajose).
abuelo(maria,alejandra).
abuelo(maria,miguel).
abuelo(joaquina,mauricio).
abuelo(joaquina,ricardo).
abuelo(joaquina,miguel).
bisabuelo(alberto,mauricio).
bisabuelo(marel, mauricio).
bisabuelo(alberto,ricardo).
bisabuelo(marel, ricardo).
bisabuelo(alberto,miguel).
bisabuelo(marel, miguel).
bisabuelo(jose,mauricio).
bisabuelo(carla, mauricio).
bisabuelo(jose,jorge).
bisabuelo(carla, jorge).
bisabuelo(jose,karina).
bisabuelo(carla, karina).
bisabuelo(jose,miguel).
bisabuelo(carla, miguel).
bisabuelo(jose,alejandra).
bisabuelo(carla, alejandra).
bisabuelo(jose,mariajose).
bisabuelo(carla, mariajose).
abueloo(X,Z):-progenitor(X,Y),progenitor(Y,Z).