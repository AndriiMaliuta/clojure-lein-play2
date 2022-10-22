(defproject clojure-play2 "0.1.0-SNAPSHOT"
  :description "some clojure"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [org.clojure/clojure "1.11.1"]
                 [com.google.code.gson/gson "2.9.1"]
                 [com.squareup.okhttp3/okhttp "4.10.0"]
                 [com.konghq/unirest-java "3.13.11"]
                 [org.jsoup/jsoup "1.15.3"]
                 [postgresql "9.1-901-1.jdbc4"]
                 ]
  :repl-options {:init-ns clojure-play2.core})
