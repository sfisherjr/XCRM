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
public final class TextArea {
    
    int height = 1;
    int width = 1;
    int visibleRows = 3;
    int maxLength = 121076;
    
    public TextArea(){}
    public TextArea(int height, int width)
    {
        try
        {
            this.Height(height);
            this.Width(width);
        }
        catch(Exception ex)
        {
           System.out.print("Error: " + ex.getMessage() + "\nTrace: " + Arrays.toString(ex.getStackTrace()));
        }
        
    }
    public TextArea(int height, int width, int rows)
    {
        try
        {
            this.Height(height);
            this.Width(width);
            this.VisibleRows(rows);
        }
        catch(Exception ex)
        {
           System.out.print("Error: " + ex.getMessage() + "\nTrace: " + Arrays.toString(ex.getStackTrace()));
        }
    }
    public TextArea(int height, int width, int rows, int max)
    {
        try
        {
            this.Height(height);
            this.Width(width);
            this.VisibleRows(rows);
            this.MaxLength(max);
        }
        catch(Exception ex)
        {
            System.out.print("Error: " + ex.getMessage() + "\nTrace: " + Arrays.toString(ex.getStackTrace()));
        }
    }
    
    public int MaxLength(){ return this.maxLength; }
    public int Height(){ return this.height; }
    public int Width(){ return this.width; }
    public int VisibleRows(){ return this.visibleRows; }
    
    private void MaxLength(int value)throws Exception
    {
        if(value > 0 && value <= 121076)
        {
            this.maxLength = value;
        }
        else
        {
            throw new Exception("Value for maximum length of a Text Area must be between 1 and 121076");
        }
    }
    private void VisibleRows(int value) throws Exception
    {
        if(value > 0)
        {
            this.visibleRows = value;
        }
        else
        {
            throw new Exception("Value for Visible rows for a Text Area must be at least 1");
        }
    }
    private void Width(int value) throws Exception
    {
        if(value >= 1)
        {
            this.width = value;
        }
        else
        {
            throw new Exception("Value for the width of a TextArea must be at least 1");
        }
    }
    private void Height(int value) throws Exception
    {
        if(value >= 1)
        {
            this.height = value;
        }
        else
        {
            throw new Exception("Value for height of a TextArea must be at least 1");
        }
    }
    
}
