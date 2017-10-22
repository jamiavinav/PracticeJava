package avinav.practice;

import java.util.Date;

public class Deal {

    private String dealType;
    private Date startDate;
    private Date endDate;
    private String dealValue;
    private String promoText;
    private String nightlyRate;
    public String getDealType() {
        return dealType;
    }
    public void setDealType(String dealType) {
        this.dealType = dealType;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getDealValue() {
        return dealValue;
    }
    public void setDealValue(String dealValue) {
        this.dealValue = dealValue;
    }
    public String getPromoText() {
        return promoText;
    }
    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }
    public String getNightlyRate() {
        return nightlyRate;
    }
    public void setNightlyRate(String nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
    
}
