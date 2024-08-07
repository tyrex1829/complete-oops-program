// Exception Handling
class Test {
    public static void main(String[] args) {

        System.out.println("main method started");

        int a = 10, b = 0;
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            // System.out.println(e);
            System.out.println("can't divide by 0");
        }
       

        System.out.println("main method ended");
    }
}



// var-arg method
// class A {
//     void add (int ... a) { // same as spread operator in js
//         int sum = 0;
//         // sum = sum + a; // this will give error, because a is array, now need to traverse.
//         for (int x:a) {
//             sum += x;
//         }
//         System.out.println("Sum of no. is: " + sum);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         A a = new A();
//         a.add();
//         a.add(10);
//         a.add(20, 30);
//         a.add(40, 50, 60);
//         a.add(70, 80, 90, 100);
//     }
// }



// Covarient Return Type 
// class A {

//     // Method has class type -> return type
//     A Show () { // class type -> return type
//         System.out.println("Super Class");
//         return this; // we have to return something because not void. this --> new A();
//     }
// }

// class B extends A {

//     // override method
//     @Override
//     B Show () {
//         System.out.println("Sub Class");
//         return this;
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         B b = new B();
//         b.Show();
//     }
// }



// Overriden Annotation
// class A {

//     // method
//     void Show () {
//         System.out.println("Super Class");
//     }
// }

// class B extends A {

//     // Override method
//     @Override
//     void Show () {
//         System.out.println("Sub Class");
//     }

//     // Override Method, but this method is not present at A. So give error if override tag is used, if not used override tag then no error.
//     // @Override
//     // void Disp () {
//     //     System.out.println("error");
//     // }
// }

// class Test {
//     public static void main(String[] args) {
//         B b = new B();
//         b.Show();
//     }
// }



// Interface Private Method (JDK 1.9)
// interface A {

//     // 1st way
//     default void call () {
//         add(10, 20);
//     }

//     // 2nd way, but this will only work if private method is also static
//     public static void call2 () {
//         add(5, 5);
//     }

//     // private method, need to implememt this method in this interface only.
//     private static void add (int x, int y) {
//         System.out.println("Sum of two no: " + (x+y));
//     }
// }

// class B implements A {

//     // public method (it's own method)
//     public void sub (int x, int y) {
//         System.out.println("Sub of two no: " + (x-y));
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         B b = new B();
//         // b.add(5, 10); // error because add is private // To solve this, 2 ways, 1st => default method, 2nd => static method

//         // 1st way
//         b.call();
//         A.call2(); // interface call

//         b.sub(10, 5);
//     }
// }



// Interface Static Method (JDK 1.8)
// interface A {
//     public static void show () {
//         System.out.println("cannot override interface static methods");
//     }
// }

// // class Demo implements A {
// //     @Override
// //     public static void show () {
// //         System.out.println("this will throw an error because we can't override static method present inside an interface");
// //     }
// // }

// class Test {
//     public static void main(String[] args) {
//         A.show();
//         // Demo d = new Demo();
//         // d.show();
//     }
// }



// Interface Default Method (JDK 1.8)
// interface A {
//     void a1 (); // Public + abstract
//     void a2 (); // Public + abstract

//     // later
//     default void a3 () { // not abstract
//         System.out.println("a3 of A");
//     };
// }

// class B implements A {

//     // implementation
//     public void a1 () {
//         System.out.println("a1 of B");
//     }

//     // implementation
//     public void a2 () {
//         System.out.println("a2 of B");
//     }

//     // implementation a3 in B only not in C & D, B will Override
//     public void a3 () {
//         System.out.println("a3 of B");
//     }
// }

// class C implements A {

//     // implementation
//     public void a1 () {
//         System.out.println("a1 of C");
//     }

//     // implementation
//     public void a2 () {
//         System.out.println("a2 of C");
//     }
// }

// class D implements A {

//     // implementation
//     public void a1 () {
//         System.out.println("a1 of D");
//     }

//     // implementation
//     public void a2 () {
//         System.out.println("a2 of D");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         B b = new B();
//         b.a1();
//         b.a2();
//         b.a3();

//         C c = new C();
//         c.a1();
//         c.a2();
//         c.a3();
        
//         D d = new D();
//         d.a1();
//         d.a2();
//         c.a3();
//     }
// }



// Extending Interface
// interface Gill {
//     void add();
// }

// interface Raj extends Gill {
//     void sub();
// }

