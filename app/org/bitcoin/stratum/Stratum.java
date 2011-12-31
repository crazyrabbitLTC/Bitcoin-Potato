package org.bitcoin.stratum;

import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Stratum {
    public Stratum(NetworkParameters networkParameters) {
        this.networkParameters = networkParameters;
    }

    private final NetworkParameters networkParameters;

    public static BigDecimal satoshisToBitcoin(BigInteger satoshis) {
        return new BigDecimal("0.00000001").multiply(new BigDecimal(satoshis));
    }

    public KeyPair newKeyPair() {
        ECKey key = new ECKey();
        return new KeyPair(key.toAddress(networkParameters).toString(), key.getPrivKeyBytes());
    }

    /**
     * Returns a list of all transaction that went to {@code address}, sorted by date.
     */
    public List<RemoteTransaction> getIncomingTransactions(String address) {
        // TODO
        return newArrayList();
    }

    public void sendTransaction(OutgoingRemoteTransaction outgoingTx) {
    }
}

