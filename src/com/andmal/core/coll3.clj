(ns com.andmal.core.coll3)

(def nums [1 2 3 4])
(def my-vector [1 2 3 4])

(def nums (conj nums 9))
(def nums (assoc nums 0 8))

(println nums)
(println "aa")