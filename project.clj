(defproject cljzmq-examples "0.1.0-SNAPSHOT"
  :description "zguide examples ported to cljzmq"
  :url "https://github.com/trevorbernard/cljzmq-examples"
  :license {:name "LGPLv3+"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.zeromq/cljzmq "0.1.2-SNAPSHOT"]]
  :repositories [["sonatype" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                              :update :always}]])
