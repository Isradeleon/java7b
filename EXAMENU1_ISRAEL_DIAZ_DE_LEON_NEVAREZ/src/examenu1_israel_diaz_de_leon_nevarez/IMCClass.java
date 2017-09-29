package examenu1_israel_diaz_de_leon_nevarez;

/**
 *
 * @author Isra
 */
public class IMCClass {
    public static String clasificar(double IMC){
        if (IMC < 18) {
            return "Peso bajo";
        }else if (IMC>=18 && IMC<25) {
            return "Normal";
        }else if(IMC>=25 && IMC<27){
            return "Sobrepeso";
        }else if(IMC>=27 && IMC<30){
            return "Obesidad I";
        }else if(IMC>=30 && IMC<40){
            return "Obesidad II";
        }
        return "Obesidad III";
    }
}
