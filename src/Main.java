public class Main {
    public static void main(String[] args) {

        shouldWakeUp (true, 1);

        shouldWakeUp (false, 2);

        shouldWakeUp (true, 8);

        shouldWakeUp (true, -1);

        System.out.println("---------------------");

        hasTeen(9, 99, 19);

        hasTeen(23, 15, 42);

        hasTeen(22, 23, 34);
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


}