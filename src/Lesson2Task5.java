public class Lesson2Task5 {
    public static void main (String[] args){
        int timeInSeconds = 4505678;
        int seconds = timeInSeconds%60;
        int min = timeInSeconds/60;
        int minutes = min%60;
        int h = min/60;
        int hours = h%24;
        int d = h/24;
        int days = d%7;
        int weeks = d/7;
        System.out.println(weeks+" w "+days+" d "+hours+":"+minutes+":"+seconds);
    }
}
