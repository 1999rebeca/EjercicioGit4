import java.time.LocalDate;
import java.util.Date;
<<<<<<< HEAD
class Empleado {
    String nombre;
<<<<<<< HEAD
    private int edad;
=======
    final String nombre;
    int edad;
>>>>>>> feat_inmutable_fields
    Date fechaContratacion;
    final Date fechaContratacion;

    public Empleado(String nombre, int edad, Date fechaContratacion) {
<<<<<<< HEAD
=======

class Empleado {
    private final String nombre;
    private int edad;
    private final Date fechaContratacion;
    private final LocalDate fechaContratacion;

>>>>>>> bug_deprecated_date_type
    private Empleado(String nombre, int edad, Date fechaContratacion) {
    private Empleado(String nombre, int edad, LocalDate fechaContratacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.fechaContratacion = fechaContratacion;
        }
        public void setEdad(int edad) {
            if (edad < 0) throw new RuntimeException("Un empleado no puede tener edad negativa");
            else this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public int getEdad() {
            return edad;
        }

        public Date getFechaContratacion() {
            public LocalDate getFechaContratacion() {
                return fechaContratacion;
            }

<<<<<<< HEAD
    }
=======
        this.nombre = nombre;
        this.edad = edad;
        this.fechaContratacion = fechaContratacion;
    }
    @Override
    public String toString() {
        return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";
    }
}
>>>>>>> feat_inmutable_fields
=======
            @Override
            public String toString() {
                return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";
            }
            /**
             * Método factoría que permite comprobar si la edad es válida antes de llamar al constructor.
             * El constructor es ahora privado, impidiendo llamarlo directamente desde otra clase.
             */
            public static Empleado crearEmpleado(String nombre, int edad, Date fechaContratacion) {
                public static Empleado crearEmpleado(String nombre, int edad, LocalDate fechaContratacion) {
                    if (edad < 0) throw new RuntimeException("Un empleado no puede tener edad negativa");
                    else return new Empleado(nombre, edad, fechaContratacion);
                }
            }
>>>>>>> bug_deprecated_date_type
