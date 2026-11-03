Practice goal: The goal of this practice is to familiarize with the 
               IDE IntelliJ and with the git through the implementation
               of a simple class and a main program which tests that class,
               many times.

This program must be executed from the file "Main.java", which is the main 
project's file.

This project uses the version 27 of JDK "<openjdk-27>"

This program's files are located in the package software.ulpgc. This project
is composed by two files: "Task.java", "Main.java".

The first one has the implementation of the class Task, which is a class
with some private attributes, a constructor, some getters and setters for each
attribute, and a method with returns the result of a simple calc made with some
of the attributes of the class

The other file is the main one. In that file it is implemented an instance of
Task and all the Class Task's methods are tested.

The git structure is the next:
The branch "master" is the main one, here is the final project
The branches "develop", "develop2", "develop3" has the repetitions of the practice,
these branches were used to implement the first versions of the code. There are here
some commits of each code version.
When the practice was finished, it was done a "push" to GitHub

The steps followed to clone the repository are the next: First, go to the menú bar 
"Git" of IntelliJ, then select the option "Clone...", this option allows the user 
to clone a GitHub repository; then select the option GitHub, and the GitHub 
repository to clone, specify the folder route into the disk, finally click the 
button "Clone". The repository selected was cloned into the directory specified.

To test that the Project compiles outside the original repository, the cloned 
Project was compiled doing the same explained before.

Link to the explanatory video: https://youtu.be/mG8mdbXnlJk

In this project it was implemented the class Task.java. This class is a simple task
system. To create a new task object, it is necessary to specify the beginning date,
which is the date when the task starts; the end date, which is the date when the
task finishes, and a description, which is the task. The attributes "beginning",
"end", and "description" are all privates, so it was necessary to implement some
getters to get the attribute's values and some setters to modify that values. There
is also implemented a method which does a simple math calc to obtain the task's time
limit, it is only a simple substraction, "end" minus "beginning", then the method
returns the result.