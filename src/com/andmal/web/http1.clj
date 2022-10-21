(ns com.andmal.web.http1
  (:import (java.net URL URLConnection)
           (java.io InputStreamReader BufferedReader)))

(def connection  (.openConnection (URL. "https://example.com")))
(println connection)

(def stream (.getInputStream (connection)))
(println stream)

(def br (BufferedReader. (InputStreamReader. stream)))

(println (.readLine br))