doll_hierarchy(a,[e,f]).
doll_hierarchy(b,nil).
doll_hierarchy(c,[g,h]).
doll_hierarchy(d,nil).
doll_hierarchy(e,[g,h]).
doll_hierarchy(f,nil).
doll_hierarchy(g,[g,h]).
doll_hierarchy(h,nil).

parent(X,Y) :- doll_hierarchy(X,Y), children(Y,X).
children(X,Y) :- doll_hierarchy(X,Y), parent(Y,X).

