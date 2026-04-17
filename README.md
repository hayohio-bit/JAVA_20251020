# Java 핵심 정리 (Java Core Summary)

---

## 📖 목차 (Table of Contents)

1. [기본 문법 (Basic Syntax)](#1-기본-문법-basic-syntax)
2. [데이터 타입 (Data Types)](#2-데이터-타입-data-types)
3. [제어문 (Control Statements)](#3-제어문-control-statements)
4. [객체지향 (Object-Oriented Programming)](#4-객체지향-object-oriented-programming)
5. [OOP 4대 특성 (Four Pillars of OOP)](#5-oop-4대-특성-four-pillars-of-oop)
6. [접근 제한자 (Access Modifiers)](#6-접근-제한자-access-modifiers)
7. [컬렉션 (Collection Framework)](#7-컬렉션-collection-framework)
8. [예외 처리 (Exception Handling)](#8-예외-처리-exception-handling)

---

## 1. 기본 문법 (Basic Syntax)

### 1.1 클래스 선언

```java
public class ClassName {
    // 필드, 메서드, 생성자 등
}
```

- Java의 모든 코드는 **클래스 내부**에 작성된다.
- 파일명은 반드시 **public 클래스명과 동일**해야 한다. (예: `ClassName.java`)
- 하나의 `.java` 파일에는 **하나의 public 클래스**만 허용된다.

### 1.2 메인 메서드 (Entry Point)

```java
public static void main(String[] args) {
    System.out.println("Hello, Java!");
}
```

| 키워드 | 설명 |
|---|---|
| `public` | JVM이 외부에서 접근할 수 있도록 공개 |
| `static` | 객체 생성 없이 JVM이 직접 호출 가능 |
| `void` | 반환값 없음 |
| `String[] args` | 커맨드라인 인자를 배열로 전달받음 |

### 1.3 변수 선언

```java
// 변수 선언 및 초기화
int number = 10;
String name = "Java";

// 선언 후 초기화
int age;
age = 25;
```

- 변수명은 **소문자 카멜케이스(camelCase)** 를 따른다.
- 선언 시 반드시 **타입을 명시**해야 한다. (Java는 정적 타입 언어)

### 1.4 상수 (Constants)

```java
final double PI = 3.14159;
final int MAX_SIZE = 100;
```

- `final` 키워드를 사용하여 선언한다.
- 선언과 동시에 초기화하며, **이후 값 변경이 불가능**하다.
- 상수명은 **대문자 스네이크케이스(UPPER_SNAKE_CASE)** 를 따른다.

### 1.5 주석 (Comments)

```java
// 한 줄 주석

/* 
   여러 줄 주석
*/

/**
 * JavaDoc 주석
 * @param name 파라미터 설명
 * @return 반환값 설명
 */
```

---

## 2. 데이터 타입 (Data Types)

### 2.1 기본형 (Primitive Types)

| 분류 | 타입 | 크기 | 기본값 | 범위 / 설명 |
|---|---|---|---|---|
| **정수형** | `byte` | 1 byte | `0` | -128 ~ 127 |
| | `short` | 2 bytes | `0` | -32,768 ~ 32,767 |
| | `int` | 4 bytes | `0` | 약 ±21억 (가장 많이 사용) |
| | `long` | 8 bytes | `0L` | 매우 큰 정수, 리터럴에 `L` 접미사 |
| **실수형** | `float` | 4 bytes | `0.0f` | 소수점 약 7자리, 리터럴에 `f` 접미사 |
| | `double` | 8 bytes | `0.0d` | 소수점 약 15자리 (기본 실수 타입) |
| **문자형** | `char` | 2 bytes | `'\u0000'` | 단일 문자, 유니코드 (예: `'A'`, `'가'`) |
| **논리형** | `boolean` | 1 bit* | `false` | `true` 또는 `false` |

> *`boolean`의 실제 메모리 크기는 JVM 구현에 따라 다를 수 있다.

### 2.2 참조형 (Reference Types)

```java
String text = "Hello";          // 문자열
int[] numbers = {1, 2, 3};     // 배열
List<String> list = new ArrayList<>();  // 클래스/인터페이스
```

| 타입 | 설명 |
|---|---|
| `String` | 문자열 객체 (불변, Immutable) |
| `Array` | 같은 타입의 데이터를 고정 크기로 저장 |
| `Class` | 사용자 정의 또는 라이브러리 클래스의 인스턴스 |
| `Interface` | 인터페이스를 구현한 객체 참조 |
| `Enum` | 열거형 상수 집합 |

- 참조형 변수는 **객체의 메모리 주소(참조값)** 를 저장한다.
- 기본값은 `null`이다.

### 2.3 형 변환 (Type Casting)

```java
// 자동 형 변환 (Widening) : 작은 타입 → 큰 타입
int intVal = 10;
double doubleVal = intVal;   // int → double (자동)

// 강제 형 변환 (Narrowing) : 큰 타입 → 작은 타입
double pi = 3.14;
int intPi = (int) pi;       // double → int (강제, 소수점 이하 손실)

// 문자열 변환
String str = String.valueOf(100);     // int → String
int num = Integer.parseInt("100");    // String → int
```

| 변환 방향 | 방식 | 데이터 손실 |
|---|---|---|
| `byte → short → int → long → float → double` | 자동 (묵시적) | 없음 |
| `double → float → long → int → short → byte` | 강제 (명시적) | 가능성 있음 |

### 2.4 Wrapper 클래스

| 기본형 | Wrapper 클래스 |
|---|---|
| `int` | `Integer` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |
| `long` | `Long` |
| `float` | `Float` |
| `byte` | `Byte` |
| `short` | `Short` |

```java
// Auto-boxing: 기본형 → Wrapper
Integer wrapped = 10;

// Auto-unboxing: Wrapper → 기본형
int unwrapped = wrapped;
```

- 컬렉션(Collection)은 **객체만 저장 가능**하므로 Wrapper 클래스가 필요하다.
- `null`을 가질 수 있어 **데이터베이스 연동** 시 유용하다.

---

## 3. 제어문 (Control Statements)

### 3.1 조건문 (Conditional Statements)

#### if / else if / else

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```

#### switch

```java
String day = "MON";

switch (day) {
    case "MON":
    case "TUE":
    case "WED":
    case "THU":
    case "FRI":
        System.out.println("평일");
        break;
    case "SAT":
    case "SUN":
        System.out.println("주말");
        break;
    default:
        System.out.println("잘못된 입력");
}
```

- Java 14+에서는 **Switch Expression** 사용 가능:

```java
String result = switch (day) {
    case "MON", "TUE", "WED", "THU", "FRI" -> "평일";
    case "SAT", "SUN" -> "주말";
    default -> "잘못된 입력";
};
```

#### 삼항 연산자 (Ternary Operator)

```java
int age = 20;
String status = (age >= 18) ? "성인" : "미성년자";
```

### 3.2 반복문 (Loop Statements)

#### for

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

#### enhanced for (for-each)

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

#### while

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}
```

#### do-while

```java
int count = 0;
do {
    System.out.println(count);
    count++;
} while (count < 5);
```

- `do-while`은 **최소 1회 실행이 보장**된다.

### 3.3 분기문 (Branch Statements)

| 키워드 | 설명 | 사용 위치 |
|---|---|---|
| `break` | 반복문 또는 switch문을 즉시 종료 | 반복문, switch |
| `continue` | 현재 반복을 건너뛰고 다음 반복으로 이동 | 반복문 |
| `return` | 메서드를 즉시 종료하고 값을 반환 | 메서드 |

```java
// break 예시
for (int i = 0; i < 10; i++) {
    if (i == 5) break;    // i가 5일 때 반복문 종료
    System.out.println(i); // 0, 1, 2, 3, 4 출력
}

// continue 예시
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) continue;  // 짝수는 건너뜀
    System.out.println(i);      // 1, 3, 5, 7, 9 출력
}

// 라벨을 사용한 중첩 반복문 탈출
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 2) break outer;  // 외부 반복문까지 종료
    }
}
```

---

## 4. 객체지향 (Object-Oriented Programming)

### 4.1 클래스 (Class)

객체를 생성하기 위한 **설계도(템플릿)**

```java
public class Car {
    // 필드 (속성)
    private String brand;
    private int speed;

    // 생성자
    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // 메서드 (기능)
    public void accelerate(int amount) {
        this.speed += amount;
    }

    // Getter / Setter
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}
```

### 4.2 객체 (Object)

클래스를 기반으로 **메모리에 생성된 실체(인스턴스)**

```java
Car myCar = new Car("Hyundai");
myCar.accelerate(60);
System.out.println(myCar.getSpeed());  // 60
```

| 용어 | 설명 |
|---|---|
| 클래스 | 설계도 |
| 객체 | 설계도로 만든 실체 |
| 인스턴스 | 특정 클래스로부터 생성된 객체를 강조할 때 사용 |

### 4.3 생성자 (Constructor)

객체가 생성될 때 **자동 호출**되어 초기화를 수행하는 특수 메서드

```java
public class User {
    private String name;
    private int age;

    // 기본 생성자 (No-args Constructor)
    public User() {
        this.name = "Unknown";
        this.age = 0;
    }

    // 매개변수 생성자 (Parameterized Constructor)
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 생성자 오버로딩 + 생성자 체이닝
    public User(String name) {
        this(name, 0);  // 다른 생성자 호출
    }
}
```

- 클래스명과 동일한 이름을 가진다.
- 반환 타입이 없다.
- 생성자를 하나도 정의하지 않으면 **기본 생성자가 자동 생성**된다.
- 하나라도 직접 정의하면 기본 생성자는 자동 생성되지 않는다.

### 4.4 메서드 (Method)

클래스의 **동작(기능)** 을 정의

```java
// 메서드 구조
접근제한자 [static] 반환타입 메서드명(매개변수) {
    // 구현
    return 반환값;  // void일 경우 생략 가능
}

// 예시
public int add(int a, int b) {
    return a + b;
}

public void printMessage(String msg) {
    System.out.println(msg);
}
```

#### 메서드 오버로딩 (Method Overloading)

같은 이름의 메서드를 **매개변수의 타입, 개수, 순서**를 다르게 하여 여러 개 정의

```java
public int calculate(int a, int b) { return a + b; }
public double calculate(double a, double b) { return a + b; }
public int calculate(int a, int b, int c) { return a + b + c; }
```

> 반환 타입만 다른 것은 오버로딩이 아니다.

### 4.5 필드 (Field)

클래스의 **상태(속성)** 를 나타내는 변수

```java
public class Student {
    // 인스턴스 변수: 객체마다 독립적
    private String name;
    private int grade;

    // 클래스 변수 (static): 모든 객체가 공유
    private static int studentCount = 0;

    // 상수
    private static final String SCHOOL_NAME = "Java High School";

    public Student(String name) {
        this.name = name;
        studentCount++;
    }
}
```

| 변수 종류 | 키워드 | 생성 시점 | 소멸 시점 | 저장 위치 |
|---|---|---|---|---|
| 인스턴스 변수 | (없음) | 객체 생성 시 | 객체 소멸 시 (GC) | Heap |
| 클래스 변수 | `static` | 클래스 로딩 시 | 프로그램 종료 시 | Method Area |
| 지역 변수 | (없음) | 메서드 호출 시 | 메서드 종료 시 | Stack |

### 4.6 this 키워드

```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;   // this: 현재 객체의 참조
    }

    public Person getThis() {
        return this;        // 현재 객체 자체를 반환
    }
}
```

- `this.필드명`: 매개변수와 필드명이 같을 때 구분
- `this()`: 같은 클래스의 다른 생성자 호출 (생성자의 첫 줄에서만 가능)

---

## 5. OOP 4대 특성 (Four Pillars of OOP)

### 5.1 캡슐화 (Encapsulation)

데이터(필드)와 이를 처리하는 메서드를 하나로 묶고, **외부로부터 데이터를 은닉**하는 것

```java
public class BankAccount {
    // 외부 접근 차단 (데이터 은닉)
    private double balance;
    private String owner;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // 공개 메서드를 통해서만 데이터 접근/수정 가능
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    // Getter: 읽기 전용 접근
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
```

**핵심 원칙:**
- 필드는 `private`으로 선언한다.
- 외부에서는 `public` 메서드(Getter/Setter)를 통해서만 접근한다.
- **유효성 검사** 로직을 메서드 내부에 포함하여 데이터 무결성을 보장한다.
- 내부 구현을 변경해도 외부 코드에 영향을 주지 않는다.

### 5.2 상속 (Inheritance)

기존 클래스(부모)의 **필드와 메서드를 자식 클래스가 물려받아** 재사용하고 확장하는 것

```java
// 부모 클래스 (Super Class)
public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹습니다.");
    }

    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
}

// 자식 클래스 (Sub Class)
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);   // 부모 생성자 호출
        this.breed = breed;
    }

    // 메서드 오버라이딩 (Method Overriding)
    @Override
    public void eat() {
        System.out.println(name + "이(가) 사료를 먹습니다.");
    }

    // 자식 클래스 고유 메서드
    public void bark() {
        System.out.println(name + "이(가) 짖습니다.");
    }
}
```

**핵심 사항:**
- `extends` 키워드로 상속을 선언한다.
- Java는 **단일 상속**만 지원한다. (다중 상속 불가)
- `super`: 부모 클래스의 생성자나 메서드를 호출할 때 사용한다.
- `@Override`: 부모 메서드를 재정의할 때 명시적으로 선언한다 (컴파일러 검증).
- `final` 클래스는 상속할 수 없고, `final` 메서드는 오버라이딩할 수 없다.
- 모든 클래스는 암묵적으로 `Object` 클래스를 상속한다.

#### 오버라이딩 vs 오버로딩

| 구분 | 오버라이딩 (Overriding) | 오버로딩 (Overloading) |
|---|---|---|
| 정의 | 부모 메서드를 자식이 재정의 | 같은 이름의 메서드를 매개변수만 다르게 정의 |
| 메서드명 | 동일 | 동일 |
| 매개변수 | 동일 | 다름 (타입, 개수, 순서) |
| 반환타입 | 동일 (또는 공변 반환) | 무관 |
| 관계 | 상속 관계 필수 | 같은 클래스 내에서 가능 |

### 5.3 다형성 (Polymorphism)

하나의 참조 변수가 **여러 타입의 객체를 참조**할 수 있는 성질

```java
// 부모 타입 변수로 자식 객체 참조 (업캐스팅)
Animal myAnimal = new Dog("바둑이", 3, "진돗개");
myAnimal.eat();    // "바둑이이(가) 사료를 먹습니다." (오버라이딩된 메서드 호출)
// myAnimal.bark();  // 컴파일 에러! Animal 타입에는 bark() 없음

// 다운캐스팅 (명시적 캐스팅 필요)
if (myAnimal instanceof Dog) {
    Dog myDog = (Dog) myAnimal;
    myDog.bark();   // "바둑이이(가) 짖습니다."
}

// Java 16+ : Pattern Matching for instanceof
if (myAnimal instanceof Dog myDog) {
    myDog.bark();
}
```

#### 다형성의 활용: 인터페이스 기반 설계

```java
public interface Shape {
    double getArea();
    double getPerimeter();
}

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) { this.radius = radius; }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}

public class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() { return width * height; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }
}

// 다형성 활용
public void printShapeInfo(Shape shape) {
    // Shape 인터페이스 타입 하나로 Circle, Rectangle 등 모두 처리
    System.out.println("넓이: " + shape.getArea());
    System.out.println("둘레: " + shape.getPerimeter());
}
```

**핵심 사항:**
- **업캐스팅**: 자식 → 부모 타입 변환 (자동, 암묵적)
- **다운캐스팅**: 부모 → 자식 타입 변환 (수동, 명시적, `instanceof` 검사 권장)
- **동적 바인딩**: 실행 시점에 실제 객체의 오버라이딩된 메서드가 호출된다.
- 유연하고 확장 가능한 코드를 작성할 수 있게 한다.

### 5.4 추상화 (Abstraction)

복잡한 내부 구현을 숨기고 **필요한 기능(인터페이스)만 외부에 노출**하는 것

#### 추상 클래스 (Abstract Class)

```java
public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // 추상 메서드: 선언만, 구현은 자식 클래스에서
    public abstract void start();
    public abstract void stop();

    // 일반 메서드: 공통 로직 제공
    public void displayInfo() {
        System.out.println("차량: " + name);
    }
}

public class ElectricCar extends Vehicle {
    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " 전기 모터 가동");
    }

    @Override
    public void stop() {
        System.out.println(name + " 전기 모터 정지");
    }
}
```

#### 인터페이스 (Interface)

```java
public interface Drivable {
    void drive();          // public abstract 생략 가능
    void brake();

    // Java 8+: default 메서드
    default void honk() {
        System.out.println("빵빵!");
    }

    // Java 8+: static 메서드
    static int getMaxSpeed() {
        return 200;
    }
}

public interface Chargeable {
    void charge();
}

// 인터페이스는 다중 구현 가능
public class Tesla extends Vehicle implements Drivable, Chargeable {
    public Tesla(String name) { super(name); }

    @Override public void start() { System.out.println("Tesla 시작"); }
    @Override public void stop() { System.out.println("Tesla 정지"); }
    @Override public void drive() { System.out.println("Tesla 주행"); }
    @Override public void brake() { System.out.println("Tesla 제동"); }
    @Override public void charge() { System.out.println("Tesla 충전"); }
}
```

#### 추상 클래스 vs 인터페이스

| 구분 | 추상 클래스 (Abstract Class) | 인터페이스 (Interface) |
|---|---|---|
| 키워드 | `abstract class` | `interface` |
| 다중 상속/구현 | 단일 상속만 가능 | 다중 구현 가능 |
| 생성자 | 가질 수 있음 | 가질 수 없음 |
| 필드 | 인스턴스 변수 가능 | `public static final` 상수만 |
| 메서드 | 추상 메서드 + 일반 메서드 | 추상 메서드 + default/static 메서드 (Java 8+) |
| 목적 | "is-a" 관계, 공통 기반 제공 | "can-do" 관계, 행위 규약 정의 |
| 사용 시점 | 관련된 클래스 간 코드 공유 | 서로 관련 없는 클래스에 공통 행위 부여 |

---

## 6. 접근 제한자 (Access Modifiers)

### 6.1 접근 범위 표

| 제한자 | 같은 클래스 | 같은 패키지 | 자식 클래스 (다른 패키지) | 전체 |
|---|:---:|:---:|:---:|:---:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` (생략 시) | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### 6.2 사용 예시

```java
public class AccessExample {
    public String publicField = "누구나 접근 가능";
    protected String protectedField = "같은 패키지 + 자식 클래스";
    String defaultField = "같은 패키지만 접근 가능";       // default (키워드 없음)
    private String privateField = "같은 클래스만 접근 가능";
}
```

### 6.3 적용 가이드

| 대상 | 권장 접근 제한자 | 이유 |
|---|---|---|
| 클래스 필드 | `private` | 캡슐화 원칙, Getter/Setter로 접근 |
| Getter/Setter | `public` | 외부에서 간접 접근 허용 |
| 내부 유틸 메서드 | `private` | 외부에 노출할 필요 없는 내부 로직 |
| 상속용 메서드 | `protected` | 자식 클래스에서 재사용/오버라이딩 |
| 상수 | `public static final` | 불변값이므로 공개해도 안전 |

---

## 7. 컬렉션 (Collection Framework)

Java 컬렉션 프레임워크는 데이터를 효율적으로 저장하고 처리하기 위한 **표준화된 자료구조 및 알고리즘**을 제공한다.

### 7.1 컬렉션 계층 구조

```
Iterable
  └── Collection
        ├── List     (순서 있음, 중복 허용)
        ├── Set      (순서 없음, 중복 불허)
        └── Queue    (FIFO 순서)
              └── Deque

Map (별도 계층, 키-값 쌍)
```

### 7.2 List (순서 있음, 중복 허용)

```java
// ArrayList: 배열 기반, 랜덤 접근 빠름
List<String> arrayList = new ArrayList<>();
arrayList.add("Java");
arrayList.add("Python");
arrayList.add("Java");   // 중복 허용
arrayList.get(0);         // 인덱스로 접근: "Java"

// LinkedList: 노드 기반, 삽입/삭제 빠름
List<String> linkedList = new LinkedList<>();
linkedList.add("A");
linkedList.add(0, "B");  // 인덱스 0에 삽입
```

| 구현 클래스 | 내부 구조 | 랜덤 접근 | 삽입/삭제 | 주요 용도 |
|---|---|---|---|---|
| `ArrayList` | 동적 배열 | O(1) 빠름 | O(n) 느림 | 조회 위주의 작업 |
| `LinkedList` | 이중 연결 리스트 | O(n) 느림 | O(1) 빠름 | 삽입/삭제 빈번한 작업 |
| `Vector` | 동적 배열 (동기화) | O(1) 빠름 | O(n) 느림 | 레거시, 스레드 안전 필요 시 |

### 7.3 Set (순서 없음, 중복 불허)

```java
// HashSet: 해시 기반, 가장 빠른 성능
Set<String> hashSet = new HashSet<>();
hashSet.add("Java");
hashSet.add("Python");
hashSet.add("Java");    // 중복 무시, 추가되지 않음
System.out.println(hashSet.size());  // 2

// TreeSet: 정렬된 상태 유지
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(3);
treeSet.add(1);
treeSet.add(2);
System.out.println(treeSet);  // [1, 2, 3] 자동 정렬

// LinkedHashSet: 삽입 순서 유지
Set<String> linkedHashSet = new LinkedHashSet<>();
```

| 구현 클래스 | 내부 구조 | 정렬 | 순서 | null 허용 |
|---|---|---|---|---|
| `HashSet` | 해시 테이블 | ❌ | ❌ | 1개 허용 |
| `TreeSet` | 레드-블랙 트리 | ✅ (자연순서/Comparator) | 정렬 순서 | ❌ |
| `LinkedHashSet` | 해시 테이블 + 연결 리스트 | ❌ | 삽입 순서 | 1개 허용 |

> **주의:** `Set`에서 중복 판단은 `equals()`와 `hashCode()` 메서드에 의존한다. 커스텀 객체를 저장할 경우 두 메서드를 반드시 오버라이딩해야 한다.

### 7.4 Map (키-값 쌍, 키 중복 불허)

```java
// HashMap: 해시 기반, 가장 많이 사용
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Java", 1);
hashMap.put("Python", 2);
hashMap.put("Java", 3);    // 키 중복 시 값 덮어쓰기
System.out.println(hashMap.get("Java"));  // 3

// 반복 방법
for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Java 8+: forEach
hashMap.forEach((key, value) -> System.out.println(key + " = " + value));

// TreeMap: 키 기준 정렬
Map<String, Integer> treeMap = new TreeMap<>();

// LinkedHashMap: 삽입 순서 유지
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
```

| 구현 클래스 | 내부 구조 | 키 정렬 | 순서 | null 키 | 스레드 안전 |
|---|---|---|---|---|---|
| `HashMap` | 해시 테이블 | ❌ | ❌ | 1개 허용 | ❌ |
| `TreeMap` | 레드-블랙 트리 | ✅ | 정렬 순서 | ❌ | ❌ |
| `LinkedHashMap` | 해시 + 연결 리스트 | ❌ | 삽입 순서 | 1개 허용 | ❌ |
| `Hashtable` | 해시 테이블 | ❌ | ❌ | ❌ | ✅ (레거시) |
| `ConcurrentHashMap` | 세그먼트 해시 | ❌ | ❌ | ❌ | ✅ (권장) |

### 7.5 Queue & Deque

```java
// Queue: FIFO (First In, First Out)
Queue<String> queue = new LinkedList<>();
queue.offer("첫 번째");   // 삽입
queue.offer("두 번째");
queue.poll();             // 꺼냄: "첫 번째"
queue.peek();             // 조회만: "두 번째"

// PriorityQueue: 우선순위 기반
Queue<Integer> pq = new PriorityQueue<>();
pq.offer(3);
pq.offer(1);
pq.offer(2);
pq.poll();   // 1 (가장 작은 값이 먼저)

// Stack: LIFO (Last In, First Out) - Deque 사용 권장
Deque<String> stack = new ArrayDeque<>();
stack.push("첫 번째");   // 삽입
stack.push("두 번째");
stack.pop();              // 꺼냄: "두 번째"
stack.peek();             // 조회만: "첫 번째"
```

| 자료구조 | 순서 | 주요 구현 | 핵심 메서드 |
|---|---|---|---|
| `Queue` | FIFO | `LinkedList`, `PriorityQueue` | `offer()`, `poll()`, `peek()` |
| `Deque` | 양방향 | `ArrayDeque`, `LinkedList` | `offerFirst()`, `offerLast()`, `pollFirst()`, `pollLast()` |
| `Stack` | LIFO | `ArrayDeque` (권장) | `push()`, `pop()`, `peek()` |

> **참고:** `java.util.Stack` 클래스는 레거시이므로, `Deque<E> stack = new ArrayDeque<>()` 사용을 권장한다.

### 7.6 주요 유틸리티: Collections 클래스

```java
List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));

Collections.sort(list);                // 오름차순 정렬
Collections.sort(list, Comparator.reverseOrder());  // 내림차순 정렬
Collections.shuffle(list);             // 무작위 섞기
Collections.reverse(list);             // 역순
Collections.max(list);                 // 최댓값
Collections.min(list);                 // 최솟값
Collections.frequency(list, 1);        // 특정 요소 빈도수
Collections.unmodifiableList(list);    // 읽기 전용 리스트
```

---

## 8. 예외 처리 (Exception Handling)

### 8.1 예외 계층 구조

```
Throwable
  ├── Error (시스템 레벨, 복구 불가)
  │     ├── OutOfMemoryError
  │     ├── StackOverflowError
  │     └── ...
  └── Exception (애플리케이션 레벨, 복구 가능)
        ├── Checked Exception (컴파일 시점 검사)
        │     ├── IOException
        │     ├── SQLException
        │     ├── FileNotFoundException
        │     └── ClassNotFoundException
        └── RuntimeException (Unchecked, 실행 시점 발생)
              ├── NullPointerException
              ├── ArrayIndexOutOfBoundsException
              ├── ClassCastException
              ├── ArithmeticException
              └── IllegalArgumentException
```

### 8.2 Checked vs Unchecked Exception

| 구분 | Checked Exception | Unchecked Exception (RuntimeException) |
|---|---|---|
| 검사 시점 | 컴파일 시점 | 실행 시점 |
| 처리 강제 | 반드시 `try-catch` 또는 `throws` 필요 | 선택적 처리 |
| 대표 예시 | `IOException`, `SQLException` | `NullPointerException`, `ArithmeticException` |
| 발생 원인 | 외부 환경 (파일, 네트워크, DB 등) | 프로그래밍 실수 (논리 오류) |

### 8.3 try-catch-finally

```java
try {
    // 예외가 발생할 수 있는 코드
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // 특정 예외 처리
    System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
} catch (Exception e) {
    // 상위 예외로 나머지 처리 (하위 예외를 먼저 catch해야 함)
    System.out.println("예외 발생: " + e.getMessage());
} finally {
    // 예외 발생 여부와 관계없이 항상 실행
    System.out.println("finally 블록 실행");
}
```

#### try-with-resources (Java 7+)

`AutoCloseable`을 구현한 리소스를 자동으로 닫아주는 구문

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line = br.readLine();
    System.out.println(line);
} catch (IOException e) {
    System.out.println("파일 읽기 오류: " + e.getMessage());
}
// br.close()가 자동 호출됨 (finally 불필요)
```

#### Multi-catch (Java 7+)

```java
try {
    // 코드
} catch (IOException | SQLException e) {
    // 여러 예외를 한 블록에서 처리
    System.out.println("예외: " + e.getMessage());
}
```

### 8.4 throw와 throws

```java
// throw: 예외를 직접 발생시킴
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("나이는 음수일 수 없습니다: " + age);
    }
    this.age = age;
}

// throws: 메서드 시그니처에 예외 선언 (호출자에게 처리 위임)
public void readFile(String path) throws IOException, FileNotFoundException {
    BufferedReader br = new BufferedReader(new FileReader(path));
    // ...
}
```

| 키워드 | 위치 | 역할 |
|---|---|---|
| `throw` | 메서드 내부 | 예외 객체를 직접 생성하여 발생시킴 |
| `throws` | 메서드 선언부 | 해당 메서드가 발생시킬 수 있는 예외를 호출자에게 알림 |

### 8.5 사용자 정의 예외 (Custom Exception)

```java
// Checked Exception
public class InsufficientBalanceException extends Exception {
    private final double amount;

    public InsufficientBalanceException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

// Unchecked Exception
public class InvalidOrderException extends RuntimeException {
    public InvalidOrderException(String message) {
        super(message);
    }

    public InvalidOrderException(String message, Throwable cause) {
        super(message, cause);
    }
}

// 사용
public void withdraw(double amount) throws InsufficientBalanceException {
    if (amount > balance) {
        throw new InsufficientBalanceException(
            "잔액이 부족합니다. 현재 잔액: " + balance, amount
        );
    }
    balance -= amount;
}
```

### 8.6 예외 처리 모범 사례

| 원칙 | 설명 |
|---|---|
| 구체적인 예외를 catch | `Exception` 대신 `IOException` 등 구체적 타입 사용 |
| 예외를 무시하지 않기 | 빈 `catch` 블록 지양, 최소한 로그 기록 |
| 적절한 수준에서 처리 | 해당 계층에서 처리할 수 없으면 상위로 전파 |
| 의미 있는 메시지 포함 | 디버깅에 도움이 되는 상세 정보 제공 |
| 리소스 정리 | `try-with-resources` 또는 `finally`에서 리소스 해제 |
| 예외로 흐름 제어하지 않기 | 예외는 예외 상황에만 사용, 정상 로직에 사용 금지 |

---

> 📌 **참고:** 이 문서는 Java SE 기본 문법과 핵심 개념을 정리한 것입니다. Spring Framework, JDBC, 멀티스레딩, Stream API, Lambda, 제네릭(Generic) 등 심화 주제는 별도 문서에서 다룰 예정입니다.

