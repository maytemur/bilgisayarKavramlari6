/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari6;

/**
 *
 * @author maytemur Java 23 video Fibonacci Dizilerle örnek çözüm 
 * 
 */
public class BilgisayarKavramlari6 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int fib[] = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 0; i < 8; i++) {
            fib[i + 2] = fib[i + 1] + fib[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(fib[i]);
        }
        
    }

}
