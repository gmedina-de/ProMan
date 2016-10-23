package libs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String getEstado(int a){
        switch(a){
            case 0:
            default:
                return "Sin empezar";
            case 1:
                return "Comenzada";
            case 2:
                return "Finalizada";
        }
    }
    
    public static String getPrioridad(int a){
        switch(a){
            case 1:
                return "Alta";
            case 2:
                return "Media";
            case 3:
            default:
                return "Baja";
            
        }
    }
    
    public static String longDateToString(long a){
        SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy");
        return (a==0) ? "-" : df.format(new Date(a));
    }
    
}
