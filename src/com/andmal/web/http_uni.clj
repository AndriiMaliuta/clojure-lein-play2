(ns com.andmal.web.http_uni
  (:import (com.mashape.unirest.http Unirest)
           (com.mashape.unirest.request.body Body)))

(def resp (Unirest/get "http://example.com"))

(println (.asString resp))

