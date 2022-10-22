(ns com.andmal.loops.looping-one)

(def nums (range 1 100))

;(while (> 20 nums)
;  (println ))

(defn loop1 []
  (loop [x 10]
    (when (> x 1)
      (println x)
      (recur (- x 2)))))

; (iterate println [1 2 3 4 ])

;; FOR (https://clojuredocs.org/clojure.core/for)
(for [x nums
       :let [y (* x 2)]
       :when (> 2 x)]
   y)

(def digits [1 2 3])

(for [x1 digits
      x2 digits]
  (* x1 x2))
;;=> (1 2 3 2 4 6 3 6 9)

;; === with run!
(run! println [1 2 3 4 5])

;(def nums2 (map #(rem n %) nums))
(def nums2 [2, 3, 4, 5, 6])

;; with doseq
(doseq [it nums2]
  (println it))

(doseq [x [-1 0 1]
        y [1  2 3]]
  (prn (* x y)))

;; with dotimes
(dotimes [x 10] (println x))

