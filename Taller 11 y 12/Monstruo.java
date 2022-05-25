public class Monstruo{
    private String nombre;
    private int sangre;
    public Monstruo(String nombre, int sangre){
        this.nombre = nombre;
        this.sangre = sangre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getSangre(){
        return this.sangre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setSangre(int n){
        this.sangre = n;
    }
    public void moverse(){
        System.out.println("Soy un monstruo que se mueve lento "+this.getNombre());
    }
}

