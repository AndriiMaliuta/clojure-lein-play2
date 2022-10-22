(ns com.andmal.loops.loop2)

;(dotimes [n 10]
;  (println (map #(* % (inc n)) (range 1 11))))

;(dotimes [x 10] (println x))

(dorun (map #(println "hi" %) ["mum" "dad" "sister"]))

; (dorun (map #(db/insert :person {:name %}) ["Fred" "Ethel" "Lucy" "Ricardo"]))