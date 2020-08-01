/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.Scanner;

/**
 *
 * @author ARUMUGASAMY
 */
class volume
{
    double length;
    double breadth;
    double width;
}
public class container {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        volume objt=new volume();
        System.out.println("enter length breadth width");
        objt.length=obj.nextInt();
        objt.breadth=obj.nextInt();
        objt.width=obj.nextInt();
        System.out.println("the volume is"+(objt.length*objt.breadth*objt.width));
        
        
        
        
        
                
    }
    
}
