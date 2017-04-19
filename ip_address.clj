(ns ip-address)

(defn validate-ip
  [s]
  (let
      [regex-vector (re-find (re-pattern "(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)") s)
       [first second third fourth fifth] regex-vector
       main-string (str second "." third "." fourth "." fifth)]
    (and
     (= 5 (count regex-vector))
     (= main-string s)
     (every? true? (map #(<= % 255) [(bigdec second) (bigdec third) (bigdec fourth) (bigdec fifth)])))))
