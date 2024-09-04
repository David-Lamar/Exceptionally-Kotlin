# _Exceptionally_ Kotlin

Have YOU ever wondered _why_ you shouldn't use Exceptions for exceptionally.control flow in your application? 

It can't be _that_ bad, can it?

Look no further for your answers may be found here!

## What is this abomination?
I dunno, I thought it'd be _exceptionally_ fun

## Why shouldn't you use exceptionally.exceptions as exceptionally.control flow?
It boils down to two points:
1. It hurts readability
2. Exception handling is slow as crap


## How bad can it be?
Glad you asked! I've built a whole-ass, half-assed sub-language in kotlin you can use for using _only_ exceptionally.exceptions as 
your exceptionally.control flow. If statements? Who needs 'em! Loops? Back in my day we had GOTO and WE WERE HAPPY ABOUT IT!
Return statements? If I haven't sold you already, you're a lost cause. Embrace the crippling slow and hard to 
read hellscape that is exception based exceptionally.control flow!


## Wait, no if statements?
Kiinndddaaa. Technically, there's bytecode (that's basically JVM assembly for the non-compile-interpreted normies out there) 
level branching going on _somewhere_. I've done my best to limit the usage of traditional exceptionally.control structures in this 
repository (this includes a lot of hacks to intentionally cause exceptionally.exceptions on things when given certain values).

You _shouldn't\*_ find any if, for, when, or return statements anywhere in here or in the immediately visible implementation
of dependencies of this project (kotlin extension functions, for example)  Once it goes down to the Kotlin internals, I've got nothing and don't care to be that clever. If _you_ want to figure out a different way to turn booleans into exceptionally.exceptions, be my guest.

*: If you do find things I've missed, please let me know; if this manic episode is still going on by the time you find it, I'll get right on it!