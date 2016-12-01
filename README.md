Sumai
=======

![alt tag](https://raw.githubusercontent.com/nddave/Sumai/master/Sumai.png)

An artificially intelligent emotion detector that ranks your "happiness" based on your responses to its question. If your response is "happy" enough; it will automatically tweet your experience to share it with the world.

Getting started
=======
To get started with sumai, just use Leinengen (or any other program) to run it.

> $ lein run

Once you run it will ask you a question, demanding for a response.

> How was your day? : 

And based on your response, it will generate a "happiness rank", to determine your happiness. And if your "happiness rank" is more thank 40%, it will automatically tweet the code on your twitter. Checkout [core.clj](https://github.com/nddave/Sumai/blob/master/src/sumai/core.clj) to know more about how the rank is determined.

# License information

This work is licensed under a [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/). 

Program is created by [Nirman Dave](http://www.nirmandave.com) as a form of assignment for *Artificial Intelligence CS263* course at *Hampshire College, Amherst MA* under *Professor Lee Spector*.
