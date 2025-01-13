//Parent Class
class Parent {
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Student name:"+name);
    }
}

//child class
class Child extends Parent {
    void ageN(int age)
    {
        System.out.println("Age: " + age + " years old");
    }
}

class Student {
    public static void main(String [] er)
    {
        Child s= new Child();//creating object of child class
        s.naming("Rain");
        s.ageN(27);
        System.out.println("");
    }
    
}