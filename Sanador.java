public class Sanador extends Personaje {
    private int sanaciones;
    public Sanador(String nombre, int nivel, int vida, int energia, int sanaciones) {
        super(nombre, nivel, vida, energia);
        this.sanaciones = sanaciones;
    }

    public int getSanaciones() {
        return sanaciones;
    }

    public void setSanaciones(int sanaciones) {
        this.sanaciones = sanaciones;
    }

    public void sanar(Personaje personaje){
        this.sanaciones=this.sanaciones-1; 
        personaje.setVida(personaje.getVida()+30);
    }

    @Override
    public void usarHabilidad(Personaje curado) {
        sanar(curado);
        gastarEnergia(20);
       System.out.println("El Sanador "+this.getNombre()+" ha usado su habilidad de curacion en "+curado.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", sanaciones=" + sanaciones +
                '}';
    }
}