// class Ankit implements Raj {
//     @Override
//     public void add () {
//         int a = 10, b = 20, c;
//         c = a + b;
//         System.out.println("addition: " + c);
//     }

//     @Override
//     public void sub () {
//         int a = 20, b = 10, c;
//         c = a - b;
//         System.out.println("Subtraction: " + c);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Raj r = new Ankit();
//         r.add();
//         r.sub();
//     }
// }



// Multiple inheritance through interfaces
// interface A {

//     // method
//     void show ();
// }

// interface B {
//     void show ();
// }

// class Test implements A, B{

//     // method
//     public void show () {
//         System.out.println("implementing both A and B");
//     }
//     public static void main(String[] args) {
//         Test m = new Test();
//         m.show();
//     }
// }



// Interface Methods
// interface Client {

//     // method
//     void webDesign (); // public + abstract
//     void webDeveloper (); // public + abstract
// }

// abstract class JohnTech implements Client {
    
//     // method
//     @Override
//     public void webDesign () {
//         System.out.println("green, top menu, hamburger button");
//     }
//     // now after designing he does not want to continue his work, he left. i.e. develop method didn't get called, and if any method of interface didn't get called then this class will become abstract class. so write abstract before this class.
// }

// class VakoTech extends JohnTech {

//     // method
//     public void webDeveloper () {
//         System.out.println("React, Nodejs, express, MongoDB, Auth");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         VakoTech r = new VakoTech();
//         r.webDesign();
//         r.webDeveloper();
//     }
// }



// Interface Variables
// interface customerJohn {

//     // variables
//     int quantity = 5;    // public + static + final
    
//     // method
//     void purchase ();
// }

// class sellerMuh implements customerJohn {

//     @Override
//     public void purchase () {
//         System.out.println("John wanna buy " + quantity + " Kg rice");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         customerJohn c = new sellerMuh();

//         c.purchase();
//     }
// }



// Interface Intro
// import java.util.Scanner;
// interface
// interface Client {

//     // method
//     void input();      //public + abstract
//     void output();     //public + abstract
// }

// class Dev1 implements Client {

//     // variable
//     String name;
//     double salary;

//     // method
//     public void input () {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter username : ");
//         name = sc.nextLine();

//         System.out.print("Enter salary : ");
//         salary = sc.nextDouble();
//     }

//     public void output () {
//         System.out.println(name + " is earning Rupees: " + salary);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Client c = new Dev1();

//         c.input();
//         c.output();
//     }
// }



// abstract method program
// abstract class Programming {
//     public abstract void Developer ();
//     public abstract void Rank ();
// }

// class HTML extends Programming {
//     @Override
//     public void Developer () {
//         System.out.println("Tim Berners Lee");
//     }

//     // two abs method are there in above class, so we have to override both other wise this class will also become abs class.
//     @Override
//     public void Rank () {
//         System.out.println("Rank: " + 3);
//     }
// }

// class Java extends Programming {
//     @Override
//     public void Developer () {
//         System.out.println("James Gosling");
//     }

//     @Override
//     public void Rank () {
//         System.out.println("Rank: " + 5);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         HTML d1 = new HTML();
//         Java d2 = new Java();

//         d1.Developer();
//         d2.Developer();

//         d1.Rank();
//         d2.Rank();
//     }
// }



// abstract class program
// abstract class Animal {

//     // constructor
//     Animal(String a) {
//         System.out.println("All " + a);
//     }

//     // abstract method
//     public abstract void sound();
// }

// // there is something common between dog and lion like eat, now we have to make eat method on both classes, but if we make animal class which will abstract and will contain an empty eat abstract method will solve our problem.

// class Dog extends Animal {

//     // constructor
//     Dog() {
//         super("Dog");
//     }

//     // method
//     public void sound() {
//         System.out.println("bark");
//     }
// }

// class Lion extends Animal {

//     // constructor
//     Lion () {
//         super("Lion");
//     }

//     // method
//     public void sound () {
//         System.out.println("roar");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Dog r1 = new Dog();
//         Lion r2 = new Lion();

//         r1.sound();
//         r2.sound();
//     }
// }



// abstract class
// abstract class A {
//     // method
//     void disp () {
//         System.out.println("hello");
//     }
// }

// class B extends A {

// }

// class Test {
//     public static void main(String[] args) {
//         // A r = new A();    will not work because can't create obj od abs class.
//         A r = new B(); // made obj of B, and B extends A, so can access members of A.
//         r.disp();
//     }
// }



