package com.ProjectEstimationApp.model;

public class Channels {
    private boolean Mobile;
    private boolean Tablet;
    private boolean ResponsiveWeb;

    public boolean isMobile() {
        return Mobile;
    }

    public void setMobile(boolean mobile) {
        Mobile = mobile;
    }

    public boolean isTablet() {
        return Tablet;
    }

    public void setTablet(boolean tablet) {
        Tablet = tablet;
    }

    public boolean isResponsiveWeb() {
        return ResponsiveWeb;
    }

    public void setResponsiveWeb(boolean responsiveWeb) {
        ResponsiveWeb = responsiveWeb;
    }

    @Override
    public String toString() {
        return "Channels{" +
                "Mobile=" + Mobile +
                ", Tablet=" + Tablet +
                ", ResponsiveWeb=" + ResponsiveWeb +
                '}';
    }
}
