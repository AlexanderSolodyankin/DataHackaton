package org.company.model;

import java.util.Date;

public class Vacancies {
    private Date dataPublic;
    private String workplaces;
    private Boolean status;
    private Company company;

    public Vacancies() {
    }

    public Vacancies(Date dataPublic, String workplaces, Boolean status, Company company) {
        this.dataPublic = dataPublic;
        this.workplaces = workplaces;
        this.status = status;
        this.company = company;
    }

    public Date getDataPublic() {
        return dataPublic;
    }

    public void setDataPublic(Date dataPublic) {
        this.dataPublic = dataPublic;
    }

    public String getWorkplaces() {
        return workplaces;
    }

    public void setWorkplaces(String workplaces) {
        this.workplaces = workplaces;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Vacancies{" +
                "dataPublic=" + dataPublic +
                ", workplaces='" + workplaces + '\'' +
                ", status=" + status +
                ", company=" + company +
                '}';
    }
}
