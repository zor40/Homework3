//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int a = 50000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 120;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 30000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 200000L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 8.5F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 15.500;
        System.out.println("Значение переменной f с типом double равно " + f);
        float g = 27.12F;
        System.out.println(g);
        long h = 987678965549L;
        System.out.println(h);
        double i = 2.786;
        System.out.println(i);
        short j = 569;
        System.out.println(j);
        short k = -159;
        System.out.println(k);
        int l = 27897;
        System.out.println(l);
        byte m = 67;
        System.out.println(m);
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int totalStudents = teacher1 + teacher2 + teacher3;
        short totalPapers = 480;
        int papersStudent = totalPapers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersStudent + " листов бумаги");
        int twoMinute = 16;
        System.out.println("За 2 минуты машина произвела " + twoMinute + " штук бутылок");
        int oneMinute = twoMinute / 2;
        System.out.println("За 1 минуту машина произвела " + oneMinute + " штук бутылок");
        int twentyMinutes = oneMinute * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int minutesDay = 24 * 60;
        System.out.println("В сутках " + minutesDay + " минут");
        int day = minutesDay * oneMinute;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDays = day * 3;
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        int dayMonth = 30;
        System.out.println("В месяце " + dayMonth + " дней");
        int month = day * dayMonth;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
        byte cansPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = cansPaint / (whitePaint + brownPaint);
        int cansWhite = whitePaint * totalClasses;
        int cansBrown = brownPaint * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + cansWhite + " банок белой краски и " + cansBrown + " банок коричневой краски");
        int bananas = 5 * 80;
        int milk =  2 * 105;
        int iseCream = 2 * 100;
        int eggs = 4 * 70;
        int breakfastWeight = bananas + milk + iseCream + eggs;
        System.out.println("Вес завтрака в граммах " + breakfastWeight);
        float breakfastWeightKg = breakfastWeight / 1000F;
        System.out.println("Вес завтрака " + breakfastWeightKg + " кг");
        int totalWeight = 7;
        int lossWeight1 = 250;
        int lossWeight2 = 500;
        int daysLoss1 = (totalWeight * 1000) / lossWeight1;
        System.out.println("Если сбрасывать по " + lossWeight1 + " грамм, то уйдёт " + daysLoss1 + " дней ");
        int daysLoss2 = (totalWeight * 1000) / lossWeight2;
        System.out.println("Если сбрасывать по " + lossWeight2 + " грамм, то уйдёт " + daysLoss2 + " дней ");
        int averageLoss = (daysLoss1 + daysLoss2) / 2;
        System.out.println("В среднем для похудения потребуется " + averageLoss + " день ");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaPromotion = mashaSalary + (mashaSalary / 100 * 10);
        System.out.println("Маша теперь получает " + mashaPromotion + " рублей");
        int denisPromotion = denisSalary + (denisSalary / 100 * 10);
        System.out.println("Денис теперь получает " + denisPromotion + " рублей");
        int kristinaPromotion = kristinaSalary + (kristinaSalary / 100 * 10);
        System.out.println("Кристина теперь получает " + kristinaPromotion + " рублей");
        int mashaYear = mashaSalary * 12;
        System.out.println("Годовой доход Маши до повышения " + mashaYear + " рублей");
        int denisYear = denisSalary * 12;
        System.out.println("Годовой доход Дениса до повышения " + denisYear + " рублей");
        int kristinaYear = kristinaSalary * 12;
        System.out.println("Годовой доход Кристины до повышения " + kristinaYear + " рублей");
        int mashaPromotionYear = mashaPromotion * 12;
        System.out.println("Годовой доход Маши после повышения " + mashaPromotionYear + " рублей");
        int denisPromotionYear = denisPromotion * 12;
        System.out.println("Годовой доход Дениса после повышения " + denisPromotionYear + " рублей");
        int kristinaPromotionYear = kristinaPromotion * 12;
        System.out.println("Годовой доход Кристины после повышения " + kristinaPromotionYear + " рублей");
        int incomeGrowthMasha = mashaPromotionYear - mashaYear;
        System.out.println("Годовой доход Маши вырос на " + incomeGrowthMasha + " рублей");
        int incomeGrowthDenis = denisPromotionYear - denisYear;
        System.out.println("Годовой доход Дениса вырос на " + incomeGrowthDenis + " рублей");
        int incomeGrowthKristina = kristinaPromotionYear - kristinaYear;
        System.out.println("Годовой доход Кристины вырос на " + incomeGrowthKristina + " рублей");



















































    }
}