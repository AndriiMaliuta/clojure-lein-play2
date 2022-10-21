(ns com.andmal.web.html_parse_one
  (:import (org.jsoup Jsoup)))

;Document doc = Jsoup.connect("https://en.wikipedia.org/").get();

(def document (.get (Jsoup/connect "https://en.wikipedia.org/")))

(def elements (.select document "div"))

(def div1 (get elements 3)) (println div1)

(println (count elements))
