# Java Bean —— The Best Coffee Bean in the World

---

<br>

## Encapsulating a Java Bean

A small Java Bean may look "simple," yet it forms the foundation of J2EE enterprise-level development. From basic object-oriented small CASES to large frameworks (such as SpringMVC, EJB, etc.) applications, Java Beans are ubiquitous.

In short, if a Java class is defined in the following specific manner, it is said to be a Bean:

- **Class Name**: Represents a relatively descriptive entity or a clear relationship, such as Student class, Course class, CourseSelection class.
- **Attributes**: Contains `private` privatized attribute information
- **Access Methods**: Contains `public` public access methods, namely `Getter/Setter`
- Usually exists as an independent `public class`, allowing class inheritance, aggregation relationships, and interface implementation

### Uses

- Java Bean is part of the `MVC/Model-View-Control` development model in the `Model` layer, sometimes referred to as an Entity.
- A Java Bean can map to a database table, and operations on the Bean can reflect in the database:

| Java Bean | Database Table |
|-----------|---------------|
| Class Name | Table Name   |
| Object     | Row          |
| Attribute Name | Column   |
| Attribute Value | Column Value |

<br>

---

<br>

***- Small CASE -***

**1. With reference to the `Student` class, complete the definition of the `Course` and `CourseSelection` classes and describe what functionality they might implement.**

<br>

---

_Follow the full network ID: **@老刘大数据** All rights reserved_

_More course resources: 692000925@qq.com_