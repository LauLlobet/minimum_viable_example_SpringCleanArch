# Minimum example on clean architechture using Maven, SpringBoot & HSQL

Done following this [link](https://www.slideshare.net/mattiabattiston/real-life-clean-architecture-61242830)

![alt text](https://github.com/LauLlobet/minimum_viable_example_SpringCleanArch/raw/master/clean%20architechture%20slides/architecture.png)

### With the following goals:
#### Hard Skills Goals:
* Learn Maven Multi Module : done
* Learn SpringBoot : done
#### Skills goals:
* Learn Clean Architechture : done
* See if original solution had overkill testing
* In my opinion acceptance e2e had a duplication on the same purpose = overkill  
* Testing the framework ( an Http would call a controller) is redundant = overkill    
### Impact goals:
* Have a seed from where to grow a personal project
* Provide a Maven version of Mattias approach

## Found problems:
I've found that maven prevention on circular dependecies prevented me to have 

       Greeter <---- GreetUseCase  
          ^            |               CORE MAVEN MODULE   
       --- \ --------- | -------------------------------------------> CIRCULAR DEPENDECY  
            \          v               REPOSITORIES MAVEN MODULE  
              GreeterRepo  

That forced me to have a Services Module

## Resulting set up:

![alt text](https://github.com/LauLlobet/minimum_viable_example_SpringCleanArch/raw/master/clean%20architechture%20slides/module_schema.png)

Postive : It haves core domain not dependant on framework
Negative : It shouts architechture and not domain at first sight
