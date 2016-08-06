(set-env!
 :source-paths #{"src"}
 :dependencies
 '[[com.google.cloud/gcloud-java            "0.2.6"]
   [org.clojure/clojure                     "1.8.0"]])

(task-options!
 pom    {:project 'gcloud
         :version "0.1.0"})

(deftask deps [] (repl :server true))
