package org.company.model;

import java.util.List;

public class SiteWorks {
    private List<Summary> summaries;
    private List<Vacancies> vacancies;

    public SiteWorks() {
    }

    public SiteWorks(List<Summary> summaries, List<Vacancies> vacancies) {
        this.summaries = summaries;
        this.vacancies = vacancies;
    }

    public List<Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<Summary> summaries) {
        this.summaries = summaries;
    }

    public List<Vacancies> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancies> vacancies) {
        this.vacancies = vacancies;
    }

    @Override
    public String toString() {
        return "SiteWorks{" +
                "summaries=" + summaries +
                ", vacancies=" + vacancies +
                '}';
    }
}
