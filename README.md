# Java 8+ words substitution functions for building fluent api

![Java CI with Maven](https://github.com/stawirej/fluent-api/workflows/Java%20CI%20with%20Maven/badge.svg)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

## Executive summary

## Introduction

### Situation
When we create library or framework we expose methods with set of parameters as a public API. \
For methods with a small amount of parameters we might not have an issue with that. \
Especially when we provide decent documentation. We use them and experience shows we get used to their look.

### Complication
We struggle to introduce fluent api approach. It might rise some challenge for new or existing code. \
For covering trivial functionality connected with creating objects we always can use a builder pattern. \
We start to struggle when comes to create fluent api of more complicated behavior.

> Clean code is simple and direct. Clean code reads like well-written prose. \
> Clean code never obscures the designer’s intent but rather is full of crisp abstractions and straightforward lines of control.
> * Grady Booch author of Object Oriented Analysis and Design with Applications

Stop for a moment and try to think about part of above quote: "... well-written prose."

Often we encounter methods like:
```java
library.lend(book, reader);
```

Due to decent naming we clearly see this code realize book lending functionality. \
However, try to read that code at loud. You will get something like: "Library lend book reader".\
Doesn't sound as "well-written prose"? It doesn't even sound as a proper sentence.

### Key question
How can we easily build a fluent API in Java and mimic natural language?

## Answer
Higher order function, function currying, decorator.
 
## Appendix

### Maven Central