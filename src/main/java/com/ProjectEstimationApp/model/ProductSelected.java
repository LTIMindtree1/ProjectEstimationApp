package com.ProjectEstimationApp.model;

public class ProductSelected {
    private boolean RetailBanking;
    private boolean SMEBanking;

    public boolean isRetailBanking() {
        return RetailBanking;
    }

    public void setRetailBanking(boolean retailBanking) {
        RetailBanking = retailBanking;
    }

    public boolean isSMEBanking() {
        return SMEBanking;
    }

    public void setSMEBanking(boolean SMEBanking) {
        this.SMEBanking = SMEBanking;
    }

    @Override
    public String toString() {
        return "ProductSelected{" +
                "RetailBanking=" + RetailBanking +
                ", SMEBanking=" + SMEBanking +
                '}';
    }
}
