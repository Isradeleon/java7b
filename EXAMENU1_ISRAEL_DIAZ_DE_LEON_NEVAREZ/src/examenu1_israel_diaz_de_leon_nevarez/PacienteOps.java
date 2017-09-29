package examenu1_israel_diaz_de_leon_nevarez;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Isra
 */
public class PacienteOps {
    public static final ArrayList<Paciente> LISTA_PACIENTES=new ArrayList();
    public static final Random RAND = new Random();
    
    private static final ArrayList<Integer> AUX_PRESION=new ArrayList();
    private static final ArrayList<Double> AUX_PESOESTATURA=new ArrayList();
    
    private static int aux;
    
    public static final DecimalFormat DEC_FORMAT = new DecimalFormat("#.##");
    
    public static void generarPacientes(int numero_pacientes){
        LISTA_PACIENTES.clear();
        for (int i = 0; i < numero_pacientes; i++) {
            presionFijarCaso();
            pesoEstaturaCaso();
            LISTA_PACIENTES.add(new Paciente(
                    NombresApellidos.NOMBRES[RAND.nextInt(NombresApellidos.NOMBRES.length)],
                    NombresApellidos.APELLIDOSA[RAND.nextInt(NombresApellidos.APELLIDOSA.length)],
                    NombresApellidos.APELLIDOSB[RAND.nextInt(NombresApellidos.APELLIDOSB.length)],
                    RAND.ints(50, 901).findAny().getAsInt(),
                    AUX_PRESION.get(0),
                    AUX_PRESION.get(1),
                    AUX_PESOESTATURA.get(0),
                    AUX_PESOESTATURA.get(1)
            ));
        }
    }
    
    private static void pesoEstaturaCaso(){
        AUX_PESOESTATURA.clear();
        aux=RAND.ints(40, 121).findAny().getAsInt();
        if (aux<120) {
            AUX_PESOESTATURA.add(Double.valueOf(String.valueOf(aux)+"."+String.valueOf(RAND.nextInt(100))));
        }else{
            AUX_PESOESTATURA.add(120.0);
        }
        
        aux=RAND.ints(1, 3).findAny().getAsInt();
        if (aux==1) {
            AUX_PESOESTATURA.add(Double.valueOf(String.valueOf(aux)+"."+String.valueOf(RAND.nextInt(100))));
        }else{
            AUX_PESOESTATURA.add(2.0);
        }
        
    }
    
    private static void presionFijarCaso(){
        AUX_PRESION.clear();
        aux=RAND.nextInt(4);
        switch (aux){
            case 0:
                AUX_PRESION.add(RAND.ints(110, 121).findAny().getAsInt());
                AUX_PRESION.add(RAND.ints(80, 91).findAny().getAsInt());
                break;
                
            case 1:
                AUX_PRESION.add(RAND.ints(109, 111).findAny().getAsInt());
                AUX_PRESION.add(RAND.ints(70, 80).findAny().getAsInt());
                break;
                
            case 2:
                AUX_PRESION.add(RAND.ints(130, 160).findAny().getAsInt());
                AUX_PRESION.add(RAND.ints(91, 100).findAny().getAsInt());
                break;
                
            case 3:
                AUX_PRESION.add(RAND.ints(160, 180).findAny().getAsInt());
                AUX_PRESION.add(RAND.ints(100, 110).findAny().getAsInt());
                break;
        }
    }
 }
