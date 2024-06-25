package hslu.vsk.bank.api;

import java.net.InetSocketAddress;
import java.util.Currency;

public interface BankSetup {
    Bank newBank();

    boolean isCurrency();

    void setCurrency(Currency currency);

    void setSource(String source);

    String getSource();

    InetSocketAddress getBankServerAddress();

    void setBankServerAddress();
}
