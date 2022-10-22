(ns com.andmal.conds.cond1)

(defn has-neg [coll]
  (if-not (empty? coll)   ;;  = (if (not (empty? coll)) ...
    (or (neg? (first coll)) (recur (rest coll)))))

(defn pos-neg-or-zero
  "Determines whether or not n is positive, negative, or zero"
  [n]
  (cond
    (< n 0) "negative"
    (> n 0) "positive"
    :else "zero"))

