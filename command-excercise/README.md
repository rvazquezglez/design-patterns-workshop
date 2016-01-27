# Command Pattern exercise
## Cash Register
Your task is to implement a simple cash register with Command. This cash register is very basic: it only handles whole dollars, and it contains a total amount of cash. Cash can only be added to the register.

You’ll keep a log of transactions so that you can replay them. With a traditional OO focus you'll get something like the next diagram:


![Cash Register class diagram](command-excercise-classes.png)

*Extra points*: If you implement this in Scala, Clojure or Java 8 avoiding the command interface.