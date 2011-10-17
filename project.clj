(defproject org.clojars.hms/karras "0.7.1-SNAPSHOT"
  :description "A clojure entity framework for MongoDB"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure.contrib/def "1.3.0-alpha4"]
                 [org.mongodb/mongo-java-driver "2.1"]
                 [inflections "0.6.3-SNAPSHOT"]]
  :dev-dependencies [[swank-clojure "1.3.2" :exclusions [org.clojure/clojure]]
                     [org.clojars.hms/midje "1.3-alpha4" :exclusions [org.clojure/clojure]]
                     [scriptjure "0.1.24" :exclusions [org.clojure/clojure]]]
  :autodoc {:web-src-dir "http://github.com/wilkes/karras/blob/"
            :web-home "http://wilkes.github.com/karras"}

  :repositories {"releases" "http://192.168.0.7:8080/archiva/repository/internal/"
                 "snapshots" "http://192.168.0.7:8080/archiva/repository/snapshots/"})
