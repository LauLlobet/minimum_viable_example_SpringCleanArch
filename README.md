# Minimum example on clean architechture using Maven, SpringBoot & HSQL

Done following this [link](https://www.slideshare.net/mattiabattiston/real-life-clean-architecture-61242830)

### With the following goals:
#### Hard Skills Goals:
1.1 Learn Maven Multi Module : done
1.2 Learn SpringBoot : done
#### Skills goals:
2.1 Learn Clean Architechture : done
2.2 See if original solution had overkill testing
	2.2.1 in my opinion acceptance e2e had a duplication on the same purpose = overkill
	2.2.2 testing the framework ( an Http would call a controller) is redundant = overkill  
### Impact goals:
3.1 Have a seed from where to grow a personal project
3.2 Provide a Maven version of Mattias approach

## Found problems:
I've found that maven prevention on circular dependecies prevented me to have 

Greeter <---- GreetUseCase
   ^            |               CORE MAVEN MODULE 
--- \ --------- | -------------------------------------------> CIRCULAR DEPENDECY
     \          v               REPOSITORIES MAVEN MODULE
      \ GreeterRepo 

That forced me to have a Services Module

## Resulting set up:




It do
