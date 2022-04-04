package com.homework_4_4_22;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class WeekDaysNgTest {
    @Test
    public void buildReportWhenDaysNotSettedTest() {
        List<String> days = new ArrayList<>();
        WeekDays weekDays = new WeekDays(days);

        Assert.assertEquals(weekDays.buildReport(), "****************\n" +
                "Inicia Semana\n" +
                "\n" +
                "Termina Semana\n" +
                "****************");
    }

    @Test
    public void buildReportWhenDaysSettedTest() {
        List<String> days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
        WeekDays weekDays = new WeekDays(days);

        Assert.assertEquals(weekDays.buildReport(), "****************\n" +
                "Inicia Semana\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Lunes\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Martes\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Miercoles\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Jueves\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Viernes\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Sabado\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "---------------\n" +
                "Empieza el\n" +
                "Dia: Domingo\n" +
                "Termina el dia\n" +
                "---------------\n" +
                "\n" +
                "Termina Semana\n" +
                "****************");
    }
}