// Encapsulation
// class A {

//     // private class variable
//     private int value; // data hiding

//     // public method , with this we will set our value.
//     public void setValue (int x) { //data abstraction
//         value = x;
//     }

//     // public method , with this we will get our value.
//     public int getValue () {
//         return value;
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         A r = new A();

//         r.setValue(10);
//         System.out.println(r.getValue());
//     }
// }



// Method Overriding
// class Shape {

//     // method
//     void draw () {
//         System.out.println("Can not say shape type");
//     }
// }

// class Square extends Shape {
//     @Override
//     void draw () {
//         System.out.println("Shape is square");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Shape objSquare = new Square();
//         objSquare.draw();
//     }
// }



// Method Overloading
// class A {

//     // method
//     void add (){
//         int a = 10;
//         int b = 20;

//         int c = a + b;

//         System.out.println(c);
//     }

//     // method
//     void add (int x, int y) {
//         int c = x + y;

//         System.out.println(c);
//     }

//     // method
//     void add (double x, int y) {
//         double c = x + y;

//         System.out.println(c);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         A objA = new A();
//         objA.add();
//         objA.add(5, 5);
//         objA.add(5.5, 5);
//     }
// }



// // this keyword
// class A {
//     // instance variable
//     int a;

//     // constructor
//     A() {
//         this(10);
//         System.out.println("default constructor");
//     }

//     // constructor
//     A(int a) { //local variable which is inside bracket (argument)
//         // this();
//         this.a = a;
//     }

//     // method
//     void show() {
//         System.out.println(a);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         A objA = new A();
//         objA.show();
//         // System.out.println(objA);
//     }
// }



// // Super Class
// class A {

//     // instance variable
//     int a = 10;

//     // method
//     void disp(){
//         System.out.println("hello");
//     }

//     // constructor
//     A() {
//         System.out.println("super class constructor");
//     }
// }

// // Sub Class
// class B extends A {

//     // instance variable
//     int a = 20;

//     // method
//     void show () {
//         System.out.println(a);
//         System.out.println(super.a);
//     }

//     // method
//     void disp(){
//         super.disp();
//         System.out.println("world");
//     }

//     // constructor
//     B() {
//         System.out.println("sub class constructor");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         B objOfB = new B();

//         objOfB.show();
//         objOfB.disp();
//     }
// }



// // Super Class
// class A {

//     // method
//     void Input () {
//         System.out.print("Enter your name : ");
//     }
// }

// // Sub 1
// class B extends A {

//     // method
//     void Show () {
//         System.out.println("My name is Tyrex");
//     }
// }

// // Sub 2
// class C extends A {

//     // method
//     void Disp () {
//         System.out.println("My name is Saksham");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         B objB = new B();
//         C objC = new C();

//         objB.Input();
//         objB.Show();

//         objC.Input();
//         objC.Disp();
//     }
// }



// Super Class
// class A {
    
//     // instance variable
//     int a,b,c;

//     // method
//     void add(){
//         a = 10;
//         b = 20;
//         c = a + b;
//         System.out.println("Sum of two no: " + c);
//     }

//     // method
//     void sub(){
//         a = 100;
//         b = 200;
//         c = a - b;
//         System.out.println("Sub of two no: " + c);
//     }
// }

// // Sub 1
// class B extends A {

//     // method
//     void mul(){
//         a = 10;
//         b = 20;
//         c = a * b;
//         System.out.println("Mul of two no: " + c);
//     }

//     // method
//     void div(){
//         a = 10;
//         b = 20;
//         c = a / b;
//         System.out.println("Div of two no: " + c);
//     }
// }

// // Sub 2
// class C extends B {

//     // method
//     void rem(){
//         a = 10;
//         b = 3;
//         c = a % b;
//         System.out.println("Rem of two no: " + c);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         C objOfC = new C();
//         objOfC.add();
//         objOfC.sub();
//         objOfC.mul();
//         objOfC.div();
//         objOfC.rem();
//     }

// }



// class Student { // super
//     // instance variable
//     int roll, marks;
//     String name;

//     // method
//     void input () {
//         System.out.print("Enter roll-number, name & marks: ");
//     }
// }
// class Test extends Student { // sub
//     // method of sub-class
//     void display () {
//         roll = 1;
//         name = "saksham";
//         marks = 89;
//         System.out.println(roll + ", " + name + ", " + marks);
//     }
//     public static void main(String[] args) {
//         Test s1 = new Test();
//         s1.input();
//         s1.display();
//     }

