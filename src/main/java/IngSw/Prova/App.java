package IngSw.Prova;

import java.util.Arrays;

import IngSw.Prova.MyUtilList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MyUtilList mul = new MyUtilList();
        
        System.out.println(mul.ordinaCrescente(Arrays.asList(15,3,64,2,12)));
        System.out.println(mul.ordinaDecrescente(Arrays.asList(15,3,64,2,12)));
    }
}
