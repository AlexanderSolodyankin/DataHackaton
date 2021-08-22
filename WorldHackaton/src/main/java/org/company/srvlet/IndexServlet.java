package org.company.srvlet;

import org.company.model.Human;
import org.company.model.Summary;
import org.company.model.Vacancies;
import org.company.service.UserListSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@WebServlet("/start")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        Random ran = new Random();
        List<Summary> summaries = new ArrayList<>();
        List<Vacancies> vacancies = new ArrayList<>();
        String out = "<h1> Случайная генерация вакансий и резюме!!! </h1>";
        PrintWriter print = resp.getWriter();

        for (int k = 0; k < ran.nextInt(100 - 10 + 1) + 10; k++) {

            out = out + "<tb>";

            for (int i = 0; i < ran.nextInt(5); i++) {


                summaries.add(new Summary(new Date(System.currentTimeMillis() - ran.nextInt(1000000)),
                        UserListSet.getMan(), ran.nextBoolean()));

            }
            for (int i = 0; i < ran.nextInt(5); i++) {
                vacancies.add(new Vacancies(new Date(System.currentTimeMillis() - ran.nextInt(1000000)),
                        "Требуется работник на позицию: " + UserListSet.getMan().getProfession(),
                        ran.nextBoolean(), UserListSet.getCompany()));
            }
        }
        
        for (int i = 0; i < summaries.size(); i++) {
            for (int j = 0; j < vacancies.size(); j++) {
                if(vacancies.get(j).getWorkplaces().equals(summaries.get(i).getMan().getProfession())){
                    vacancies.remove(j);
                    summaries.remove(i);
                }
            }

        }
        out = out + summaries + vacancies;

        out = out + "<br> <h2> Спрос на рынке вакансий: " + vacancies.size() + " на количество резюме: " + summaries.size();

        print.println(out);




    }
}
