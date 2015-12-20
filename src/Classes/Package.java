/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Ronnie Payne
 */
public final class Package 
{
    private String Id;
    private String Name;
    public String Destination;
    private Date CreatedDate;
    private Date LastModifiedDate;
    private String LastModifiedBy;
    private Account Account;
    
    public Package(String dest, Account acct)
    {
        if(!dest.isEmpty() && !acct.Id().isEmpty())
        {
            try
            {
                this.Id(RandomGen.createId());
            }
            catch(Exception ex)
            {
               System.out.print("\nException: " + ex.getMessage() + "\nStack: " + Arrays.toString(ex.getStackTrace()) + "\nTrying Again\n");
               this.Id(RandomGen.createId());
            }
            this.Account(acct);
            this.Destination(dest);
            this.Name(acct.Name().substring(0, acct.Name().length() - 1) + String.valueOf(Math.round(RandomGen.getRandomValue(0, 2156))));
        }
    }
    
    private void Destination(String value)
    {
        if(!value.isEmpty())
        {
            this.Destination = value;
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
    }
    private void CreatedDate(Date value)
    {
        if(!value.toString().isEmpty())
        {
            this.CreatedDate = value;
        }
    }
    private void LastModifiedDate(Date value)
    {
        if(!value.toString().isEmpty())
        {
            this.LastModifiedDate = value;
        }
    }
    private void LastModifiedBy(String value)
    {
        if(!value.isEmpty())
        {
            this.LastModifiedBy = value;
        }
    }
    private void Account(Account value)
    {
        if(!value.Id().isEmpty() && !value.Name().isEmpty())
        {
            this.Account = value;
        }
    }
    
    public String Destination(){ return this.Destination; }
    public String Name(){ return this.Name; }
    public String Id(){ return this.Id; }
    public Date CreatedDate(){ return this.CreatedDate; }
    public Date LastModifiedDate(){ return this.LastModifiedDate; }
    public String LastModifiedBy(){ return this.LastModifiedBy; }
    public Account Account(){ return this.Account; }
    
    
}
