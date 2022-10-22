(ns com.andmal.db.dbs
  (:import (java.sql DriverManager)))

(defrecord page [title body created_at edited_at])
(defstruct page_struct :title :body :created_at :edited_at)

(def PAGES_QUERY "select * from pages")

(Class/forName "org.postgresql.Driver")
;(DriverManager/registerDriver (java.sql.Driver))
(def conn (DriverManager/getConnection "jdbc:postgresql://172.17.0.2/pages" "dev" (System/getenv "PASS")))

(def statement (.prepareStatement conn PAGES_QUERY))

(def rs (.executeQuery statement))

(.next rs)

(def page1 (struct page_struct (.getString rs "title") (.getString rs "body") (.getString rs "created_at") (.getString rs "edited_at")))

(println page1)