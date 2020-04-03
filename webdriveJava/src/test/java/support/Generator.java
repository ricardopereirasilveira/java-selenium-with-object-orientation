package support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
    public static String dHmS () {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("ddMMyyyyHHss").format(ts); // 25/03/1988 - 12:30
    }

    public static String date(){
        Timestamp date = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
