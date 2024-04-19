/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classification;

import java.util.Scanner;
/**
 *
 * @author AMM
 */
public class Classification0 {
     public Classification0() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        male mo = new male();
        female Fo = new female();
        System.out.print("choose between Female and Male \n1 : Male\n2 : Female\n");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                mo.display();
                break;
            case 2:
                Fo.display();
        }

    }
    
}
