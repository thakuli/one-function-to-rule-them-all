(ns one-function-to-rule-them-all)

; (concat-elements [[1 2] [3 4]]) ;=> (1 2 3 4)
(defn concat-elements [a-seq]
  (reduce concat () a-seq))

; (str-cat ["I" "am" "Legend"])  ;=> "I am Legend"
(defn str-cat [a-seq] 
  (if (empty? a-seq)
    ""
    (reduce #(str %1 " " %2) a-seq)))

; (my-interpose "," ["I" "me" "myself"]) ;=> ("I" "," "me" "," "myself")
(defn my-interpose [x a-seq]
  (rest (reduce #(conj %1 x %2) [] a-seq)))

(defn my-count [a-seq]
  :-)

(defn my-reverse [a-seq]
  [:-])

(defn min-max-element [a-seq]
  [:-])

(defn insert [sorted-seq n]
  [:-])

(defn insertion-sort [a-seq]
  [:-])

(defn parity [a-seq]
  [:-])

(defn minus [x]
  :-)

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
