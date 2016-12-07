(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.7.0"]
                 [tim/epsilon "1.1"]])

(task-options!
  aot {:namespace '#{omicron.core}}
  jar {:main 'omicron.core
       :file "omicron.jar"
       :manifest {"Description" "example boot project"}})

(deftask build
 "Build uberjar"
 []
 (comp
   (aot)
   (uber)
   (jar)
   (target)))

(deftask fun
  []
  (watch))
