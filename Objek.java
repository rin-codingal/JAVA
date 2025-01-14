abstract class Objects{
    //abstract method declaration
    abstract void showShape();
    
    public void shape(){
        System.out.println("this is from abstract class");
    }
}

class Spheres extends Objects{
    void showShape() { // indirectly override showshape method by making use of abstract class
          System.out.println("Object type is Sphere.");
    }     
}

class Cuboid extends Objects{
    void showShape() { // indirectly override showshape method by making use of abstract class
         System.out.println("Object type is Cuboid.");
   }  
}

class Prism extends Objects{
    void showShape() { // indirectly override showshape method by making use of abstract class
         System.out.println("Object type is Prism.");
    }             

}

public class Objek {
    public static void main(String args[]){
        Objects obj = new Spheres();//object of sphere
        obj.showShape();
        System.out.println("");

        obj = new Cuboid();//cuboid
        obj.showShape();
        System.out.println("");

        obj = new Prism();//prism
        obj.showShape();
        System.out.println("");

        obj.shape();
        System.out.println("");
 }  
}
