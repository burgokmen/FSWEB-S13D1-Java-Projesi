public class Main {
    public static void main(String[] args) {

        shouldWakeUp (true, 1);

        shouldWakeUp (false, 2);

        shouldWakeUp (true, 8);

        shouldWakeUp (true, -1);

        System.out.println("---------------------Teen");

        hasTeen(9, 99, 19);

        hasTeen(23, 15, 42);

        hasTeen(22, 23, 34);

        System.out.println("--------------------- Cat time");
        isCatPlaying(true, 10);

        isCatPlaying(false, 36);

        isCatPlaying(false, 35);
    }

    public static boolean shouldWakeUp(boolean args, int num1){
        boolean ret = false;

        if(num1 < 0 || num1 > 23 ){
            System.out.println("Boyle bi Saat yok");


        } else if(num1 < 8 || num1 > 19 ) {

            if(args){
                ret = true;
                System.out.println("Uyandin");
            }else{

                System.out.println("Uyanmadin");

            }

        } else {
            System.out.println("Uyumuyosunki");

        }
        System.out.println(ret);
        return ret;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        boolean ret = ((19 >= num1) && (num1 >= 13)) || ((19 >= num2) && (num2 >= 13)) || ((19 >= num3) && (num3 >= 13));
        System.out.println(ret);
        return ret;
    }

    public static boolean isCatPlaying(boolean isSummer, int Cel){
        boolean ret = false;
        if(isSummer){
            if (Cel < 46 && Cel > 25){
                ret = true;
                System.out.println(ret + "Cat Playing");
            }else{
                System.out.println(ret + "Not playing");
            }
        } else{
            if (Cel < 36 && Cel > 25){
                ret = true;
                System.out.println(ret + "Cat Playing");
            }else{
                System.out.println(ret + "Not playing");
            }
        }
        return ret;
    }

}