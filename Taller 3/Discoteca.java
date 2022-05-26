public class Discoteca{
    public boolean accesoDiscoteca(int edad, int dinero, String nombre){
        if (edad>=18 && dinero>=100 && !nombre.equals("jimmy")){
            return true;
        }
        
            return false;
        
    }
}