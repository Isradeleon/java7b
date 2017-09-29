package examenu1_israel_diaz_de_leon_nevarez;

/**
 *
 * @author Isra
 */
public class Glucosa {
    public static String clasificar(int glucosa){
        if (glucosa>=0 && glucosa<=89) {
            return "HIPOGLUCOSA";
        }else if(glucosa >= 90 && glucosa <= 110){
            return "NORMAL";
        }
        return "HIPERGLUCOSA";
    }
}
