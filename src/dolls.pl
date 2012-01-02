doll_hierarchy(a,e).
doll_hierarchy(a,f).
doll_hierarchy(b,nil).
doll_hierarchy(c,g).
doll_hierarchy(c,h).
doll_hierarchy(d,nil).
doll_hierarchy(e,g).
doll_hierarchy(e,h).
doll_hierarchy(f,nil).
doll_hierarchy(g,g).
doll_hierarchy(g,h).
doll_hierarchy(h,nil).

parent(X,Y) :- doll_hierarchy(X,Y).
child(X,Y) :- doll_hierarchy(Y,X).