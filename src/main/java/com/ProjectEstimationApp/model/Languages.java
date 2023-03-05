package com.ProjectEstimationApp.model;

public class Languages {
    private String LeftToRight;
    private String RightToLeft;
    private boolean IsTransactBackend;

    public String getLeftToRight() {
        return LeftToRight;
    }

    public void setLeftToRight(String leftToRight) {
        LeftToRight = leftToRight;
    }

    public String getRightToLeft() {
        return RightToLeft;
    }

    public void setRightToLeft(String rightToLeft) {
        RightToLeft = rightToLeft;
    }

    public boolean isTransactBackend() {
        return IsTransactBackend;
    }

    public void setTransactBackend(boolean transactBackend) {
        IsTransactBackend = transactBackend;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "LeftToRight='" + LeftToRight + '\'' +
                ", RightToLeft='" + RightToLeft + '\'' +
                ", IsTransactBackend=" + IsTransactBackend +
                '}';
    }
}
