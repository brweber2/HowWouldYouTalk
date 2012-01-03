(ns third.core
  (:use [clojure.core.logic :only (defrel fact run*)]))

(defrel doll_hierarchy parent child)
(fact doll_hierarchy 'a 'e)
(fact doll_hierarchy 'a 'f)
(fact doll_hierarchy 'b nil)
(fact doll_hierarchy 'c 'g)
(fact doll_hierarchy 'c 'h)
(fact doll_hierarchy 'd nil)
(fact doll_hierarchy 'e 'g)
(fact doll_hierarchy 'e 'h)
(fact doll_hierarchy 'f nil)
(fact doll_hierarchy 'g 'g)
(fact doll_hierarchy 'g 'h)
(fact doll_hierarchy 'h nil)

(defn- not-nil? [x] (not (nil? x)))

(defn list-children [x]
	(sort (filter not-nil? (run* [q]
		(doll_hierarchy x q)))))

(defn list-parents [y]
	(sort (filter not-nil? (run* [q]
		(doll_hierarchy q y)))))

(defn child? [x y]
	(true? (some #(= % y) (list-parents x))))

(defn parent? [x y]
	(true? (some #(= % y) (list-children x))))

