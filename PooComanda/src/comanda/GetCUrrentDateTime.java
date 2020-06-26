package comanda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCUrrentDateTime {

    private static final DateFormat dataformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {

        Date DATA = new Date();
        //System.out.println(dataformat.format(DATA));

    }
}
