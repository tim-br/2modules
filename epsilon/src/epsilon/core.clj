(ns epsilon.core
  (:require [honeysql.core :as sql]
            [honeysql.helpers :refer :all]))

(defn foo [x] (* x 11))

(def sqlmap {:select [:a :b :c]
             :from [:yaz]
             :where [:= :f.a "baz"]})

(defn bar
  []
  (sql/format sqlmap))
