# I am `this`, and my dad is `super`!

---

<br>

**`this` and `super` serve similar functions, both representing specific objects that can directly call properties and methods, but they refer to different classes.**

<br>

## `this` keyword

- Used to refer to **an object of the current class** within the current class

<br>

## `super` keyword

- Used to refer to **an object of the superclass of the current class**
- `super` has a special role; when there are multiple constructors in the superclass, you can use `super();` to specify which superclass constructor to call

<br>

---

<br>

***- Novice TIPS -***

`this` and `super` are context-dependent references. What they specifically refer to depends on the class they are used in. If you move out of the current class, they lose their role and meaning in this class.

<br>

***- Small CASE -***

**1. In the `Playboy` class, `this` refers to an object of `Playboy`, while `super` refers to an object of `Playboy`'s superclass `Person`. If used in `Person`, what do `this` and `super` refer to?**

**2. Consider if the access to `this.id` in the `Playboy` constructor can succeed. Why or why not? How should it be handled?**

<div class="hint">

Note the significance of the modifier `private` for an object's attributes. What does it imply?

</div>

<br>

---

_Follow the ID: **@老刘大数据** All Rights Reserved_

_More course resources: 692000925@qq.com_