(ns com.andmal.core.dtos
  (:import (com.google.gson GsonBuilder)))

(def gb GsonBuilder)
(def gson (.create (.setPrettyPrinting gb)))

(def person (.fromJson gson "{\"\name\": \"Vasyl\""))

(println person)