class Seven{  
    void location(){
        System.out.println("Location of 7 wonders of the world:");
    }     
}  

class HaLongBay extends Seven {  
    void location(){
        System.out.println("Ha Long Bay is in Vietnam");
    }    
}

class Komodo extends Seven {  
    void location(){
        System.out.println("Komodo island is in Indonesia");
    }    
}

class Pyramid extends Seven {  
    void location(){
        System.out.println("The Great Pyramid of Giza is in Egypt");
    }    
}

class Machu extends Seven {  
    void location(){
        System.out.println("Machu Picchu is in Peru");
    }    
}

class TajMahal extends Seven {  
    void location(){
        System.out.println("Taj Mahal is in India");
    }    
}

class Wall extends Seven {  
    void location(){
        System.out.println("Great Wall of China is in Northern China");
    }    
}

class Chichen extends Seven {  
    void location(){
        System.out.println("Chichén Itzá is in Yucatán, Mexico");
    }    
}


public class SevenWonders {
    public static void main(String args[]){ 
        Seven A = new Seven();
        Seven H = new HaLongBay();
        Seven K = new Komodo();
        Seven P = new Pyramid();
        Seven M = new Machu();
        Seven T = new TajMahal();
        Seven W = new Wall();
        Seven C = new Chichen();

        A.location();
        System.out.println("");

        H.location();
        System.out.println("");
        
        K.location();
        System.out.println("");
        
        P.location();
        System.out.println("");
        
        M.location();
        System.out.println("");
        
        T.location();
        System.out.println("");
        
        W.location();
        System.out.println("");
        
        C.location();
        System.out.println("");
        
    }
}
