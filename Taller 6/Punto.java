public class Punto
{
    private double x;
    private double y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    public void setX(double n){
        this.x = n;
    }
    public void setY(double n){
        this.y = n;
    }
    public static double distancia(Punto p1, Punto p2){
        double diferenciaX = p1.getX()-p2.getX();
        double diferenciaY = p1.getY()-p2.getY();
        return Math.sqrt(Math.pow(diferenciaX,2)+Math.pow(diferenciaY,2));
    }
}