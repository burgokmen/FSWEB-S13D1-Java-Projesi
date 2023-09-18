public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        shouldWakeUp(true, 7);
        shouldWakeUp(false, 7);
        shouldWakeUp(true, 12);

        shouldWakeUp(false, 12);
    }

    public static boolean shouldWakeUp(boolean args, int num1){
        boolean ret = false;

        if(num1 < 0 || num1 > 23 ){
            System.out.println("Boyle bi Saat yok" + ret);


        } else if(num1 < 8 || num1 > 19 ) {

            if(args){
                ret = true;
                System.out.println("Uyandin" + ret);
            }else{
                ret = false;
                System.out.println("Uyanmadin" + ret);

            }

        } else {
            System.out.println("Uyumuyosunki" + ret);

        }
        return ret;
    }
}