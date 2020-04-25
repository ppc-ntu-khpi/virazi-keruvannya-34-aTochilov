package domain;
/**
 * Solves the given problem (counts mirrored hours on digital watch)
 * @author Andrei
 */
public class Exercise {
    
    private static byte reverse(byte number){
        byte lastDigit = (byte) (number%10);
        number = (byte) (number/10);
        byte revNum = (byte) (lastDigit*10 + number);
        return revNum;
    }
    /**
     * Finds and counts the number of mirrored hours
     * @return number of mirrored hours
     */
    public static byte Calculate(){
        byte count = 0;
        byte hours;
//        byte minutes; //uncomment this and following if you want mirrored hours to be displayed

        for(byte i = 0; i<24; i++){
                        hours = i;
            for(byte j = 0; j<60; j++){
//                            minutes= j;
                if(hours == reverse(j)){
//                System.out.println(hours + ":" + minutes);
                count++;
                }
            }
        }
        return count;
    }
}
