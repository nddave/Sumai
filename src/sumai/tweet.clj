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
;; File Purpose : The tweet file contatins the library and code made post your tweet.
;; Version : 1.0
;; Description : An artificially intelligent emotion detector that ranks your "happiness" based on
;;          your responses to its question. If your response is "happy" enough; it will
;;          automatically tweet your experience to share it with the world.
;; Language : Clojure

;; Defining the namespace with twitter developer credentials.
(ns sumai.tweet
	(:use
   [twitter.oauth]
   [twitter.callbacks]
   [twitter.callbacks.handlers]
   [twitter.api.restful])
  (:import
   (twitter.callbacks.protocols SyncSingleCallback)))

;; Defining all twitter developer credentials.
(def my-creds (make-oauth-creds *app-consumer-key*
                                *app-consumer-secret*
                                *user-access-token*
                                *user-access-token-secret*))

;; Defining a code to send a tweet to your twitter account using your developer credentials defined in "my-creds".
(defn tweet [status]
  (statuses-update :oauth-creds my-creds
                 :params {:status (str status)}))
