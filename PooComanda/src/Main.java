import comanda.*;

import static comanda.Status.*;


public class Main {


    public static void main(String[]args) {
       // int pu, String unitmasura)


            Produs prod1=new Produs(21,"kg");
            Produs prod2=new Produs(15.4,"litri");
            Produs prod3=new Produs(4,"g");

// int pu, int cantitate,String unitmasura)
            ProduseSet prodset1=new ProduseSet(5,4,"dm");
             ProduseSet prodset2=new ProduseSet(18.5,2,"dm");
//status
            Comanda com1=new Comanda(PLASATA);
            Comanda com2=new Comanda(IN_DESFASURARE);
            Comanda com3=new Comanda(ANULATA);
            System.out.println("==========================================");

            //pt com1
        com1.addProdus(prod1,1);
        com1.addProdus(prod2,1);
        com1.addProduseSet(prodset1,2);
        com1.comandagata();


}
}