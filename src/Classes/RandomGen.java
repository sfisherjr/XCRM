/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author Ronnie Payne
 */
public final class RandomGen {
    
    
    public RandomGen(){}
    
    public static String createId()
    {
        String temp = "";
        Integer randomVal;        
        
        char[] alpha = {'a', 'A', 'b','B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G',
                        'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N',
                        'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U',
                        'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z', '0', '1', '2', '3',
                        '4', '5', '6', '7', '8', '9'};
        
        
        for(int i = 0; i < 18; i++)
        {
            randomVal = Integer.valueOf(String.valueOf(Math.round(RandomGen.getRandomValue(0, alpha.length - 1))));
            temp += alpha[randomVal];
           
        }
        return temp;
    }
     
    public static double getRandomValue(Integer minVal, Integer maxVal)
    {
        double newVal =  Math.random() * 100;
        while(newVal > maxVal || newVal < minVal)
        {
            newVal = Math.random() * 100;
        }
        return newVal;
    }
    
}
