(ns com.andmal.times
  (:import (java.time LocalDateTime LocalDate Year  DayOfWeek)))

(def day (.getDayOfWeek (LocalDateTime/now)) )
(println (.toString day))

(def year Year)
(println year)
