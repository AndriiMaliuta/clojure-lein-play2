(ns com.andmal.core.collects)

(def nums '(1 2 3 4 5 6))
(def nums2 [7 8 9 10 11 12])

(def nums (assoc nums 0 9))

(println nums)