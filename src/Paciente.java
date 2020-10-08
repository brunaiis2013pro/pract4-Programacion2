import java.util.Date;

public class Paciente extends Persona {
    private String numeroSeguridadSocial;

    public Paciente(int codPersona, String nombre, String primerApellido, String segundoApelllido, String dni, Date fechaNacimiento,String numeroSeguridadSocial){
        super(codPersona,nombre,primerApellido,segundoApelllido,dni,fechaNacimiento);

        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
