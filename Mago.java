import java.util.List;
import java.util.Scanner;

public class Mago extends Personaje {
    private List<String> hechizos;

    public Mago(String nombre, int nivel, int vida, int energia, List<String> hechizos) {
        super(nombre, nivel, vida, energia);
        this.hechizos = hechizos;
    }

    public List<String> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<String> hechizos) {
        this.hechizos = hechizos;
    }

    public void mostraHechizos(List<String> hechizos){
        for(String hechizo : hechizos){
            System.out.println(hechizos.indexOf(hechizo)+" "+hechizo);
        }
    }

    public static String seleccionarHechizo(List<String> hechizos){
        System.out.println("Ingrese el numero del tipo de hechizo q desea usar: ");
        Scanner scanner =new Scanner(System.in);
        int hechizo=scanner.nextInt();
        return hechizos.get(hechizo) ;
    }

    @Override
    public void usarHabilidad(Personaje atacado) {
        mostraHechizos(this.hechizos);
        String hechizo=seleccionarHechizo(this.hechizos);
        gastarEnergia(20);
        System.out.println("El Mago "+this.getNombre()+" ha usado su hechizo "+hechizo+" contra "+atacado.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", hechizos=" + hechizos +
                '}';
    }
}
