package ru.netology.services;


public class HolidayService {
    public int calculate(int income, int expenses, int amount) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // количество денег на счету-
        for (int month = 0; month < 12; month++) {
            if (threshold >= amount) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = ((threshold - expenses)) / 3;
            } else {
                threshold = threshold + income - expenses;
            }
        }
        return count;
    }
}
