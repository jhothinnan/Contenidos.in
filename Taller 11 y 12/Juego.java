public class Juego{
    private Monstruo [] monstruos = new Monstruo [4];
    public Juego(){
        this.monstruos[0]=new Orco("Garnag",10,"grrr");
        this.monstruos[1]=new Dragon("Brenton",20,"metal");
        this.monstruos[2]=new Orco("Rogthun",5,"purr");
        this.monstruos[3]=new Dragon("Shenlong",40,"cuero");
    }
    public void moverMonstruos(){
        for(int i = 0; i < monstruos.length; i++){
            this.monstruos[i].moverse();
        }
    }
}
