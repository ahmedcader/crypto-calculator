package com.cader831.ahmed.enther.JObjects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CoinData implements Serializable {
    private Coin primaryCoin;
    private Coin secondaryCoin;
    private Exchange exchange;
    private BigDecimal downloadPrice;
    private Date lastUpdate;

    public CoinData(Coin primaryCoin, Coin secondaryCoin, Exchange exchange, BigDecimal downloadPrice, Date lastUpdate) {
        this.primaryCoin = primaryCoin;
        this.secondaryCoin = secondaryCoin;
        this.exchange = exchange;
        this.downloadPrice = downloadPrice;
        this.lastUpdate = lastUpdate;
    }

    public Coin getPrimaryCoin() {
        return primaryCoin;
    }

    public Coin getSecondaryCoin() {
        return secondaryCoin;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public BigDecimal getDownloadPrice() {
        return downloadPrice;
    }

    @Override
    public String toString() {
        SimpleDateFormat lastUpdateDate = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        return String.format("(%s-%s-%s): Downloaded Price: %.8f at %s", primaryCoin.getShortName(), secondaryCoin.getShortName(), exchange, downloadPrice, lastUpdateDate.format(lastUpdate).toString());
    }
}
