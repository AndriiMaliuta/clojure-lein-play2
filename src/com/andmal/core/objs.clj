(ns com.andmal.core.objs)

(def person {:name "Ihnat" :age 30})

(defn add_person [name age] {:name name :age age})

(println (:name (add_person "aa" 20)))