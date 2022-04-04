package com.homework_4_4_22;

import java.util.List;

public class WeekDays {
    private List<String> days;

    public WeekDays(List<String> days) {
        this.days = days;
    }

    public String buildReport() {
        StringBuilder report = new StringBuilder();
        report.append("****************\nInicia Semana\n");

        //if (days != null) {
            for (String day : days) {
                report.append("---------------\nEmpieza el\nDia: " + day + "\nTermina el dia\n---------------\n");
            }
        //}

        report.append("\nTermina Semana\n****************");

        return report.toString();
    }
}
