public class Main {
    public static void main(String[] args) {
byte aplles = 1;
short oranges  = 2;
int pears = 3;
long bananas = 4L;
float plums = 3.88F;
double cherry = 1.234;
System.out.println("Значение переменной aplles c типом byte равно " +aplles);
System.out.println("Значение переменной oranges c типом short равно " +oranges);
System.out.println("Значение переменной pears c типом int равно " +pears);
System.out.println("Значение переменной bananas c типом long равно " +bananas);
System.out.println("Значение переменной plums c типом float равно " +plums);
System.out.println("Значение переменной cherry c типом double равно " +cherry);
        System.out.println();
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e =-159;
        short f = 27897;
        byte g = 67;
        short student_L_P = 23;
        short student_A_S = 27;
        short student_E_A = 30;
        short A4 = 480;
        int allStudent = (student_L_P + student_A_S + student_E_A);
        int leaf = A4/allStudent;
        System.out.println("На каждого ученика рассчитано "+ leaf +" листов бумаги");
        System.out.println();
        byte carBottleMin = 16/2;
        int bottle20 = carBottleMin *20;
        int bottleOneDay = carBottleMin * 60 *24;
        int bottleTreeDay = bottleOneDay * 3;
        int bottleOneMonth = bottleOneDay * 30;
        System.out.println("За 20 минут машина произвела " + bottle20  +" штук бутылок");
        System.out.println("За сутки машина произвела " + bottleOneDay  +" штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleTreeDay  +" штук бутылок");
        System.out.println("За месяц машина произвела " + bottleOneMonth  +" штук бутылок");
        System.out.println();
        byte allJar = 120;
        byte jarWhite = 2;
        byte jarBrown = 4;
        int allClass = allJar/(jarBrown+jarWhite);
        int allJarWhite = allClass*jarWhite;
        int allJarBrown = allClass*jarBrown;
        System.out.println("В школе, где " +allClass + " классов, нужно "+allJarWhite + " банок белой краски и "+allJarBrown+ " банок коричневой краски");
        System.out.println();
        int banana = 5*80;
        double milk = 200*1.05;
        int iceCream = 2*100;
        int egg = 4 *70;
        double brekfast = banana+milk+iceCream+egg;
        double brekfastKg = brekfast/1000;
        System.out.println(brekfastKg);
        System.out.println();
        int weightGr = 7*1000;
        int loseweigt1 = weightGr/250;
        System.out.println(loseweigt1);
        int loseweight2 = weightGr/500;
        System.out.println(loseweight2);
        int mean = (loseweigt1+ loseweight2)/2;
        System.out.println(mean);
        System.out.println();
        int payM = 67760;
        int payD = 83690;
        int payK = 76230;
        int factorM = 67760 / 10;
        int factorD = 83690 / 10;
        int factorK = 76230 / 10;
        int newPayM = payM+factorM;
        int newPayD = payD+factorD;
        int newPayK = payK+factorK;
        int payYearOldM = 67760*12;
        int payYearOldD = 83690*12;
        int payYearOldK = 76230*12;
        int factorYearM = newPayM*12;
        int factorYearD = newPayD*12;
        int factorYearK = newPayK*12;
        int differencePayM = factorYearM -payYearOldM;
        int differencePayD = factorYearD-payYearOldD;
        int differencePayK = factorYearK-payYearOldK;
        System.out.println("Маша теперь получает " +newPayM+ " рублей. " +
                "Годовой доход вырос на "+ differencePayM +" рублей");
        System.out.println("Денис теперь получает " +newPayD+ " рублей. " +
                "Годовой доход вырос на "+ differencePayD +" рублей");
        System.out.println("Кристина теперь получает " +newPayK+ " рублей. " +
                "Годовой доход вырос на "+ differencePayK +" рублей");



















    }
}