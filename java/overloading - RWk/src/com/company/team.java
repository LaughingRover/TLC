package com.company;

public class team extends sports {

    @Override
    String getName() {
        return "them";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }

}
