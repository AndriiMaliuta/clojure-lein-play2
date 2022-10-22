(ns com.andmal.db.dbs
  (:import (java.sql DriverManager)))

(defrecord Page [title body created_at edited_at])
(defstruct page_struct :title :body :created_at :edited_at)

(def ALL_PAGES "select * from pages")
(def PAGE_BY_TITLE "select * from pages where title = ?")

(Class/forName "org.postgresql.Driver")
(def conn (DriverManager/getConnection "jdbc:postgresql://172.17.0.2/pages" "dev" (System/getenv "PASS")))

(def statement (.prepareStatement conn ALL_PAGES))

(def rs (.executeQuery statement))

(def pages [])

(.next rs)

(while (.next rs)
  (def pages (conj pages 0 (struct page_struct
                                   (.getString rs "title")
                                   (.getString rs "body")
                                   (.getString rs "created_at")
                                   (.getString rs "edited_at"))))
  (def page_r (Page. (.getString rs "title")
                     (.getString rs "body")
                     (.getString rs "created_at")
                     (.getString rs "edited_at")))
  )

(println (count pages))
