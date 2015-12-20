/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

import java.util.Arrays;

/**
 *
 * @author Ronnie Payne
 */
public final class TextBox {
    
    boolean multiline;
    int maxLength = 255;
    
    public TextBox(){}
    public TextBox(int maxLen)
    {
        try
        {
            this.MaxLength(maxLen);
        }
        catch(Exception ex)
        {
            System.out.print("Error: " + ex.getMessage() + "\nTrace: " + Arrays.toString(ex.getStackTrace()));
        }
    }
    public TextBox(boolean multi)
    {
        this.MultiLine(multi);
    }
    public TextBox(boolean multi, int maxLen)
    {
        try
        {
            this.MultiLine(multi);
            this.MaxLength(maxLen);
        }
        catch(Exception ex)
        {
            System.out.print("Error: " + ex.getMessage() + "\nTrace: " + Arrays.toString(ex.getStackTrace()));
                     
        }
        
    }
    
    private void MultiLine(boolean value)
    {
        this.multiline = value;
    }
    private void MaxLength(int value) throws Exception
    {
        if(value > 0 && value <= 255)
        {
            this.maxLength = value;
        }
        else
        {
            throw new Exception("Value of max Length must be between 1 and 255");
        }
    }
    public boolean MultiLine(){ return this.multiline; }
    public int MaxLength(){ return this.maxLength; }
}
