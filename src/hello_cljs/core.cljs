(ns hello-cljs.core
  (:require [chromex.ext.runtime :as cx.runtime]))

(defn hello []
  (str "hello There "))

;; uncomment this to alter the provided "app" DOM element
(set! (.-innerHTML (js/document.getElementById "app")) (hello))

(println (hello))
