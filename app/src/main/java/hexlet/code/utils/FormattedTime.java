package hexlet.code.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedTime {
    public static String formattedTime(Timestamp fullFormatCurrentTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(fullFormatCurrentTime);
    }
    public static Timestamp currentTime() {
        Date actualDate = new Date();
        return new Timestamp(actualDate.getTime());
    }
}
