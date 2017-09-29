package examenu1_israel_diaz_de_leon_nevarez;

import java.util.Scanner;

/**
 *
 * @author Isra
 */
public class EXAMENU1_ISRAEL_DIAZ_DE_LEON_NEVAREZ {

    private static int option;
    private static final String AUX_CHARS="                   ";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\t** Examen Unidad 1 **");
        System.out.println("- Cuantos pacientes generar?");
        try{
            option=input.nextInt();
            if (option>0) {
                System.out.print(" "+"NOMBRE"+AUX_CHARS.substring("NOMBRE".length())+"|");
                System.out.print(" "+"AP P"+AUX_CHARS.substring("AP P".length())+"|");
                System.out.print(" "+"AP M"+AUX_CHARS.substring("AP M".length())+"|");
                System.out.print(" "+"GLUCOSA"+AUX_CHARS.substring("GLUCOSA".length())+"|");
                System.out.print(" "+"CLASS GLUCOSA"+AUX_CHARS.substring("CLASS GLUCOSA".length())+"|");
                System.out.print(" "+"PRESION"+AUX_CHARS.substring("PRESION".length())+"|");
                System.out.print(" "+"CLASS P ARTERIAL"+AUX_CHARS.substring("CLASS P ARTERIAL".length())+"|");
                System.out.print(" "+"PESO"+AUX_CHARS.substring("PESO".length())+"|");
                System.out.print(" "+"ESTATURA"+AUX_CHARS.substring("ESTATURA".length())+"|");
                System.out.print(" "+"IMC"+AUX_CHARS.substring("IMC".length())+"|");
                System.out.print(" "+"CLASS IMC"+AUX_CHARS.substring("CLASS IMC".length())+"|");
                System.out.print("\n");
                PacienteOps.generarPacientes(option);
                for (int i = 0; i < PacienteOps.LISTA_PACIENTES.size(); i++) {
                    System.out.print(" "+PacienteOps.LISTA_PACIENTES.get(i).getNombre()
                            +AUX_CHARS.substring(PacienteOps.LISTA_PACIENTES.get(i).getNombre().length())
                            +"|"
                    );
                    System.out.print(" "+PacienteOps.LISTA_PACIENTES.get(i).getApellidoa()
                            +AUX_CHARS.substring(PacienteOps.LISTA_PACIENTES.get(i).getApellidoa().length())
                            +"|"
                    );
                    System.out.print(" "+PacienteOps.LISTA_PACIENTES.get(i).getApellidob()
                            +AUX_CHARS.substring(PacienteOps.LISTA_PACIENTES.get(i).getApellidob().length())
                            +"|"
                    );
                    System.out.print(" "+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getGlucosa())
                            +AUX_CHARS.substring(String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getGlucosa()).length())
                            +"|"
                    );
                    System.out.print(" "+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getGlucosaC())
                            +AUX_CHARS.substring(String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getGlucosaC()).length())
                            +"|"
                    );
                    System.out.print(" "+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getPresionA())+"/"+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getPresionB())
                            +AUX_CHARS.substring(String.valueOf(String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getPresionA())+"/"+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getPresionB())).length())
                            +"|"
                    );
                    System.out.print(" "+PacienteOps.LISTA_PACIENTES.get(i).getPresionC()
                            +AUX_CHARS.substring(PacienteOps.LISTA_PACIENTES.get(i).getPresionC().length())
                            +"|"
                    );
                    System.out.print(" "+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getPeso())
                            +AUX_CHARS.substring(String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getPeso()).length())
                            +"|"
                    );
                    System.out.print(" "+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getEstatura())
                            +AUX_CHARS.substring(String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getEstatura()).length())
                            +"|"
                    );
                    System.out.print(" "+String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getIMC())
                            +AUX_CHARS.substring(String.valueOf(PacienteOps.LISTA_PACIENTES.get(i).getIMC()).length())
                            +"|"
                    );
                    System.out.print(" "+PacienteOps.LISTA_PACIENTES.get(i).getIMCC()
                            +AUX_CHARS.substring(PacienteOps.LISTA_PACIENTES.get(i).getIMCC().length())
                            +"|"
                    );
                    System.out.print("\n");
                }
            }else{
                System.out.println("No hay pacientes que mostrar!");
            }
        }catch(Exception e){
            System.out.println("Error: Solo debería ingresar números enteros!");
        }
    }
    
}
