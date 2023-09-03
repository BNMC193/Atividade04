import classes.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Passageiro a1 = new Passageiro();
        a1.setNumeroCartao("004.006.004");

        System.out.println(a1.getNumeroCartao());

    }
}
