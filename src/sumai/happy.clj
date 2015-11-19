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
;; File Purpose : The happy file contains a list of words that would define "happiness".
;; Version : 1.0
;; Description : An artificially intelligent emotion detector that ranks your "happiness" based on
;;          your responses to its question. If your response is "happy" enough; it will
;;          automatically tweet your experience to share it with the world.
;; Language : Clojure

;; Defining the namespace.
(ns sumai.happy)

;; Defining the "happy-vector" as a vector containing "happy" words.
(def happy-vector 
	(vector "good"
		  "fun"
		  "lovely"
		  "love"
		  "great"
		  "awesome"
		  "inspired"
		  "inspire"
		  "achieve"
		  "like"
		  "success"
		  "best"
		  "wonderful"
		  "honest"
		  "honesty"
		  "help"
		  "excellent"
		  "positive"
		  "beautiful"))