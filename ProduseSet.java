package comanda;

import java.util.concurrent.atomic.AtomicInteger;

public class ProduseSet {

    public int cantitate ;                                      //  private int prettotal;
    public String unitmasura;

    public int getIdset() {
        return idset;
    }

    public void setIdset(int idset) {
        this.idset = idset;
    }

    public int idset;
    public double pu;              //pret pe unitate

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
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
    private static AtomicInteger count = new AtomicInteger(0);

    public ProduseSet(double pu, int cantitate, String unitmasura) {
        idset = count.incrementAndGet();
        this.pu = pu;
        this.cantitate=cantitate;
        this.unitmasura = unitmasura;
    }
}
