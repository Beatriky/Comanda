package comanda;
import comanda.Produs;
import comanda.ProduseSet;
import comanda.GetCUrrentDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Comanda {
    public String datacomanda;
    public int idcomanda;
    Status status;
    private static AtomicInteger count = new AtomicInteger(0);
    private static final DateFormat dataformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date DATA = new Date();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate localDate = LocalDate.now();

    public Comanda(Status status) {

        idcomanda= count.incrementAndGet();
        this.idcomanda = idcomanda;
        this.prettotal = prettotal;
        datacomanda=dtf.format(localDate);
    }




    List<Produs> produse=new ArrayList<>();
    List<ProduseSet> produseset=new ArrayList<>();

    public double  prettotal;

    public void addProdus(Produs produs,int cantitate)
    {
        produse.add(produs);
        System.out.println("produsul/urile cu id-ul "+produs.idprodus+" a/au fost adaugat/e in comanda "+this.idcomanda);

        this.prettotal=this.prettotal+produs.pu;
    }
    public void addProduseSet(ProduseSet produslaset,int cantitate){
        produseset.add(produslaset);
        System.out.println("Produsurile cu id-ul "+produslaset.idset+" au fost adaugate in comanda "+this.idcomanda);

        this.prettotal=this.prettotal+produslaset.pu*produslaset.cantitate;
    }

    public double getPrettotal() {
        return prettotal;
    }

    public void setPrettotal(double prettotal) {
        this.prettotal = prettotal;
    }

    public void comandagata() {
        System.out.println("COMANDA: ID"+this.idcomanda+" data:"+dataformat.format(DATA)+" pretul total "+prettotal+" statusul "+this.status);
        System.out.println("PRODUSELE COMANDATE:");

        for(Produs produs : produse) {
            System.out.println("id:"+produs.idprodus+" pret "+produs.pu+" cantitate "+produs.cantitateprod);
        }
        for(ProduseSet produselaset : produseset) {
            System.out.println("id:"+produselaset.idset+" pret "+produselaset.pu+" cantitate "+produselaset.cantitate);
        }
        System.out.println("Pret Total:"+prettotal);
        System.out.println("----------------------------------------------------------");
    }

}
