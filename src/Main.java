import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(1,"Andres","Machaca","Flores","59856-1A", Calendar.getInstance().getTime(),"359BA8");
        Paciente p2 = new Paciente(2,"Luis","Enrique","Sainz","3213-1B",Calendar.getInstance().getTime(), "3213BOB");
        Paciente p3 = new Paciente(3,"Daniel","Sarzuri","Mamani","3573-1C",Calendar.getInstance().getTime(), "32131CB");

        Ciudad c1 = new Ciudad("Cb","Cochabamba");
        Ciudad c2 = new Ciudad("LP","LA PAZ");
        Ciudad c3 = new Ciudad("Sr","SUCRE");

        Historial h1 = new Historial("AA",p1);
        Historial h2 = new Historial("BB",p2);
        Historial h3 = new Historial("OO",p3);

        List<Servicio> servicios = new ArrayList<>();
        Servicio s1 = new Servicio("Analisis de Sangre",15,"ninguno");
        servicios.add(s1);
        Servicio s2 = new Servicio("Revision de corazon",12,"ninguno");
        servicios.add(s2);
        Servicio s3 = new Servicio("Estudio de la sangre",11,"ninguno");
        servicios.add(s3);

        List<Medico> medicos = new ArrayList<>();
        Medico m1 = new Medico(11,"Juan","Pereda","Asbun","9896-1C",Calendar.getInstance().getTime(),servicios);
        medicos.add(m1);
        Medico m2 = new Medico(12,"Hernan","Siles","Suazo","997965",Calendar.getInstance().getTime(), servicios);
        medicos.add(m2);
        Medico m3 = new Medico(13,"Jhon","Maynard","Keynes","5984-1B",Calendar.getInstance().getTime(), servicios);

        Hospital hospital1 = new Hospital("LAB-P","UNIVALLE",c1,4435697,servicios,m1);
        Hospital hospital2 = new Hospital("LAB-C","SAN FRANCISCO",c2,4421467,servicios,m2);
        Hospital hospital3= new Hospital("LAB-D","JUAN DE DIOS",c3,4431577,servicios,m3);

        Visita v1 = new Visita("BBC",Calendar.getInstance().getTime(),hospital1,s1,m1,"Aparantemente el paciente no presenta ningun sintoma del virus.","Debe mantener reposo y evitar hacer esfuerzos.",18,Calendar.getInstance().getTime(),h1);
        Visita v2 = new Visita("PIB",Calendar.getInstance().getTime(),hospital2,s2,m2,"El paciente aun se encuentra en estado de coma","Esperar para realizar la operacion",20,Calendar.getInstance().getTime(), h2);
        Visita v3 = new Visita("BID",Calendar.getInstance().getTime(), hospital3,s3,m3,"Se encuentra en buen estado","No hacer muchos esfuerzos",22,Calendar.getInstance().getTime(), h3);

        System.out.println("\t\t\t\t\tINFORME CLINICO");
        System.out.println("\t\t=========================================");
        System.out.println("\tNRO\tPRIMER-APELLIDO\tSEGUNDO-APELLIDO\tNOMBRE\t  DNI\t\tN°SEGURIDAD-SOCIAL");
        System.out.println("|--------------------------------------------------------------------------------\n");
        System.out.println("|\t"+p1.getCodPersona()+"\t"+p1.toString()+"\t"+p1.getDni()+"\t "+p1.getNumeroSeguridadSocial()+"\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Servicio: "+s1.getNombre()+"\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Diagnostico: "+v1.getDiagnostico()+"\t|");
        System.out.println("|Tratamiento: "+v1.getTratamientos()+"\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________________________|");
        System.out.println("|Hospital: "+hospital1.getNombre()+"\t\t\t"+"Ciudad: "+hospital1.getCiudad().getNombre()+"\t\t\t"+"Telefono: "+hospital1.getTelefono()+"\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Director: "+hospital1.getDirector()+"\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Fecha: "+v1.getFechaSalida()+"\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________________________|");
        System.out.println();
        System.out.println("\t\t\t\t\tINFORME CLINICO");
        System.out.println("\t\t=========================================");
        System.out.println("\tNRO\tPRIMER-APELLIDO\tSEGUNDO-APELLIDO\tNOMBRE\t  DNI\t\tN°SEGURIDAD-SOCIAL");
        System.out.println("|--------------------------------------------------------------------------------\n");
        System.out.println("|\t"+p2.getCodPersona()+"\t"+p2.toString()+"\t\t"+p2.getDni()+"\t\t "+p2.getNumeroSeguridadSocial()+"\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Servicio: "+s2.getNombre()+"\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Diagnostico: "+v2.getDiagnostico()+"\t\t\t\t\t|");
        System.out.println("|Tratamiento: "+v2.getTratamientos()+"\t\t\t\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________________________|");
        System.out.println("|Hospital: "+hospital2.getNombre()+"\t\t\t"+"Ciudad: "+hospital2.getCiudad().getNombre()+"\t\t\t"+"Telefono: "+hospital2.getTelefono()+"\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Director: "+hospital2.getDirector()+"\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Fecha: "+v2.getFechaSalida()+"\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________________________|");
    }
}
