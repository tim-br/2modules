(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.0"]
                 [honeysql "0.8.1"]])

(task-options!
  aot {:namespace '#{epsilon.core}}
  jar {:main 'epsilon.core
       :file "epsilon.jar"
       :manifest {"Description" "example boot project"}}
  pom {:version 1.1})

(deftask build
 "Build uberjar"
 []
 (comp
   (aot)
   (uber)
   (jar)
   (target)))
