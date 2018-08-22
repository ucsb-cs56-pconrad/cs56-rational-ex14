# rational-ex14


This repo is a work in progress on demonstrating Lambdas and Functional Interfaces in Java.

See also: <https://www.baeldung.com/java-8-functional-interfaces>

"Site" published by `mvn site`: <https://ucsb-cs56-pconrad.github.io/cs56-rational-ex14/apidocs>


Javadoc: <https://ucsb-cs56-pconrad.github.io/cs56-rational-ex14/apidocs>

Test Coverage: <https://ucsb-cs56-pconrad.github.io/cs56-rational-ex14/jacoco>

# A table of Rationals

We are going to implement a method

```java
  String tableOfRationalsMarkdown(int rows, int cols) { ...
```

This method will produce a table such as this one for the call:

Rational.tableOfRationalsMarkdown(3,4)

Numerators

```
| |1|2|3|4|
|-|-|-|-|-|
|1|1|2|3|4|
|2|1/2|1|3/2|2|
|3|1/3|2/3|1|4/3|
```
When rendered as Markdown, that looks like this:


| |1|2|3|4|
|-|-|-|-|-|
|1|1|2|3|4|
|2|1/2|1|3/2|2|
|3|1/3|2/3|1|4/3|

But what we'd really like to be able to do, is select how the numbers are formatted in a flexible way.

For example, I'd also like to get a table like this one:



| |1|2|3|4|
|-|-|-|-|-|
|1|1.000|2.000|3.000|4.000|
|2|0.500|1.000|1.500|2.000|
|3|0.333|0.667|1.000|1.333|

```java
Rational.tableOfRationalsMarkdown(int rows,int cols,Rational2String r2s)
```
