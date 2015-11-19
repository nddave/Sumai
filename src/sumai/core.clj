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
;; File Purpose : The core file runs the main function and other various commands necessary to generate a rank and trigger action.
;; Version : 1.0
;; Description : An artificially intelligent emotion detector that ranks your "happiness" based on
;;          your responses to its question. If your response is "happy" enough; it will
;;          automatically tweet your experience to share it with the world.
;; Language : Clojure

;; Defining the namespace, and using:
;;	* tweet.clj
;;	* happy.clj
;;	* core.logic
;;	* clojure.string
(ns sumai.core
	[:use sumai.tweet]
	[:use sumai.happy])
(use 'clojure.core.logic)
(require '[clojure.string :as str])

;; Defining "user-text" as a readline which asks for user's input.
(def user-text (do (print "\nHow was your day : ") (flush) (read-line)))

;; Takes the user input and converts to a vector
(defn user-input-vec[]
	(str/split (str user-text) #" "))

;; Uses core.logic to see how many words from the user's input match the "happy vector".
;; This is an attempt to see how much happy the user could be. To quantify "happiness", this number
;; is then used to generate a "happiness rank".
(defn logic-calc[]
	(count (run* [q]
		(membero q (user-input-vec))
		(membero q happy-vector))))

;; The rank maker, will take in the following variables:
;;	* total number of words by the user
;;	* total number of words in the happy list
;;	* total number of matching words
;; And then, would use cross multiplication to generate a raw ratio.
;; This raw ratio is then divided by the total number of happy words to generate the "happiness rank".
(defn rank-maker[total-user, matching, total-happy]
	(/ (/ (* (float total-happy) (float matching)) (float total-user)) (float total-happy)))

;; The main function judges the rank and triggers action accordingly.
;; If the rank is higher than 0.4, meaning, if the positivity of the sentence is more than 40%.
;; Then, then program automatically tweets your comment.
(defn -main[]
	(let [rank (rank-maker (count (user-input-vec)) (logic-calc) (count happy-vector))]
	(cond
		(> rank 0.4) (tweet user-text)
		:else (println "\nLOL, go out, have more fun; You can have a better day!\n"))))
