package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        HolidayService service = new HolidayService();
        int income = 100_00;
        int expenses = 3000;
        int amount = 20_000;
        int month = service.calculate(income, expenses, amount);
        System.out.println(month);
    }
}
