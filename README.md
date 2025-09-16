// Variables in Java

A variable in Java is a reserved memory location that stores data. Every variable has:

A name (identifier)

A data type (decides what kind of value it can hold)

A scope (where it can be accessed)

A lifetime (how long it exists in memory)

🔹 Types of Variables in Java

Java variables are mainly divided into three categories based on where they are declared and how they behave.

1. Local Variables

Declared inside methods, constructors, or blocks.

Created when the method is invoked and destroyed when it exits.

Must be explicitly initialized before use (no default values).

Scope is limited to the block/method they belong to.

✅ Example:

public void display() {
    int localVar = 100;  // local variable
    System.out.println("Local Variable: " + localVar);
}

2. Instance Variables (Non-Static Fields)

Declared inside a class but outside any method, block, or constructor.

Each object of the class gets its own copy.

They are created when an object is created and destroyed when the object is destroyed.

If not initialized, they get default values (e.g., 0 for int, null for String).

✅ Example:

class Student {
    String name; // instance variable
    int age;     // instance variable
}

3. Static Variables (Class Variables)

Declared using the static keyword inside a class.

Shared among all objects of the class (only one copy exists in memory).

Created when the class is loaded into memory and destroyed when the class is unloaded.

Can be accessed without creating an object (using ClassName.variable).

✅ Example:

class Student {
    static String college = "JNTUH"; // static variable
    int rollNo;
}

// Data Types in Java

Data Types in Java

In Java, a data type specifies the kind of data that a variable can hold. Since Java is a strongly typed language, every variable must be declared with a data type before use.

Java data types are broadly classified into two categories:

1.Primitive Data Types (built-in, simple values)

2.Non-Primitive Data Types (objects, references, user-defined types) 


| Category       | Data Type | Size             | Range/Values         | Default Value | Example                     |
| -------------- | --------- | ---------------- | -------------------- | ------------- | --------------------------- |
| Integer Types  | `byte`    | 8-bit            | -128 to 127          | 0             | `byte b = 10;`              |
|                | `short`   | 16-bit           | -32,768 to 32,767    | 0             | `short s = 100;`            |
|                | `int`     | 32-bit           | -2^31 to 2^31-1      | 0             | `int age = 22;`             |
|                | `long`    | 64-bit           | -2^63 to 2^63-1      | 0L            | `long phone = 9876543210L;` |
| Floating-Point | `float`   | 32-bit           | \~7 decimal digits   | 0.0f          | `float pi = 3.14f;`         |
|                | `double`  | 64-bit           | \~15 decimal digits  | 0.0d          | `double price = 123.456;`   |
| Character      | `char`    | 16-bit (Unicode) | '\u0000' to '\uffff' | '\u0000'      | `char grade = 'A';`         |
| Boolean        | `boolean` | 1-bit            | true / false         | false         | `boolean isJavaFun = true;` |


✅ Notes:

int is the default type for integers.

double is the default type for floating-point numbers.

char can store any Unicode character (not just English letters).

boolean is used for logical conditions.

🔹 2. Non-Primitive Data Types (Reference Types)

Non-primitive types store references (memory addresses) of objects, not actual values.

Common Non-Primitive Types:

String → sequence of characters.

String name = "Akhila Katighar";


Arrays → collection of similar data types.

int[] numbers = {1, 2, 3, 4, 5};


Classes & Objects → user-defined data types.

class Student {
    String name;
    int age;
}


Interfaces → abstract types defining behavior.

Enums → special type for fixed sets of constants.

enum Day { MONDAY, TUESDAY, WEDNESDAY }

// Wrapper Classes

Each primitive data type has a wrapper class in java.lang package to treat primitives as objects.
| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |

// 🔹 Type Casting in Java

Sometimes you need to convert data from one type to another. Java supports two types of casting:

1. Widening (Implicit Casting)

Converting smaller type → larger type.

Done automatically (safe).

int a = 10;
double b = a;  // int to double

2. Narrowing (Explicit Casting)

Converting larger type → smaller type.

Requires explicit cast, may lose data.

double x = 9.8;
int y = (int) x;  // double to int










