# Singleton

## Creational pattern design

<p>The proposition of this application is to understand the pattern design Singleton.
This program show in console the flow of creation instance with Singleton pattern.</p>

<p>At the end of the execution of the program and analyzing the log we can that this pattern creates a unique instance of a class.</p>

## Architecture

![Architecture diagram.](https://raw.githubusercontent.com/DeyvidGar/assets/master/Singleton-pattern.png)

## Description

<p>This application consist of two forms to implements Singleton in: Mono-thread and Multi-thread.</p>

### Mono-thread execution.

- If work in only thread we can use the method:

```java
public static SingletonClass getSingleton(String id) {}
```

<p>Because this method check if the instance of the class has been created.</p>
<p>In log we can see the ID for instance of class:</p>

> Creating a instance with id class: FOO
> 
> Id class = FOO
> 
> Creating a instance with id class: BOO
> 
> Id class = FOO

### Multi-thread execution.

- If work with multiples thread we can use the method:

```java
public synchronized static SingletonClass getSingletonThreads(String id) {}
```

<p>Because this method control in the multiples threads the instance of the class when has been created.</p>
<p>In log we can see the ID for instance of class:</p>

> Creating a instance with id class: BOO
> 
> Id class = FOO
> 
> Creating a instance with id class: FOO
> 
> Id class = FOO

## What i need?

<p>You need to have installed:<p>

- Java 1.8 or >
- Maven.
- Intellij IDE.
- Eclipse or STS IDE.

## What run the application?

### For windows console

<p>We can run the application in console following the next steps:</p>

```console
1. mvn clean install
```

```console
2. mvn compile
```

```console
3. mvn exec:java -Dexec.mainClass="com.midominio.proxy.Proxy"
```

### For Intellij IDE

<p>We can run the application in intellij following the next steps:</p>

```console
1. Find the main class in com.midominio.proxy.Proxy.java
```

```console
2. Right click and Run 'Proxy.main()'
```

### For Eclipse or STS IDE

<p>We can run the application in Eclipse following the next steps:</p>

```console
1. Find in the package explorer this proyect
```

```console
2. Right click and Run as -> java proyect.
```

