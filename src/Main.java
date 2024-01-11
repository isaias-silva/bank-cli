import com.bank.ContaCorrente;
import com.bank.ContaGlobal;
import com.bank.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {

        ContaGlobal contaOne = new ContaCorrente();
        ContaGlobal contaTwo = new ContaPoupanca();

        contaOne.setSaldo(1000);
        contaOne.transferir(100,contaTwo);

        contaOne.info();
        contaTwo.info();
    }
}