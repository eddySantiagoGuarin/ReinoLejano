public class Luchador extends Personaje {
    private int fuerza ;
    private String estiloPelea;
   
    public Luchador(String nombre, int nivel, int vida, int energia, int fuerza,String estiloPelea) {
        super(nombre, nivel, vida, energia);
        this.fuerza = fuerza;
        this.estiloPelea = estiloPelea;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getEstiloPelea() {
        return estiloPelea;
    }

    public void setEstiloPelea(String estiloPelea) {
        this.estiloPelea = estiloPelea;
    }

    public void atacar(Personaje personaje){
        int ataque=(int)(this.fuerza*0.08);
        personaje.setVida(personaje.getVida()-ataque);
    }

    @Override
    public void usarHabilidad(Personaje atacado) {
        atacar(atacado);
        gastarEnergia(20);
       System.out.println("El luchador "+this.getNombre()+" ha atacado a "+atacado.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", fuerza=" + fuerza +
                ", estiloPelea='" + estiloPelea + '\'' +
                '}';
    }
}
