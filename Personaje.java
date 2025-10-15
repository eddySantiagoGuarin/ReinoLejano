public abstract class  Personaje {
    protected String nombre;
    protected int nivel;
    protected int vida;
    protected int energia;

    public Personaje(String nombre, int nivel, int vida, int energia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.energia = energia;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void usarHabilidad(Personaje personaje);

    public void gastarEnergia(int cantidad){
        this.energia=this.energia-cantidad;
    }

    public void recibirDaño(int cantidad){
        this.vida=this.vida-cantidad;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                ", energia=" + energia ;
    }

}
