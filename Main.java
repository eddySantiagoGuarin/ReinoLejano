import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hechizosKargalgan = new ArrayList<>(Arrays.asList("Control de sombra", "Ilusión", "Invocacion"));
        Mago kargalgan = new Mago("kargalgan", 7, 100, 1000, hechizosKargalgan);
        Sanador min = new Sanador("Min", 10, 100, 1000, 5);
        Luchador sung = new Luchador("Sung", 10, 100, 2000, 400, "Guerrero");
        Luchador thomas = new Luchador("Thomas", 10, 100, 2000, 400, "Tanque");
        System.out.println(kargalgan.toString());
        System.out.println(min.toString());
        System.out.println(sung.toString());
        System.out.println(thomas.toString());
        
        System.out.println("--------");
        kargalgan.usarHabilidad(sung);
        sung.usarHabilidad(kargalgan);
        System.out.println("Vida de Thomas antes: " + thomas.getVida());
        sung.usarHabilidad(thomas);
        System.out.println("Vida de Thomas despues del ataque: " + thomas.getVida());
        min.usarHabilidad(thomas);
        System.out.println("Vida de Thomas despues de curación: " + thomas.getVida()+" y sanaciones de Min"+min.getSanaciones());
        System.out.println("--------");

        System.out.println(kargalgan.toString());
        System.out.println(min.toString());
        System.out.println(sung.toString());
        System.out.println(thomas.toString());

    }

}
