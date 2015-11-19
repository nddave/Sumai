Sumai
=======

![alt tag](http://4.bp.blogspot.com/-iiMa8-PV5G4/Vk0pxgVKW1I/AAAAAAAACRM/9_ekJYSbd8s/s1600/sumai.png)

An artificially intelligent emotion detector that ranks your "happiness" based on your responses to its question. If your response is "happy" enough; it will automatically tweet your experience to share it with the world.

Getting started
=======
To get started with sumai, just use Leinengen (or any other program) to run it.

> $ lein run

Once you run it will ask you a question, demanding for a response.

> How was your day? : 

And based on your response, it will generate a "happiness rank", to determine your happiness. And if your "happiness rank" is more thank 40%, it will automatically tweet the code on your twitter. Checkout [core.clj](https://github.com/nddave/Sumai/blob/master/src/sumai/core.clj) to know more about how the rank is determined.

Assignment information
=======
This program is written as a part of the Artificial Intelligence Assignment.

- Program Name : Sumai
- Program Description : An artificially intelligent emotion rank algorithm, that judges your happiness and tweets it to the world!
- Subject : Artificial Intelligence
- Assignment : Write an artificially intelligent algorithm using core.logic
- Language : Clojure
