package logica;


public class Logica {
    
    
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    
    public int verificaGanador(){
        
        if (a.equals("piedra") && b.equals("tijeras")) {
            return 1;
        }
        
        else if (a.equals("piedra") && b.equals("lagarto")) {
            return 1;
        }
        
        else if (a.equals("papel") && b.equals("piedra")) {
            return 1;
        }
        
        else if (a.equals("papel") && b.equals("spock")) {
            return 1;
        }
        
        else if (a.equals("tijeras") && b.equals("papel")) {
            return 1;
        }
        
        else if (a.equals("tijeras") && b.equals("lagarto")) {
            return 1;
        }
        
        else if (a.equals("lagarto") && b.equals("papel")) {
            return 1;
        }
        
        else if (a.equals("lagarto") && b.equals("spock")) {
            return 1;
        }
        
        else if (a.equals("spock") && b.equals("piedra")) {
            return 1;
        }
        
        else if (a.equals("spock") && b.equals("tijeras")) {
            return 1;
        }
        
        else if (b.equals("piedra") && a.equals("tijeras")) {
            return 2;
        }
        
         else if (b.equals("piedra") && a.equals("lagarto")) {
            return 2;
        }
        else if (b.equals("papel") && a.equals("piedra")) {
            return 2;
        }
        else if (b.equals("papel") && a.equals("spock")) {
            return 2;
        }
        else if (b.equals("tijeras") && a.equals("papel")) {
            return 2;
        }
        else if (b.equals("tijeras") && a.equals("lagarto")) {
            return 2;
        }
        else if (b.equals("lagarto") && a.equals("papel")) {
            return 2;
        }
        else if (b.equals("lagarto") && a.equals("spock")) {
            return 2;
        }
        else if (b.equals("spock") && a.equals("piedra")) {
            return 2;
        }
        else if (b.equals("spock") && a.equals("tijeras")) {
            return 2;
        }
        else{
            
            return 0;
        }
        
    }
    
    
}
