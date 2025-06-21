

public class Myclass {

  // oopc
  // class

  public static void main(String[] args) {
    // object
    Student s1 = new Student();
    s1.name = "ayush";
    s1.roll = 206;
    s1.marks = 100;
    s1.phone = 820086422;

    s1.study();

  }

}

class Student {
  String name;
  int roll;
  int marks;
  long phone;

  void study() {
    System.out.println("Student is studying");
  }

}