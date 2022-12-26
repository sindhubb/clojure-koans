(defproject clojure-koans "0.5.2-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [koan-engine "0.2.5"]
                 [io.github.nextjournal/clerk "0.12.707"]]
  :ring {:handler server/app
         :init server/init}
  :main ^:skip-aot server
  :uberjar-name "advent-of-code.jar"
  :aliases {"make-docs" ["run" "-m" "make-docs"]
            "start-clerk" ["run" "-m" "start-clerk"]}
  :dev-dependencies [[lein-koan "0.1.5"]]
  :profiles {:dev {:dependencies [[lein-koan "0.1.5"]
                                  [javax.servlet/javax.servlet-api "3.1.0"]]}}
  :repl-options {:init-ns koan-engine.runner
                 :init ^:displace (do (use '[koan-engine.core]))}
  :plugins [[lein-koan "0.1.5"]
            [lein-ring "0.12.5"]]
  :uberjar {:aot :all
            :omit-source true})
