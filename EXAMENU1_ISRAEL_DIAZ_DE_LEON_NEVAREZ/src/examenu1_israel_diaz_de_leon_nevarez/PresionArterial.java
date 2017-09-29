package examenu1_israel_diaz_de_leon_nevarez;

/**
 *
 * @author Isra
 */
public class PresionArterial {
    public static String clasificar(int presiona, int presionb){
        if (presiona<110 && presionb<79) {
            return "Hipotensión";
        }else if (presiona>=110 && presiona<=120 && presionb>=80 && presionb<=90) {
            return "Normal";
        }else if(presiona>=121 && presiona<=139 && presionb>=91 && presionb<=99){
            return "Alta";
        }else if(presiona>=140 && presiona<=159 && presionb>=91 && presionb<=99){
            return "Normal-Alta";
        }
        return "Hipertensión 1";
    }
}
