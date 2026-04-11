# Trashy guys are also people

---

<br>

## inheritance

- Classes are not isolated; the most direct relationship is **inheritance**, represented by the `extends` keyword.
- If `class Playboy extends class Person`, then `Playboy` (Trashy Guy class) inherits the non-private attributes and methods of `Person` (Person class). `Person` is called the **parent class (or base class)** of `Playboy`, and conversely, `Playboy` is a **subclass**.
- Inheritance also has significant real-life implications, such as inheriting parents' bloodlines, surnames, and estates. For example, no matter how trashy a guy is, he still has human nature (inherits from the `Person` class). We can't just say "Trashy guys aren't people"...
- The parent class can define properties or methods as `private`, which prevents them from being inherited by subclasses.

<br>

## constructor passing

- Constructors have a passing effect in inheritance relationships.
- **When constructing a subclass object, regardless of whether it's explicitly called, the parent class's constructor will be called by default, then the subclass's constructor, and the contents of the parent class's constructor will be passed to the subclass.**
- The real-life implication is that there must be a parent class before there can be descendants. Descendants (subclasses) cannot appear out of thin air.

<br>

---

<br>

***- A Small Task -***

**1. Execute the program, observe the construction process of the `playboy` object, and consider its real-life significance.**

<br>

---

_Follow global ID:**@老刘大数据** All rights reserved_

_More course resources: 692000925@qq.com_