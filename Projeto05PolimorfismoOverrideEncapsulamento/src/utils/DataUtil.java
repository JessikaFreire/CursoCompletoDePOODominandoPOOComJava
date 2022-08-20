package Projeto05PolimorfismoOverrideEncapsulamento.src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    
    public static String converterDateParaDataEHora(Date data){
        // 16/08/2022 21:06hs
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(data);
    }
    
    public static String converterDateParaData(Date data){
        // 16/08/2022
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }

    public static String converterDateParaHora(Date data){
        // 16/08/2022 21:06hs
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(data);
    }
}
