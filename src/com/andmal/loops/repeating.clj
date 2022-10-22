(ns com.andmal.loops.repeating)

(def intss (repeatedly 5 (rand-int 100)))

(println intss)