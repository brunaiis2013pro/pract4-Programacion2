import java.util.Date;
import java.util.List;

public class Medico extends Persona {
    private List<Servicio> servicios;
    private Hospital hospital;

    public Medico(int codPersona, String nombre, String primerApellido, String segundoApelllido, String dni, Date fechaNacimiento,List<Servicio> servicios,Hospital hospital){
        super(codPersona,nombre,primerApellido,segundoApelllido,dni,fechaNacimiento);

        this.setServicios(servicios);
        this.setHospital(hospital);
    }

    public Medico(int codPersona, String nombre, String primerApellido, String segundoApelllido, String dni, Date fechaNacimiento, List<Servicio> servicios) {
        super(codPersona, nombre, primerApellido, segundoApelllido, dni, fechaNacimiento);
        this.servicios = servicios;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
