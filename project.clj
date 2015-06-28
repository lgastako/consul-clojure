(defproject attache "0.1.0-SNAPSHOT"
  :description "An async consul client."
  :url "http://github.com/bpoweski/attache"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.stuartsierra/component "0.2.2"]
                 [camel-snake-kebab "0.3.1" :exclusions [org.clojure/clojure]]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [cheshire "5.5.0"]
                 [clj-http-lite "0.2.1"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [org.clojure/tools.trace "0.7.8"]]
                   :jvm-opts ["-XX:MaxPermSize=128M"]}})
