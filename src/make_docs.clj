(ns make-docs
  (:require [clojure.java.io :refer [file]]
            [nextjournal.clerk :as clerk])
  (:gen-class))

;; (def inpath
;;   "path of input"
;;   "src/koans")

;; (defn files
;;   []
;;   (->> (file inpath)
;;        (file-seq)
;;        (map #(.getPath %))
;;        (filter #(.endsWith % ".clj"))))

(defn files
  "Function to return a list of files to be processed."
  []
  ["src/koans/01_equalities.clj"])

(defn -main
  "Function to build the docs."
  []
  (clerk/build! {:paths (files) :out-path "resources/docs"}))
