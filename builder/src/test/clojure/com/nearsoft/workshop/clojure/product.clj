(ns com.nearsoft.workshop.clojure.product
  (:require [clojure.test :refer :all]))

(def p
  {:price 10.50
   :sku "1234ASDFQWERZXCV"
   :name "Tonayan"
   :description "Este producto te dará super poderes"})

(deftest test-values
  (testing "Have the values previously set"
    (is (= "1234ASDFQWERZXCV"
           (p :sku)))
    (is (= "Tonayan"
           (p :name)))
    (is (= 10.50
           (p :price)))
    (is (= "Este producto te dará super poderes"
           (p :description)))))