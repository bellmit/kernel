package com.bsoft.project.report.entity.primary;

public class ProjectLevelManPowerMoneyAllByMonthDO  extends ProjectLevelManPowerMoneyAllDO{
    private String YEAR;
    private String MONTH;

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    public String getMONTH() {
        return MONTH;
    }

    public void setMONTH(String MONTH) {
        this.MONTH = MONTH;
    }
}
