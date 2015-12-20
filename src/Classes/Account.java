/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.sql.Date;
import java.util.Arrays;


/**
 *
 * @author Ronnie Payne
 */
public final class Account 
{
    
    private String Id;
    private String Name;
    private Date CreatedDate;
    private String CreatedBy;
    private Date LastModifiedDate;
    private String ModifedBy;
    
    // returned from database Account values
    public Account(String name, String id)
    {
        if(!id.isEmpty())
        {            
            this.Id(id);
            if(!name.isEmpty())
            {
                this.Name(name);
            }
        }
    }
    
    // new Instance before inserting into database
    public Account(String name)
    {        
        
        if(!name.isEmpty())
        {
            this.Name(name);
            try
            {
                this.Id(RandomGen.createId());
            }
            catch(Exception ex)
            {
               System.out.print("\nException: " + ex.getMessage() + "\nStack: " + Arrays.toString(ex.getStackTrace()) + "\nTrying Again\n");
               this.Id(RandomGen.createId());
            }
            
            
        }
    }
    private void Id(String value)
    {
        if(!value.isEmpty())
        {
            this.Id = value;
        }
    }
    private void Name(String value)
    {
        if(!value.isEmpty())
        {
            this.Name = value;
        }
        try
        {
            this.Id(RandomGen.createId());
        }
        catch(Exception ex)
        {
           System.out.print("\nException: " + ex.getMessage() + "\nStack: " + Arrays.toString(ex.getStackTrace()) + "\nTrying Again\n");
           this.Id(RandomGen.createId()); 
        }
    }
    public String Id(){ return this.Id;}
    public String Name() {return this.Name;}
    public Date CreatedDate(){return this.CreatedDate;}
    public String CreatedBy(){return this.CreatedBy;}
    public Date LastModifiedDate(){return this.LastModifiedDate;}
    public String ModifiedBy(){return this.ModifedBy;}
       
}