// }



// class Test {
//     // construtor 
//     Test () {
//         System.out.println("inside constructor");
//     }
//     // static 
//     static {
//         System.out.println("inside static");
//     }
//     // instance block
//     {
//         System.out.println("inside instance");
//     }

//     public static void main(String[] args) {
//         Test ob = new Test(); // need object to access instance block
//     }    
// }



// class A {
//     // static method
//     static void notShow () {
//         System.out.println("inside static method");
//     }

//     // method
//     void show () {
//         System.out.println("Inside show method");
//     }

//     // default constructor
//     A () {
//         System.out.println("inside default constructor");
//     }

//     // instance block
//     {
//         System.out.println("inside instance block");
//     }
// }
// class Test {
//     public static void main(String[] args) {
//         A.notShow();
//         A r = new A();
//         r.show();
//     }
// }



// class Test {

//     Test () {
//         System.out.println("inside constructor");
//     }

//     // instance block
//     {
//         System.out.println("inside instance block");
//     }

//     // static block (here we are not passing static to any method, its just static block)
//     static {
//         System.out.println("Hellooo");
//     }

//     public static void main(String[] args) {
//        Test r = new Test();
        
//     }
// }



// class A {

//     int x; double z; String y;

//     A () {
//         x = 100; z = 55.5; y = "tyrex";
//     }
//     A (int a) {
//         x = a;
//     }
//     A (int a, String b) {
//         x = a;
//         y = b;
//     }
//     A (double c) {
//         z = c;
//     }
// }
// class Test {
//     public static void main(String[] args) {
//         A r = new A();
//         A r2 = new A(10);
//         A r3 = new A(5, "Constructor Overloading");
//         A r4 = new A(2.5);
    
//         System.out.println(r.x + " " + r.y + " " + r.z);
//         System.out.println(r2.x);
//         System.out.println(r3.x + " " + r3.y);
//         System.out.println(r4.z);
//     }
// }



// class Test {

//     int a;
//     double b;
//     String c;

//     // private constructor
//     private Test () {
//         a = 10;
//         b = 30.56;
//         c = "private";
//         System.out.println(a + " " + b + " " + c);
//     }

//     public static void main(String[] args) {
//         Test r = new Test();
//     }
// }



// class A {
//     int a;
//     String b;

//     // parameterized constructor
//     A () {
//         a = 10;
//         b = "Learn Coding";
//         System.out.println(a + " " + b);
//     }

//     // copy constructor
//     A (A ref) {     // A ref = new A();
//         a = ref.a;
//         b = ref.b;
//         System.out.println(a + " " + b);
//     }
// }

// public class Test {

//     public static void main(String[] args) {
//         A r = new A();
//         A r2 = new A(r);
//     }
// }



// class A {
    
//     // instance variable
//     int x, y;

//     // parameterized constructor
//     A (int a, int b) {
//         x = a;
//         y = b;
//     }

//     // parameterized constructor
//     A (int a, String str) {
//         System.out.print(a + " " + str);
//     }

//     // method
//     void show () {
//         System.out.print(x + " " + y + " ");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         A s = new A(100, 200);
//         s.show();
//         A reef = new A(1, "tyrex");
//     }
// }



// class A {

//     // instance variables
//     int a;
//     String b;
//     boolean c;

//     // default constructor
//     A () {
//         a = 100;
//         b = "Tyrex";
//         c = true;
//     }

//     // methods
//     void Display () {
//         System.out.print(a + " " + b + " " + c);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.Display();
//     }
// }



// class A {

//     // instance variable
//     int a;
//     String name;

//     // constructor
//     A () {
//         a = 0;
//         name = null;
//     }

//     // method
//     void show () {
//         System.out.print(a + " " + name);
//     }

// }

// class Test {
//     public static void main(String[] args) {
//         A ref = new A();
//         ref.show();
//     }
// }



// class Demo {
//     // data
//     int a = 10;
//     String b = "tyrex";
    
//     // method
//     void Show () {
//         System.out.print(a +" " + b);
//     }
// }

// class Test {
//     public static void main (String args[]) {
//         // Demo d = new Demo();
//         Demo d;
//         d = new Demo();
//         d.Show();
//     }
// }