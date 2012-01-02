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

% root node iff it shows up on the left, but never on the right
% this can be used to answer about a specific node or to enumerate them all
root_nodes(X) :- doll_hierarchy(X,_), \+ doll_hierarchy(_,X).

% leaf nodes cannot have child nodes
% this can be used to answer about a specific node or to enumerate them all
leaf_nodes(X) :- doll_hierarchy(X,nil).