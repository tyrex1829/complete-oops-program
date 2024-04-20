class A {
    
    // instance variable
    int x, y;

    // parameterized constructor
    A (int a, int b) {
        x = a;
        y = b;
    }

    // parameterized constructor
    A (int a, String str) {
        System.out.print(a + " " + str);
    }

    // method
    void show () {
        System.out.print(x + " " + y + " ");
    }
}

class Test {
    public static void main(String[] args) {
        A s = new A(100, 200);
        s.show();
        A reef = new A(1, "tyrex");
    }
}

















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