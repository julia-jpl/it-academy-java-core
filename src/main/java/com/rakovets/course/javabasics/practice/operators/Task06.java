package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для банка:
 * которая будет высчитывать сумму на депозитном счете, для пятилетнего плана, без возможности снятия денег,
 * если известно
 *
 * @param deposit          - первоначальная сумма на счете
 * @param annualPercentage - ежегодный простой процент, т.е. ежегодный процент высчитывается от первоначальной суммы
 */
public class Task06 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int deposit = 1501;
        int annualPercentage = 7;

        // Код необходимый для тестирования, не изменять
        deposit = (args.length == 0) ? deposit : Integer.parseInt(args[0]);
        annualPercentage = (args.length == 0) ? annualPercentage : Integer.parseInt(args[1]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
                double annualPercentageSum = (double)deposit*annualPercentage/100;
                double totalPercentageSum = annualPercentageSum*5;
        double totalSum = (double)deposit+totalPercentageSum;
        System.out.println(totalSum);
    }
}
