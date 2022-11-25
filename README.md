
This repository contains a short reproducer of a bug that occurs during compilation of Java records.

Please refer to the commit for the shortest code example:
[https://github.com/nikita2206/jdk-records-generated-class-bug/commit/00b4c0fb0b6348c534dad1c2af1992c300ab0986](https://github.com/nikita2206/jdk-records-generated-class-bug/commit/00b4c0fb0b6348c534dad1c2af1992c300ab0986)

### Short description

We are using the Immutables library here which, using annotation processing, generates classes that implement your 
interfaces that describe an immutable data structure.

The interface `GeneratedClass` leads to a generation of an implementation under the name of `ImmutableGeneratedClass`.

There is a Java record called `JavaRecord` which, among others declares the following field which leads to a compilation error:
```java
List<ImmutableGeneratedClass> thisWillFailCompilation
```

The error reads as follows:
```
java.lang.AssertionError: typeSig ERROR
```
