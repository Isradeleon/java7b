package examenu1_israel_diaz_de_leon_nevarez;

/**
 *
 * @author Isra
 */
public class Paciente {
    private final String nombre;
    private final String apellidoa;
    private final String apellidob;
    private final int glucosa;
    private final String glucosaC;
    private final int presionA;
    private final int presionB;
    private final String presionC;
    private final double peso;
    private final double estatura;
    private final double IMC;
    private final String IMCC;

    public Paciente(String nombre, String apellidoa, String apellidob, int glucosa, int presionA, int presionB, double peso, double estatura) {
        this.nombre = nombre;
        this.apellidoa = apellidoa;
        this.apellidob = apellidob;
        this.glucosa = glucosa;
        this.presionA = presionA;
        this.presionB = presionB;
        this.peso = peso;
        this.estatura = estatura;
        
        this.IMC=Double.valueOf(PacienteOps.DEC_FORMAT.format(this.peso/Math.pow(this.estatura, 2)));
        this.glucosaC=Glucosa.clasificar(this.glucosa);
        this.presionC=PresionArterial.clasificar(this.presionA,this.presionB);
        this.IMCC=IMCClass.clasificar(this.IMC);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoa() {
        return apellidoa;
    }

    public String getApellidob() {
        return apellidob;
    }

    public int getGlucosa() {
        return glucosa;
    }

    public String getGlucosaC() {
        return glucosaC;
    }

    public int getPresionA() {
        return presionA;
    }

    public int getPresionB() {
        return presionB;
    }

    public String getPresionC() {
        return presionC;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getIMC() {
        return IMC;
    }

    public String getIMCC() {
        return IMCC;
    }
}
