(ns pangram)


(def alphabet (set "abcdefghijklmnopqrstuvwxyz"))

(defn pangram?
  [s]
  (= (set  (filter #(contains? alphabet %)  (clojure.string/lower-case s))) alphabet))
