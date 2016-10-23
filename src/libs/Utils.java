package libs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getEstado(int estado) {
        switch (estado) {
            case 0:
            default:
                return "Sin empezar";
            case 1:
                return "Comenzada";
            case 2:
                return "Finalizada";
        }
    }

    public static String getPrioridad(int estado) {
        switch (estado) {
            case 1:
                return "Alta";
            case 2:
                return "Media";
            case 3:
            default:
                return "Baja";

        }
    }

    public static String longDateToString(long fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        return (fecha == 0) ? "-" : dateFormat.format(new Date(fecha));
    }

}
