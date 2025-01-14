//guess is it runtime or compile time polymorphism
class Hillstations{  
    void location(){
        System.out.println("Location is:");
    }  
    void famousfor(){
        System.out.println("Famous for:");
    }     
}  

class Dieng extends Hillstations {  
    void location(){
        System.out.println("Dieng is in Wonosobo");
    }  
    void famousfor(){
        System.out.println("It is Famous for Telaga Warna and Savana Pangonan");
    }  
}

class Malang extends Hillstations {  
    void location(){
        System.out.println("Malang is in East Java");
    }  
    void famousfor(){
        System.out.println("It is Famous for Mount Semeru and Sempu island");
    }  
}

class TanaToraja extends Hillstations {  
    void location(){
        System.out.println("Tana Toraja is in Sulawesi island");
    }  
    void famousfor(){
        System.out.println("It is Famous for Horn-shaped houses and funeral ceremonies");
    }  
}  

public class Hill_Station {
    public static void main(String args[]){ 
        Hillstations A = new Hillstations();
        Hillstations D = new Dieng();
     
        Hillstations M = new Malang();
     
        Hillstations T = new TanaToraja();
     
        A.location();
        A.famousfor();
        System.out.println("");
     
        D.location();
        D.famousfor();
        System.out.println("");
     
        M.location();
        M.famousfor();
        System.out.println("");
     
        T.location();
        T.famousfor();
        System.out.println("");
    }  
}
