package ExpoPrueba1;
import java.util.ArrayList;
public class PromAula {
    public static void main(String[] args) {
        double sumanota=0;
        double promaula=0;
        NotaAlumno a = new NotaAlumno("Julio Espinoza", 294875, 19);
        NotaAlumno b = new NotaAlumno("Luis Quispe", 354876, 17);
        NotaAlumno c = new NotaAlumno("Sergio Rodriguez", 598675, 14);
        NotaAlumno d = new NotaAlumno("Carlos Roca", 597846, 16);
        ArrayList<NotaAlumno> proms = new ArrayList<NotaAlumno>();
        proms.add(a);
        proms.add(b);
        proms.add(c);
        proms.add(d);
        System.out.println("Los alumnos del aula y su respectiva nota son:");
        for (NotaAlumno var : proms) {
            System.out.println(var.nombre + ": " + var.prom);
        }
        System.out.println("El promedio del aula es: ");
        double n=0;
        for (NotaAlumno var : proms) {
            n ++;
            sumanota += var.prom;
            promaula = sumanota / n;
        }
        System.out.println(promaula);
    }
    
}
