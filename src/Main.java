import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        //Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        //p.edad = -31; // Arreglado: error de compilación. edad no es accesible

        Empleado p2 = new Empleado("Pepe Pérez", -31, new Date(90, Calendar.FEBRUARY, 1));

        Empleado p = Empleado.crearEmpleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        /*
        Ya no se puede pasar una edad negativa: lanzaría una excepción en tiempo de ejecución.
        Empleado p2 = Empleado.crearEmpleado("Pepe Pérez", -31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p2);
         */


<<<<<<< HEAD
=======
        p.nombre = "Manolo"; // Cambio de nombre. No se debe permitir
        p.fechaContratacion = new Date(99, Calendar.FEBRUARY, 1); // Cambio de fecha. No se debe permitir
        //p.nombre = "Manolo";
        //p.fechaContratacion = new Date(99, Calendar.FEBRUARY, 1);
>>>>>>> feat_inmutable_fields
    }
}