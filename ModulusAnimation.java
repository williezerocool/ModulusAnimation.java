/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulusanimation;

/**
 *
 * @author kendrabooker
 */
public class ModulusAnimation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for ( int i=0; i<80; i++ ){
            
            if ( i%10 == 0 ){
                
                System.out.print(" Mr. Mitchell is cool. \r");

            }else if (i%3 == 0){
               
                System.out.println("***");
                System.out.println(" ***");
                System.out.println("  ***");
                System.out.println("   ***");
            }else if (i%4 == 0){
            
                System.out.println("   ***");
                System.out.println("  ***");
                System.out.println(" ***");
                System.out.println("***");
            }else if (i%5 == 0){
            
                System.out.println("   ^^^");
                System.out.println("  ^^^");
                System.out.println(" ^^^");
                System.out.println("^^^");
            }else if (i%6 == 0){
               
                System.out.println("###");
                System.out.println(" ###");
                System.out.println("  ###");
                System.out.println("   ###");
            }else if (i%7 == 0){
            
                System.out.println("   @@@");
                System.out.println("  @@@");
                System.out.println(" @@@");
                System.out.println("@@@");
            }else if (i%8 == 0){
            
                System.out.println("   !!!");
                System.out.println("  !!!");
                System.out.println(" !!!");
                System.out.println("!!!");
            }else if (i%12 == 0){
            
                System.out.println("   @@@");
                System.out.println("  @@@");
                System.out.println(" @@@");
                System.out.println("@@@");
            }else if (i%11 == 0){
            
                System.out.println("   !!!");
                System.out.println("  !!!");
                System.out.println(" !!!");
                System.out.println("!!!");
            }
	
        
        }
    }
    
}
