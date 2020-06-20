package com.company;
public class Main {
    public static void main(String[] args) {


        int indexUnqCarArr = 0;
        boolean isuniq = true;
        String Data[] = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        String CarsRaw[] = new String[Data.length];
        double TotalC100 = 0;
        double TotalC200 = 0;
        double TotalC300 = 0;
        double TotalC400 = 0;
        for (String DataItem : Data) {
            for (String Car : CarsRaw) {
                if (Car == null) {
                    break;
                }
                String DataItemCar = getCar(DataItem);
                if (Car.equals( DataItemCar )) {
                    isuniq = false;
                }
            }
            if (isuniq) {
                CarsRaw[indexUnqCarArr] = getCar(DataItem);
                indexUnqCarArr += 1;
            }
            isuniq = true;
        }
        String UniqCarList[] = new String[indexUnqCarArr];
        for (int i = 0; i < UniqCarList.length; i++) {
            UniqCarList[i] = CarsRaw[i];
            System.out.println( UniqCarList[i] );
        }
        for  (String DataItem : Data) {
            switch (getCarType(DataItem)) {
                case "C100" : TotalC100 += getCarMileage(DataItem)/12.5 * 46.10;
                    break;
                case "C200" : TotalC200 +=  getCarMileage(DataItem)/12 * 48.90;
                    break;
                case "C300" : TotalC300 +=  getCarMileage(DataItem)/11.5 * 47.50;
                    break;
                case "C400" : TotalC400 +=  getCarMileage(DataItem)/20 * 48.90;
                    break;
                default:
                    System.out.println("Ошибка");
            }
        }
        System.out.println("Расход на С100: " + TotalC100);
        System.out.println("Расход на С200: " + TotalC200);
        System.out.println("Расход на С300: " + TotalC300);
        System.out.println("Расход на С400: " + TotalC400);
        System.out.println("Общий расход: " + (TotalC100+TotalC200+TotalC300+TotalC400));

        if (TotalC100 < TotalC200 && TotalC100 < TotalC300 && TotalC100 < TotalC400) {
            System.out.println( "Минимальная стоимость расходов на С100: " + TotalC100 );
        } else if (TotalC200 < TotalC100 && TotalC200 < TotalC300 && TotalC200 < TotalC400){
            System.out.println( "Минимальная стоимость расходов на С200: " + TotalC200 );
        } else if (TotalC300 < TotalC200 && TotalC300 < TotalC100 && TotalC300 < TotalC400){
            System.out.println( "Минимальная стоимость расходов на C300: " + TotalC300 );
        } else if (TotalC400 < TotalC300 && TotalC400 < TotalC200 && TotalC400 < TotalC300){
            System.out.println( "Минимальная стоимость расходов на С400: " + TotalC400 );
        }
        if (TotalC100 > TotalC200 && TotalC100 > TotalC300 && TotalC100 > TotalC400) {
            System.out.println( "Максимальная стоимость расходов на С100: " + TotalC100 );
        } else if (TotalC200 > TotalC100 && TotalC200 > TotalC300 && TotalC200 > TotalC400){
            System.out.println( "Максимальная стоимость расходов на С200: " + TotalC200 );
        } else if (TotalC300 > TotalC200 && TotalC300 > TotalC100 && TotalC300 > TotalC400){
            System.out.println( "Максимальная стоимость расходов на C300: " + TotalC300 );
        } else if (TotalC400 > TotalC300 && TotalC400 > TotalC200 && TotalC400 > TotalC300) {
            System.out.println( "Максимальная стоимость расходов на С400: " + TotalC400 );
        }
    }

    public static double getCarMileage(String DataItem) {
        return Double.parseDouble( DataItem.split( "-" )[1] );
    }
    public static String getCar(String DataItem) {
        return DataItem.split( "-" )[0];
    }
    public static String getCarType(String DataItem) {
        return DataItem.split( "_" )[0];
    }
}



/*Необходимо:
        общую стоимость расходов на ГСМ, так и расходы на каждый класс авто
        тип авто имеющий наибольшую стоимость расходов
        тип авто имеющий наименьшую стоимость расходов
        реализовать функции которые в разрезе каждого типа авто выводят информацию о каждом авто (тип, номер, пробег, доп. параметр), с сортировкой по пробегу и доп параметру.
*/