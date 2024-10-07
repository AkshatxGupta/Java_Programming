class Student {
    String name;
    int age;

    public void getinfo(){
        System.out.println("The name of this Student is "+ this.name);
        System.out.println("The age of this Student is "+this.age);
    }
}
//non parameterized constructor
class Student2 {
   String name;
   int age;
  
   Student2() {
       System.out.println("Constructor called");
   }
   
}
//parameterized constructor
class Student3 {
   String name;
   int age;
  
   Student3(String name, int age) {
       this.name = name;
       this.age = age;
   }
   public void getinfo(){
        System.out.println("The name of this Student is "+ this.name);
        System.out.println("The age of this Student is "+this.age);
    }
}
//copy constructor
class Student4 {
   String name;
   int age;
  
   Student4(Student s5) {
       this.name = s5.name;
       this.age = s5.age;
   }
   public void getinfo(){
        System.out.println("The name of this Student is "+ this.name);
        System.out.println("The age of this Student is "+this.age);
    }
}

class Pen {
    String color;
    public void printColor() {
        System.out.println("the color of this pen is" + this.color);
    }
}
//compile time polymorphism
class Students {
   String name;
   int age;

   public void displayInfo(String name) {
       System.out.println(name);
   }

   public void displayInfo(int age) {
       System.out.println(age);
   }

   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}
//runtime polymorphism
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(((0.5)*b*h));
    }  
 }
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 }
//Single Inheritance
// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println((1/2)*b*h);
//     }  
//  }
 
//Hierarchial inheritance
// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println((1/2)*b*h);
//     }  
//  }
//  class Circle extends Shape {
//     public void area(int r) {
//         System.out.println((3.14)*r*r);
//     }
//  } 

//Multilevel inheritance
// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println((1/2)*b*h);
//     }  
//  }
//  class EquilateralTriangle extends Triangle {
//     int side;
//  }

//Abstract [Abstraction]
// abstract class Animal {
//     abstract void walk();
//     void breathe() {
//         System.out.println("This animal breathes air");
//     }
//     Animal() {
//         System.out.println("You are about to create an Animal.");
//     }
//  }
 
 
//  class Horse extends Animal {
//     Horse() {
//         System.out.println("Wow, you have created a Horse!");
//     }
//     void walk() {
//         System.out.println("Horse walks on 4 legs");
//     }
//  }
 
 
//  class Chicken extends Animal {
//     Chicken() {
//         System.out.println("Wow, you have created a Chicken!");
//     }
//     void walk() {
//         System.out.println("Chicken walks on 2 legs");
//     }
//  }
 
//Interfaces[abstraction]
interface Animal {
    void walk();
 }
 
 
 class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
 }
 
 
 class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
 }
       
 
public class Oopsconcept {
    public static void main (String args[]){
        // Student s1 = new Student ();
        // s1.name = "Akshat";
        // s1.age = 20;
        // s1.getinfo();

        // Student s2 = new Student();
        // s2.name = "Akshara";
        // s2.age = 18;
        // s2.getinfo();

        // Pen p1 = new Pen();
        // p1.color = "blue";
        // Pen p2 = new Pen();
        // p2.color = "black";

        // Pen p3 = new Pen();
        // p3.color = "red";

        // p1.printColor();
        // p2.printColor();
        // p3.printColor();

        // Student2 s3 = new Student2();
        // s3.name = "Akshat";
        // s3.age = 20;

        //Student3 s3 = new Student3("Akshara" , 18);
        //s3.getinfo();

        ////Student4 s4 = new Student4(s2);
        // s4.name = "Akshat";
        // s4.age = 20;
        //s4.getinfo();

        // Students s5 = new Students();
        // s5.displayInfo("alssarie", 21);
        // s5.displayInfo(19);

        // Shape a=new Shape();
        // a.area();
        // Triangle t=new Triangle();
        // t.area(4,4);
        
        // // Triangle.area();
        // Circle c=new Circle();
        // c.area(1);

        // Horse horse = new Horse();
        // horse.walk();
        // horse.breathe();

        Horse horse = new Horse();
        horse.walk();
    }
}
