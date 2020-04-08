package support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class randomString {
    public static String dataHora(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyymmddhhss").format(ts);
    }
}
