// Super Class
class A {
    
    // instance variable
    int a,b,c;

    // method
    void add(){
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum of two no: " + c);
    }

    // method
    void sub(){
        a = 100;
        b = 200;
        c = a - b;
        System.out.println("Sub of two no: " + c);
    }
}

// Sub 1
class B extends A {

    // method
    void mul(){
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Mul of two no: " + c);
    }

    // method
    void div(){
        a = 10;
        b = 20;
        c = a / b;
        System.out.println("Div of two no: " + c);
    }
}

// Sub 2
class C extends B {
    void rem(){
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("Rem of two no: " + c);
    }
}

class Test {
    public static void main(String[] args) {
        C objOfC = new C();
        objOfC.add();
        objOfC.sub();
        objOfC.mul();
        objOfC.div();
        objOfC.rem();
    }

}



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