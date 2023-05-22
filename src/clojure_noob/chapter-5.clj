(ns clojure-noob.chapter-5
  (:require [clojure.string :as s]))

(def great-baby-name "Rosanthony")
great-baby-name

(let [great-baby-name "Bloodthunder"]
  great-baby-name)

great-baby-name

;; (defn sum
;;   ([vals] (sum vals 0))
;;   ([vals accumulating-total]
;;    (if (empty? vals)
;;      accumulating-total
;;      (sum (rest vals) (+ (first vals) accumulating-total)))))

(defn sum
  ([vals] (sum vals 0))
  ([vals accumulating-total]
   (if (empty? vals)
     accumulating-total
     (recur (rest vals) (+ (first vals) accumulating-total)))))

(sum [1 2 3])


(require '[clojure.string :as s])
(defn clean
  [text]
  (s/replace (s/trim text) #"lol" "LOL"))

(clean "My boa constrictor is so sassy lol!   ")

((comp inc *) 2 3)

(def character
  {:name "Joao Carlos"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})

(def c-int (comp :intelligence :attributes))
(def c-str (comp :strength :attributes))
(def c-dex (comp :dexterity :attributes))

(c-int character)
(c-str character)
(c-dex character)

(defn spell-slots
  [char]
  (int (inc (/ (c-int char) 2))))

(spell-slots character)

(def spell-slots-comp (comp int inc #(/ % 2) c-int))

(spell-slots-comp character)

(defn two-comp
  [f g]
  (fn [& args]
    (f (apply g args))))

(def teste (two-comp inc *))
(teste 1 2 3)


(defn sleep-identity
  "Returns the given value after 1 second"
  [x]
  (Thread/sleep 1000)
  x)

(sleep-identity "Mr. Fantastico")
(sleep-identity "Mr. Fantastico")


(def memo-sleep-identity
  (memoize sleep-identity))

(memo-sleep-identity "Mr. Fantastico")
(memo-sleep-identity "Mr. Fantastico")
