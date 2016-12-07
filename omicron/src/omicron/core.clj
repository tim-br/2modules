(ns omicron.core
  (:require [epsilon.core :as esp])
  (:gen-class))

(defn bar
  []
  (esp/foo 25))

(defn cuz
  []
  (println "ok"))
