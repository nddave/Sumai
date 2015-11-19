;; This is my canvas. This is my art.

;; Assignment information
;; ---
;; Class : Artificial Intelligence
;; Assignment : Make an artificially intelligent code that uses core.logic
;; Student : Nirman Dave

;; Program information
;; ---
;; Name : Sumai 
;; File : Project
;; File Purpose : The project file contains dependencies needed to run the Overtone library.
;; Version : 1.0
;; Description : An artificially intelligent emotion detector that ranks your "happiness" based on
;;					your responses to its question. If your response is "happy" enough; it will
;;					automatically tweet your experience to share it with the world.
;; Language : Clojure

(defproject sumai "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
  				[org.clojure/core.logic "0.8.10"]
  				[twitter-api "0.7.8"]]
  :main ^:skip-aot sumai.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
