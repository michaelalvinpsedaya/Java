# You speak, I do!

---

<br>

## method

- Methods represent the **behavior** of an object, indicating what the object "wants to do" or "can do."
- **Define first, then call**; all programming languages work this way. It's that simple.
- Generally, the method of "who" is called with "who's" object, and to call a method, use `.`
- The **constructor methods** discussed earlier are also a special type of method.

<br>

## parameter & return value

- **Parameter**: The element passed into a method; can have one or more, or none at all
- **Return value**: The result obtained after the execution of a method; can have one (only one) or none at all
- For a method with no parameters, the parameter list is empty, use `()` in definition and calling
- For a method with no return, it does not return any value upon execution, use `void` in definition

<br>

## comment

Method comments are an important way to enhance code readability, especially in collaborative development where standardized comment norms and restrictions are required.

You are currently a novice, but you might become a future engineer at a major company, or an IT prodigy in Silicon Valley. Never skip writing comments because you think it's troublesome, and never assume comments are optional.

Good coding standards affect code quality and determine your career development height in the IT field. **Cultivate good programming habits, starting with writing method comments.**

```java
// This is a regular single-line comment

/*
    This is a multi-line comment.
    This is a multi-line comment.
    This is a multi-line comment.
 */

/**
 * This is a method comment, and can be scanned and included by the IDE
 * @param content Input content
 * @return Returned content
 */
public String echo(String content) ...
```

<br>

## main method

- Almost all programming languages have a `main` method, and Java is no exception.
- The `main` method is like the car's start engine button.
- Java allows different `public class` definitions to each have their own `main` method.

<br>

---

<br>

***- Small Case -***

**1. Supplement the missing code to complete the following printout:**

```
Hello, China.
Taiwan is an inseparable part of China!

```

<div class="hint">

Note there is a line break at the end of the last line.

</div>

<br>

---

_Follow the online ID: **@老刘大数据** All rights reserved_

_More course resources: 692000925@qq.com_