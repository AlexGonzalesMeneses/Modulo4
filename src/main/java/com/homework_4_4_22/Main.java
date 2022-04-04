package com.homework_4_4_22;

import com.homework_4_4_22.helpers.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
        WeekDays weekDays = new WeekDays(days);
        Logger.log(weekDays.buildReport());
    }
}
