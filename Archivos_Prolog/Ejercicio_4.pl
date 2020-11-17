conexion(d,h,4).
conexion(h,f,9).
conexion(i,f,11).
conexion(f,a,8).
conexion(a,b,7).
conexion(f,g,10).
arista(X):-conexion(X,_,_).
costo(X,Z,Y,CostoTotal):-conexion(X,Y,Costo1),conexion(Y,Z,Costo2),CostoTotal is Costo1 + Costo2.