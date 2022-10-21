(ns com.andmal.recs)

(defrecord Animal [name age color] )
(def simba (Animal. "Simba" 5 "white and black"))
(assoc simba :age 6)
;(update-in simba [:name :age] inc)

(println (:name simba))