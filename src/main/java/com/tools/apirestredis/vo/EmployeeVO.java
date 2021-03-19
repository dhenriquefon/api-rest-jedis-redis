package com.tools.apirestredis.vo;

public class EmployeeVO {

    boolean hasProgramming;
    boolean indDiffer;
    int destVersionId;
    int switchingPercentage;
    int programmingId;
    boolean indStartWifiOnly;
    int maxTermDownloadingVersion;

    public EmployeeVO(boolean hasProgramming, boolean indDiffer, int destVersionId, int switchingPercentage, int programmingId
                    , boolean indStartWifiOnly, int maxTermDownloadingVersion) {

        this.hasProgramming             = hasProgramming;
        this.indDiffer                  = indDiffer;
        this.destVersionId              = destVersionId;
        this.switchingPercentage        = switchingPercentage;
        this.programmingId              = programmingId;
        this.indStartWifiOnly           = indStartWifiOnly;
        this.maxTermDownloadingVersion  = maxTermDownloadingVersion;

    }

    public EmployeeVO() {}


    public boolean getHasProgramming() {
        return hasProgramming;
    }

    public void setHasProgramming(boolean hasProgramming) {
        this.hasProgramming = hasProgramming;
    }

    public boolean getIndDiffer() {
        return indDiffer;
    }

    public void setIndDiffer(boolean indDiffer) {
        this.indDiffer = indDiffer;
    }

    public int getDestVersionId() {
        return destVersionId;
    }

    public void setDestVersionId(int destVersionId) {
        this.destVersionId = destVersionId;
    }

    public int getSwitchingPercentage() {
        return switchingPercentage;
    }

    public void setSwitchingPercentage(int switchingPercentage) {
        this.switchingPercentage = switchingPercentage;
    }

    public int getProgrammingId() {
        return programmingId;
    }

    public void setProgrammingId(int programmingId) { this.programmingId = programmingId; }

    public boolean getIndStartWifiOnlye() { return indStartWifiOnly; }

    public void setIndStartWifiOnlye(boolean indStartWifiOnly) {
        this.indStartWifiOnly = indStartWifiOnly;
    }

    public int getMaxTermDownloadingVersion() {
        return maxTermDownloadingVersion;
    }

    public void setMaxTermDownloadingVersion(int maxTermDownloadingVersion) { this.maxTermDownloadingVersion = maxTermDownloadingVersion; }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()//
                .append("EmployeeVO [")//
                .append("hasProgramming=") //
                .append(hasProgramming) //
                .append("indDiffer=") //
                .append(indDiffer) //
                .append("destVersionId=") //
                .append(destVersionId) //
                .append("switchingPercentage=") //
                .append(switchingPercentage) //
                .append("programmingId=") //
                .append(programmingId) //
                .append("indStartWifiOnly=") //
                .append(indStartWifiOnly) //
                .append("maxTermDownloadingVersion=") //
                .append(maxTermDownloadingVersion) //
                .append("]");
        return builder.toString();
    }
}
