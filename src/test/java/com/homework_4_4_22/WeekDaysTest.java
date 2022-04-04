package com.homework_4_4_22;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeekDaysTest {
    private static List<String> days;

    @BeforeAll
    static void setUp() {
        days = new ArrayList<>();
    }

    @Test
    void buildReportWhenDaysnotSetted() {
        WeekDays weekDays = new WeekDays(days);
        assertEquals("****************\n" +
                "Inicia Semana\n" +
                "\n" +
                "Termina Semana\n" +
                "****************", weekDays.buildReport());
    }

    @Test
    void buildReportWhenExistDays() {
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
        WeekDays weekDays = new WeekDays(days);
        assertEquals("****************\n" +
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
                "****************", weekDays.buildReport());
    }
}