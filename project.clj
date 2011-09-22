(defproject net.kronkltd/karras "0.7.1-SNAPSHOT"
  :description "A clojure entity framework for MongoDB"
  :dependencies [[org.clojure/clojure "1.3.0-RC0"]
                 [org.clojure.contrib/def "1.3.0-alpha4"]
                 [org.mongodb/mongo-java-driver "2.1"]
                 [inflections "0.5.2"]]
  :dev-dependencies [[scriptjure "0.1.23"]
                     [net.kronkltd/midje "1.3-alpha2-SNAPSHOT"]]
  :exclusions [org.clojure/contrib
               org.clojure/clojure-contrib]
  :autodoc {:web-src-dir "http://github.com/wilkes/karras/blob/"
            :web-home "http://wilkes.github.com/karras"})
