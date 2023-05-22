(ns clojure-noob.chapter-6)

inc

'inc

(map inc [1 2])

'(map inc [1 2])

(def great-books ["East of Eden" "The Glass Bead Game"])

great-books

(ns-interns *ns*)

(get (ns-interns *ns*) 'great-books)

(deref #'clojure-noob.chapter-6/great-books)

(create-ns 'cheese.taxonomy)

(ns-name (create-ns 'cheese.taxonomy))

(in-ns 'cheese.analysis)

(in-ns 'cheese.taxonomy)
(def cheddars ["mild" "medium" "strong" "sharp" "extra sharp"])
(in-ns 'cheese.analysis)

cheddars

(in-ns 'cheese.analysis)
cheese.taxonomy/cheddars

(in-ns 'cheese.taxonomy)
(def cheddars ["mild" "medium" "strong" "sharp" "extra sharp"])
(def bries ["Wisconsin" "Somerset" "Brie de Meaux" "Brie de Melun"])
(in-ns 'cheese.analysis)
(clojure.core/refer 'cheese.taxonomy)
bries
; => ["Wisconsin" "Somerset" "Brie de Meaux" "Brie de Melun"]

cheddars
; => ["mild" "medium" "strong" "sharp" "extra sharp"]

(clojure.core/refer 'cheese.taxonomy :only ['bries])
bries
; => ["Wisconsin" "Somerset" "Brie de Meaux" "Brie de Melun"]
cheddars 
; => RuntimeException: Unable to resolve symbol: cheddars

(clojure.core/refer 'cheese.taxonomy :exclude ['bries])
bries
; => RuntimeException: Unable to resolve symbol: bries
cheddars 
; => ["mild" "medium" "strong" "sharp" "extra sharp"]