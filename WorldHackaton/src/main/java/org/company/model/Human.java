package org.company.model;

public class Human {
    private String name;
    private Integer age;
    private String profession;
    private String education;

    public Human() {

    }

    public Human(String name, Integer age, String profession, String education) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
