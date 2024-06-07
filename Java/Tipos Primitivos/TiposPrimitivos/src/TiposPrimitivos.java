import java.util.Scanner;


public class TiposPrimitivos {

    
    public static void main(String[] args) {
        
      float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: "+ Float.MIN_VALUE);
        System.out.println("El valor maximo de float: "+ Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double: "+ Double.MIN_VALUE);
        System.out.println("El valor maximo de double: "+ Double.MAX_VALUE);
     
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("El valor minimo de Byte: "+ Byte.MIN_VALUE);
        System.out.println("El valor maximo de Byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("El valor minimo de Short: "+ Short.MIN_VALUE);
        System.out.println("El valor maximo de Short: "+ Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("El valor minimo de int: "+ Integer.MIN_VALUE);
        System.out.println("El valor maximo de int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 10 /*(9223372036854775807)*/;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("El valor minimo de Long: "+ Long.MIN_VALUE);
        System.out.println("El valor maximo de Long: "+ Long.MAX_VALUE);
        
     
    }
    
}
