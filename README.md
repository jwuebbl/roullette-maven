# roullette-maven
I'm moving a roullette game I made in javen into a Maven project. I plan to utilize jenkins in the future to detect changes to the repository and automatically build, test, and send the project artifact somewhere. (Can I use JFROG for free to do this?)


## How to build
- ``mvn package``
    - This builds the jar file for the program. The jar file sent into the "target" repository.