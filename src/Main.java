import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Hello world!");
=======
>>>>>>> d93d81c3da347cdd904fcc5a78cf5b9693ec3150

        Persona persona = new Persona();
        persona.nombre = "Pepe Pérez";
        persona.edad = 31;
        persona.fechaContratacion = new Date(90, Calendar.FEBRUARY, 1);

        System.out.println("Se ha registrado a " + persona.nombre + " (" + persona.edad + " años; contratado en 19" + persona.fechaContratacion.getYear() + ")");
<<<<<<< HEAD
=======

        Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);
>>>>>>> d93d81c3da347cdd904fcc5a78cf5b9693ec3150
    }
}