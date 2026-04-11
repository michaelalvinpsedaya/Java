# Nine sons of the dragon, each different

---

<br>

Polymorphism is a concept built upon inheritance; we cannot simply explain what polymorphism is. The descendants of a class can have different behaviors, which can diverge laterally or continue from generation to generation (longitudinally), but regardless of how the descendants change, these changes are summarized based on a common parent class.

<br>

At the implementation level in Java, the reference of the **parent class pointing to an object of the subclass** is commonly used, which demonstrates the idea of polymorphism.

For example, for

`Playboy playboy = new Playboy();`

due to the known inheritance relationship

`class Playboy extends Person // ... `

we often tend to use

`Person person = new Playboy();`

This way of declaring an object reflects polymorphism.

Because for the reference `Person person`, it can not only point to the `new Playboy()` object but also switch to the `new NiceGirl()` object if needed, allowing flexibility between the object and its reference.

<br>

Polymorphism enables the switching of subclass objects, and of course, further realizes the switching of subclass behaviors because the behaviors encapsulated by subclasses are different. We will specifically discuss this in the upcoming sections on **Method Overloading** and **Method Overriding**.

<br>

***- Little CASE -***

**1. Compare the different processes of creating reference classes, and note which class the `play()` method call comes from. What does it illustrate?**

<div class="hint">

The method call is determined by the actual object created, and the reference serves only as the receiver type of the object.

</div>

**2. (Optional) Try to translate the following paragraph using the vocabulary you've accumulated and your understanding of polymorphism:**

If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

In Java, we use method overloading and method overriding to achieve polymorphism.

Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc.

Ref: https://www.javatpoint.com/java-oops-concepts

<div class="hint">

If a task is presented in different ways, it is called polymorphism. For example, persuading different customers in different ways, or drawing some shapes like triangles, rectangles, etc.

In Java, we use method overloading and method overriding to achieve polymorphism.

Another example is the sounds of animals, such as cats "meow", dogs "woof", etc.

</div>

<br>

---

_Follow across platforms: **@老刘大数据** All rights reserved_

_More course resources: 692000925@qq.com_