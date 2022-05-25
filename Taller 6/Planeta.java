public class Planeta
{
    private String nombre;
    private double masa;
    public int contador = 0;
    
    public Planeta(){
        this("Tierra",5.972);
    }
    public Planeta(String n, double m){
        this.nombre = n;
        this.masa = m;
    }
    String getNombre(){
        return this.nombre;
    }
    double getMasa(){
        return this.masa;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setMasa(double m){
        this.masa = m;
    }
    public static Planeta planetaMedio(Planeta p){
        Planeta p1 = new Planeta(p.getNombre(),(p.getMasa()/2));
        return p1;
    }
}