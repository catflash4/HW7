public class Main {
    public static void main(String[] args) {
        //Задача 1

        int total = 0;
        int savings = 15000;
        int month = 0;
        while (total < 2459000) {
            total += savings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 2

        int a = 0;
        while (a != 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //Задача 3
        System.out.println();
        int population = 12000000;
        int birth = 17;
        int death = 8;
        int perPeople = 1000;
        int birthPerYear;
        int deathPerYear;
        int year = 0;
        while (year != 10) {
            birthPerYear = birth * (population/perPeople);
            deathPerYear = death * (population/perPeople);
            population += (birthPerYear - deathPerYear);
            year++;
            System.out.println("Год " + year + ", численность населения " + population);
        }

        //Задача 4

        int contribution = 15000;
        double totalF = 0;
        int monthF = 0;
        double percentage = 0.07;
        do {
            totalF = totalF + contribution;
            totalF = totalF + (totalF*percentage);
            monthF++;
            System.out.println("Сумма накоплений за " + monthF + " месяц равна " + (int)totalF);
        } while (totalF <= 12000000 );
        //Задача 5
        double totalSec = 0;
        int monthSec = 0;
        do {
            totalSec = totalSec + contribution;
            totalSec = totalSec + (totalSec*percentage);
            monthSec++;
            if (monthSec % 6 == 0) {
                System.out.println("Сумма накоплений за " + monthSec + " месяц равна " + (int)totalSec);
            }
        } while (totalSec <= 12000000 );

        //Задача 6
        System.out.println();

        int months = 9*12;
        int monthT = 0;
        double totalT = 0;
        do {
            totalT = totalT + contribution;
            totalT = totalT + (totalT*percentage);
            monthT++;
            if (monthT % 6 == 0) {
                System.out.println("Сумма накоплений за " + monthT + " месяц равна " + (int)totalT);
            }
        } while (monthT < months);

        //Задача 7

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
            friday += 7;
        }
        //Задача 8
        int yearBefore = 1818;
        int yearAfter = 2025 + 100;
        for (int yearComet = yearBefore; yearComet <= yearAfter; yearComet++) {
            if (yearComet % 79 == 0) {
                System.out.println(yearComet);
            }
        }
    }
}