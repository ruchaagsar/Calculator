# calculator

---

#### Author: Rucha Prakash Agsar 
#### Objective: 
Implement a simple, extensible calculator in Java that supports multiple operations. 

#### How to build a jar:
`mvn clean install`

#### How to execute the jar:
`cd {project folder}`
`java -jar calculator-1.0.jar`

#### How open-closed principle is achieved:
Addition of operations in Operation enum does not cause code in Calculator to get modified.

#### Assumption:
* Operations are binary operations
* During chaining of operations, operator precedence rules are not followed.
