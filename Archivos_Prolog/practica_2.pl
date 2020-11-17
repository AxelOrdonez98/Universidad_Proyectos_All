progenitor(clara, pedro).
progenitor(pedro, jose).
progenitor(ana, clara).
progenitor(jose, clara).
abuelo(X,Y):-progenitor(X,Y), progenitor(Z,Y).
bisabuelo(X,Y):-progenitor(X,Z),abuelo(Z,Y).