package org.company;

import org.company.service.UserListSet;



public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println(UserListSet.getCompany());
            System.out.println(UserListSet.getMan());
        }

    }
}
