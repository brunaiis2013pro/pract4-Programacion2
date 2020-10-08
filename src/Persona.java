import java.util.Date;

public class Persona {
    protected int codPersona;
    protected String nombre;
    protected String primerApellido;
    protected String segundoApelllido;
    protected String dni;
    protected Date fechaNacimiento;

    public Persona(int codPersona, String nombre, String primerApellido, String segundoApelllido, String dni, Date fechaNacimiento) {
        this.codPersona = codPersona;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApelllido = segundoApelllido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApelllido() {
        return segundoApelllido;
    }

    public void setSegundoApelllido(String segundoApelllido) {
        this.segundoApelllido = segundoApelllido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        String nombreCompleto= primerApellido;
        if(segundoApelllido!=null){
            nombreCompleto += "         "+segundoApelllido;
        }
        nombreCompleto+= "              "+nombre;
        return nombreCompleto;
    }
}
