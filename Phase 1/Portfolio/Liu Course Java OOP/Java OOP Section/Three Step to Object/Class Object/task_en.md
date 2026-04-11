# Give me a new, I want an object!

---

<br>

## class

- A "class" in Java is defined using `class`
- `class` is a very high-level construct in Java
- Class names follow the **"CamelCase" naming principle, starting with an uppercase letter**, for example: `class AbstractPersonCase`
- Generally, when a class is declared as `public`, the name of the `.java` file where the class is located must match the class name, otherwise a compilation error will occur
- A class in a program also reflects a class in the real world

<br>

## object

**Java: "Come `new` me!"**

- An object represents an instance of a class created in the program
- Objects are ubiquitous in Java, acting as carriers of all methods (behaviors, functions)
- Object names also follow the **"CamelCase" naming principle, starting with a lowercase letter**, for example: `personCase`
- An object in a program also reflects an object in the real world
- Compared to classes, objects are instances that can perform behaviors, for example, eating an apple; you can't eat the class of an apple, only a specific apple (an object)

<br>

## new object creation

Ways to create objects:

- Define and create

`ClassName objectName = new ClassName();`

- Define then assign later

*Note: For learning functional programming, this method has "side effects" and is not recommended.*

```java
ClassName objectName = null;
objectName = new ClassName();
```

*In most cases, objects are created using the `new` keyword, but not limited to this method; others include using `clone()`, reflection with `newInstance()`, etc.*

<br>

---

<br>

***- Newbie TIPS -***

Newbies learning Java or any high-level language might be confused by the concept of OOP/Object-Oriented Programming. The essence of OOP is to explain the mundane code using the semantics of the objective world. If you are a newbie, make sure not to understand reality with programming logic but to understand programming with real-world logic.

High-level programming languages are considered "high-level" because their design logic aims to code the representation of the real world. The original intention of object-oriented programming is to make programming simpler. We hope newbies will soon open the door to "object-oriented" programming!

<br>

***- Little CASE -***

**1. Why does this class show an error? Try to solve this exception.**

**2. Write a class and create an object, and think: What does it imply when we create an object?**

<div class="hint">

Look at the .java file name of this class?

</div>

<br>

---

_Follow the entire network ID: **@老刘大数据** All rights reserved_

_More course resources: 692000925@qq.com_