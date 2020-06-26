package comanda;

import java.util.concurrent.atomic.AtomicInteger;

public class Produs {


    public String unitmasura;
    public int idprodus,cantitateprod;
    public double pu;              //pret pe unitate

    public int getCantitate() {
        return cantitateprod;
    }
    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }


    public String getUnitmasura() {
        return unitmasura;
    }

    public void setUnitmasura(String unitmasura) {
        this.unitmasura = unitmasura;
    }

    private static  AtomicInteger count = new AtomicInteger(50);


    public Produs(double pu, String unitmasura) {
        idprodus = count.incrementAndGet();
        this.pu =pu;
        this.unitmasura = unitmasura;
    }

}
