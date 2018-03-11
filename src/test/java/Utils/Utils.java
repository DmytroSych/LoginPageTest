package Utils;

import java.util.Random;

public class Utils {
    static class Random{
        public static String getRandimEmail(){
            return System.currentTimeMillis()+"@mail.ru";
        }
    }
}
