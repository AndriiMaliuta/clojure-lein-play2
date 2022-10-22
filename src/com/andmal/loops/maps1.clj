(ns com.andmal.loops.maps1)powershell

(println (map key {:a 1 :b 2}))
(time (println (map key {:a 1 :b 2})))

(assoc {} :key1 "value" :key2 "another value")
;;=> {:key2 "another value", :key1 "value"}