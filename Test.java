class A {

    int x; double z; String y;

    A () {
        x = 100; z = 55.5; y = "tyrex";
    }
    A (int a) {
        x = a;
    }
    A (int a, String b) {
        x = a;
        y = b;
    }
    A (double c) {
        z = c;
    }
}
class Test {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(10);
        A r3 = new A(5, "Constructor Overloading");
        A r4 = new A(2.5);
    
        System.out.println(r.x + " " + r.y + " " + r.z);
        System.out.println(r2.x);
        System.out.println(r3.x + " " + r3.y);
        System.out.println(r4.z);
    }
}



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