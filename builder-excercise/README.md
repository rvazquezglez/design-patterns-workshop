# Builder pattern exercise

## Refactoring test with telescoping constructor anti-pattern

Company S Inc has a legacy system where it has a GodObject from a class called 
AlphaBigFatService. The programmers working there have been constantly complaining about 
how difficult is to add a new test for this class, they always end up writing a lot code, 
and when they are arranging things up they need to create mocks, just the necessary 
to test a bunch of code, but since the AlfaBigFatService has a lot of dependencies that
are final they need to write a lot of null values on the constructor and struggle knowing
where need to pass the required value for the test.

Your assignment is to find a way to keep the AlphaBigFatService but make a easy way to
write test and also clean the existing ones.

*Extra points*: if you can do this in Scala or Clojure.
