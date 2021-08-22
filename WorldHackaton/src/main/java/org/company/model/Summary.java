package org.company.model;

import java.util.Date;

public class Summary {
    private Date dateRegister;
    private Human man;
    private Boolean status;

    public Summary() {
    }

    public Summary(Date dateRegister, Human man, Boolean status) {
        this.dateRegister = dateRegister;
        this.man = man;
        this.status = status;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Human getMan() {
        return man;
    }

    public void setMan(Human man) {
        this.man = man;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "dateRegister=" + dateRegister +
                ", man=" + man +
                ", status=" + status +
                '}';
    }
}

