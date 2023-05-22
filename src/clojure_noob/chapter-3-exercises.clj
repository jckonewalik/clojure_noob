;; exercise 1
(str "Hello " "World " "!!!")
(vector 1 2 3 4)
(list 1 2 3 4)
(hash-map :name "Joao" :age 32)
(hash-set 1 2 2 3 4)

;; exercise 2
;;named functions
(defn add-100
  [number]
  (+ number 100))
(add-100 30)

;;anonymous function
((fn [number]
   (+ number 100)) 25)

(#(+ % 100) 45)


;; exercise 3
(defn dec-maker
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

(dec9 10)

;; exercise 4

(defn mapset
  [function args] 
  (set (map function args)))
(mapset inc [1 1 2 2])


(count [])

(def websites 
(loop [result []] 
  (if (< (count result) 10)
    (recur (conj result "codewars"))
    result
    )))

(def websites2 (vec (repeat 1000 "codewars")))
websites2


(defn get-numbers
  [n]
  (loop [array []
         current n]
    (if (> current 0)
      (recur (conj array current) (- current 1))
      array
      )))

(reduce + (get-numbers 10))


(range (+ 1 10))

(#(/ (* % (+ % 1)) 2) 2)

(/ (* 2 (+ 2 1)) 2)