conexion(a,b,3).
conexion(a,c,5).
conexion(b,c,4).
conexion(c,d,6).
arista(X):-conexion(X,_,_).
costo(X,Z,Y,CostoTotal):-conexion(X,Y,Costo1),conexion(Y,Z,Costo2),CostoTotal is Costo1 + Costo2.