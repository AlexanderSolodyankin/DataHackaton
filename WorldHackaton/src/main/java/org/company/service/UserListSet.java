package org.company.service;

import org.company.model.Company;
import org.company.model.Human;
import org.company.model.Summary;
import org.company.model.Vacancies;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public interface UserListSet {
    Random ran = new Random();

    static List<Human> getListHuman(){
        List<Human> mans = new ArrayList<>();
        mans.add(new Human("Павел", 32, "Сварщик", "Юрист"));
        mans.add(new Human("Саша", 23, "Сварщик", "Техник"));
        mans.add(new Human("Владимир", 40, "Сварщик", "Экономист"));
        mans.add(new Human("Антон", 32, "Слесарь", "Учитель"));
        mans.add(new Human("Дмитрий", 18, "Сварщик", "Школьник"));
        mans.add(new Human("Алексей", 37, "Повар", "сварщик"));
        mans.add(new Human("Кирилл", 32, "Доктор", "Доктор"));
        mans.add(new Human("Степан", 32, "Педиатор", "Химик"));
        mans.add(new Human("Святослав", 32, "Водитель", "Учитель"));
        return mans;
    }



    static List<Company> getLIstCompany(){
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Парк", "досуг", "общество"));
        companies.add(new Company("кафе Айнур", "общепит", "общество"));
        companies.add(new Company("Автоваз", "Машины", "Инженерия"));
        companies.add(new Company("Район электро станция", "Электричество", "техника"));
        companies.add(new Company("Физприборы", "Станки", "Инженернерия"));
        companies.add(new Company("СТО", "Техническое обслуживание", "Техника"));
        return companies;
    }

    static String getSpecialist (){
        List<Human> man = getListHuman();
        return man.get(ran.nextInt(man.size())).getProfession();
    }
    static Human getMan(){
        return getListHuman().get(ran.nextInt(getListHuman().size()));
    }

    static Company getCompany(){
    return getLIstCompany().get(ran.nextInt(getLIstCompany().size()));
    }

    static Summary getSummary(){
        return new Summary
                (new Date(System.currentTimeMillis() + ran.nextInt(900000)), getMan(), ran.nextBoolean());
    }
    static Vacancies getVacansies(){

        return new Vacancies
                (new Date(System.currentTimeMillis() - ran.nextInt(900000)),
                        "нужен " + getMan().getProfession() ,
                        ran.nextBoolean(), getCompany());
    }


}
