public class Main {
    public static void main(String[] args) {
        //Task 1
        int sage = 346;
        byte mage = 127;
        short ice = 56;
        long gate = 34_322_988_788L;
        float tea = 3.654f;
        double conscious = 7.137;
        System.out.println("Task 1\nЗначение переменной sage с типом int равно " + sage );
        System.out.println("Значение переменной mage с типом byte равно " + mage);
        System.out.println("Значение переменной ice с типом short равно " + ice);
        System.out.println("Значение переменной gate с типом long равно " + gate);
        System.out.println("Значение переменной tea с типом float равно " + tea);
        System.out.println("Значение переменной conscious с типом double равно " + conscious);

        //Task 2
        float eternal = 27.12f;
        long utopia = 987_678_965_549L;
        double superiority = 2.786;
        short backlash = 569;
        int efficacy = -159;
        int incentive = 27897;
        byte pivotal = 67;
        System.out.println("\nTask 2\n" + eternal);
        System.out.println(utopia);
        System.out.println(superiority);
        System.out.println(backlash);
        System.out.println(efficacy);
        System.out.println(incentive);
        System.out.println(pivotal);

        //Task 3
        int studentsOfLudmila = 23;
        int studentsOfAnna = 27;
        int studentsOfEkaterina = 30;
        int totalSheets = 480;
        int sheetPerStudent = totalSheets / (studentsOfAnna + studentsOfLudmila + studentsOfEkaterina);
        System.out.println("\nTask 3\nНа каждого ученика рассчитано " + sheetPerStudent + " листов бумаги.\n");

        //Task 4
        int bottlesPerMinute = 16 / 2;
        int bottlesPerDay = bottlesPerMinute * (60 * 24);
        int bottlesPerThreeDays = bottlesPerMinute * (60 * 24 * 3);
        int bottlesPerMonth = bottlesPerMinute * (60 * 24 * 30);
        System.out.println("Task 4\nЗа день машина произвела " + bottlesPerDay + " штук бутылок.\n" +
                "За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок.\n" +
                "За месяц машина произвела " + bottlesPerMonth + " штук бутылок.\n");

        //Task 5
        int totalCans = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalClasses = totalCans / (whitePaintPerClass + brownPaintPerClass);
        int whitePaint = totalClasses * whitePaintPerClass;
        int brownPaint = totalClasses * brownPaintPerClass;
        System.out.println("Task 5\nВ школе, где " + totalClasses + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски.\n");

        //Task 6
        int bananaCount = 5;
        int bananaWeight = 80;
        double milkWeight = 200 * 1.05;
        int iceCreamSundaeCount = 2;
        int iceCreamSundaeWeight = 100;
        int eggsCount = 4;
        int eggsWeight = 70;
        double breakfastInGrams = (bananaCount * bananaWeight) + milkWeight +
                (iceCreamSundaeCount * iceCreamSundaeWeight) + (eggsCount * eggsWeight);
        double breakfastInKg = breakfastInGrams / 1000;
        System.out.println("Task 6\nВес завтрака в граммах - " + (int) breakfastInGrams + " грамм." +
                "\nВес завтрака в килограммах - " + breakfastInKg + " килограмма.");

        //Task 7
        int weightToLose = 7 * 1000;
        int lostWeightPerDayMin = 250;
        int lostWeightPerDayMax = 500;
        int lostWeightPerDayAvg = (lostWeightPerDayMax + lostWeightPerDayMin) / 2;
        int daysToLoseWeightMax = weightToLose / lostWeightPerDayMin;
        int daysToLoseWeightMin = weightToLose / lostWeightPerDayMax;
        double daysToLoseWeightAvg = (double) weightToLose / lostWeightPerDayAvg;
        System.out.println("\nTask 7\nНеобходимо дней для похудения при минимальной потере веса - "
                + daysToLoseWeightMax + "\nНеобходимо дней для похудения при максимальной потере веса - "
                + daysToLoseWeightMin + "\nНеобходимо дней для похудения при средней потере веса - "
                + (int) Math.ceil(daysToLoseWeightAvg));

        //Task 8
        int mashaIncome = 67_760;
        int denisIncome = 83_690;
        int krisIncome = 72_230;
        double mashaIncomeNew = mashaIncome * 1.1;
        double denisIncomeNew = denisIncome * 1.1;
        double krisIncomeNew = krisIncome * 1.1;
        int mashaAnnualIncome = mashaIncome * 12;
        int denisAnnualIncome = denisIncome * 12;
        int krisAnnualIncome = krisIncome * 12;
        double mashaAnnualIncomeNew = mashaIncomeNew * 12;
        double denisAnnualIncomeNew = denisIncomeNew * 12;
        double krisAnnualIncomeNew = krisIncomeNew * 12;
        double mashaAnnualIncomeDif = mashaAnnualIncomeNew - mashaAnnualIncome;
        double denisAnnualIncomeDif = denisAnnualIncomeNew - denisAnnualIncome;
        double krisAnnualIncomeDif = krisAnnualIncomeNew - krisAnnualIncome;
        System.out.println("\nTask 8\nМаша теперь получает " + (int) mashaIncomeNew + " рублей. Годовой доход вырос на " +
                (int) mashaAnnualIncomeDif + " рублей.\n" + "Денис теперь получает " + (int) denisIncomeNew
                + " рублей. Годовой доход вырос на " + (int) denisAnnualIncomeDif + " рублей.\n" + "Кристина теперь получает "
                + (int) krisIncomeNew + " рублей. Годовой доход вырос на " + (int) krisAnnualIncomeDif + " рублей.");
    }
}