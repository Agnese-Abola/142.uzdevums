package com.company;

public class SmartPhone extends Phone {
    private boolean isAvailableInternet;
    private boolean isAvailableDownloadingApps;

    public SmartPhone(double memory, String brand, String color, boolean isVideoCamera, boolean isAvailableInternet, boolean isAvailableDownloadingApps) {
        super(memory, brand, color, isVideoCamera);
        this.isAvailableInternet = isAvailableInternet;
        this.isAvailableDownloadingApps = isAvailableDownloadingApps;
    }

    public boolean isAvailableInternet() {
        return isAvailableInternet;
    }

    public boolean isAvailableDownloadingApps() {
        return isAvailableDownloadingApps;
    }

    public void setAvailableInternet(boolean availableInternet) {
        isAvailableInternet = availableInternet;
    }

    public void setAvailableDownloadingApps(boolean availableDownloadingApps) {
        isAvailableDownloadingApps = availableDownloadingApps;
    }

}
