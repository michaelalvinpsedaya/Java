# The Journey of Overloading

---

<br>

## constructor overloading

**The following two constructors have the same name but different parameter lists; they are method overloading**

```java
public Person()

public Person(String name, Integer id)
```

Constructors are the matrix of creating objects, the creator in the Java world, determining how objects come into the Java world.

In the `Person` class

- `public Person()`

Some people are born with everything they should have, with name and status, family and background (parameterized constructor).

- `public Person(String name, Integer id)`

Some are born ordinary, with nothing (non-parameterized constructor), no name, no stature, only a shell of life, coming into the world like insignificant weeds, but with an unyielding heart, determining their destiny by themselves, striving through effort (dynamic assignment) to create everything belonging to them.

The chance to come into the world and the chance to strive within it are always fair. In the Java world, regardless of origin, every object has its own value. We can achieve conditions not endowed innately through later `Getter/Setter` methods.

<br>
<br>
<br>

---

### I was born to be a mountain, not a stream; to overlook the barren ravines. I was born to be an outstanding person, not a nameless weed, standing on the shoulders of giants, looking down upon the cowardly.

---

<br>
<br>
<br>

## property injection

The process of assigning values to properties when creating an object is generally referred to as **property injection**, which can be done in two ways:

- **Constructor injection**: Assigning values through the constructor method
- **Setter injection**: Using Setter methods to assign values after the object is constructed

The usual practice is to first construct a basic object and dynamically assign values to properties during the program using Setter methods, providing more flexibility.

<br>

---

<br>

***- Small CASE -***

**1. Run the example code to experience the value passing process using the two constructors.**

**2. Determine where in the example code constructor injection is used and where Set injection is used, appreciating the similarities and differences.**

<br>

---

_Follow on all platforms: **@Lao Liu Big Data** All rights reserved_

_More course resources: 692000925@qq.com_