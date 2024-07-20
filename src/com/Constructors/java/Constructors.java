package com.Constructors.java;

public class Constructors {

    // static variable
    static int A;

    // non static variable
    int age;

    // static blocks

    static {
        System.out.println(" static block 1");
    }

    static {
        System.out.println(" static block 2");
    }

    // methods

    public static void display() {
        A = 100;
        System.out.println("the  a value :" + A);
        Constructors constructors;
        constructors = new Constructors();
        constructors.age = 123;
        System.out.println("the age is:" + constructors.age);

    }


    public static void main(String x) {
        System.out.println(x);
    }

//        public Constructors(){
//            System.out.println("This is default construcor");
//
//        }
//        public Constructors(String name, int id){
//
//            System.out.println("this is  a argument constructors");
//        }

    public static void main(String[] args) {
//            Constructors constructors;
//            constructors = new Constructors();
//            constructors.A = 10;
//
//            Constructors constructors1;
//           constructors1 = new Constructors();
//            System.out.println(constructors1.A);

        // access the static variable other classes

//            A = 23;
//            System.out.println(Constructors.A);

        // Constructors.display();

        // main("hello java world");


    }

    // static block after the main block
    static {
        System.out.println("static block 3");
        main("hello java world");
        Constructors.display();


    }
}


