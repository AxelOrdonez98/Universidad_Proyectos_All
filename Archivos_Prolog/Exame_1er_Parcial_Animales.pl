maria(micho).
juan(nana, rex).
isabel(leobardo, rapunzel).
jose(kitty).
kitty(jose).
perro(micho, leobardo,nana).
gato(rex, kitty).
guacamaya(pepe).
maria(X):-juan(X,Y):-isabel(X,Y):-jose(X):-perro(X,Y,Z):-gato(X,Y):-guacamaya(X):-kitty(X).