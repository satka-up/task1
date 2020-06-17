package com.company;
public class Main {
    public static void main(String[] args) {
        double SumKmC100 = 0;
        double SumKmC200 = 0;
        double SumKmC300 = 0;
        double SumKmC400 = 0;
        String Arr[] =  {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        for(int i = 0; i < Arr.length; i++) {
            Arr[i] = Arr[i].replace( "_", "," ).replace( "-","," );
            String MyArr[] = Arr[i].split( "," );
            switch (MyArr[0]) {
                case "C100" : SumKmC100 += (Integer.parseInt(MyArr[2]))/12.5 * 46.10;
                    break;
                case "C200" : SumKmC200 +=  (Integer.parseInt(MyArr[2]))/12 * 48.90;
                    break;
                case "C300" : SumKmC300 +=  (Integer.parseInt(MyArr[2]))/11.5 * 47.50;
                    break;
                case "C400" : SumKmC400 +=  (Integer.parseInt(MyArr[2]))/20 * 48.90;
                    break;
            }
        }
        if (SumKmC100 < SumKmC200 && SumKmC100 < SumKmC300 && SumKmC100 < SumKmC400) {
            System.out.println( "Минимальная стоимость расходов на С100: " + SumKmC100 );
        } else if (SumKmC200 < SumKmC100 && SumKmC200 < SumKmC300 && SumKmC200 < SumKmC400){
            System.out.println( "Минимальная стоимость расходов на С200: " + SumKmC200 );
        } else if (SumKmC300 < SumKmC200 && SumKmC300 < SumKmC100 && SumKmC300 < SumKmC400){
            System.out.println( "Минимальная стоимость расходов на C300: " + SumKmC300 );
        } else if (SumKmC400 < SumKmC300 && SumKmC400 < SumKmC200 && SumKmC400 < SumKmC300){
            System.out.println( "Минимальная стоимость расходов на С400: " + SumKmC400 );
        }
        if (SumKmC100 > SumKmC200 && SumKmC100 > SumKmC300 && SumKmC100 > SumKmC400) {
            System.out.println( "Максимальная стоимость расходов на С100: " + SumKmC100 );
        } else if (SumKmC200 > SumKmC100 && SumKmC200 > SumKmC300 && SumKmC200 > SumKmC400){
            System.out.println( "Максимальная стоимость расходов на С200: " + SumKmC200 );
        } else if (SumKmC300 > SumKmC200 && SumKmC300 > SumKmC100 && SumKmC300 > SumKmC400){
            System.out.println( "Максимальная стоимость расходов на C300: " + SumKmC300 );
        } else if (SumKmC400 > SumKmC300 && SumKmC400 > SumKmC200 && SumKmC400 > SumKmC300) {
            System.out.println( "Максимальная стоимость расходов на С400: " + SumKmC400 );
        }
        System.out.println("Расход на С100: " + SumKmC100);
        System.out.println("Расход на С200: " + SumKmC200);
        System.out.println("Расход на С300: " + SumKmC300);
        System.out.println("Расход на С400: " + SumKmC400);
        System.out.println("Общий расход: " + (SumKmC100+SumKmC200+SumKmC300+SumKmC400));

    }

}




