/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.Date;

/**
 *
 * @author Ronnie Payne
 */
public final class Contact 
{
    private String Id;
    private String LastName;
    private String FirstName;
    private String LocationId;
    private String AccountId;
    private String CreatedBy;
    private Date CreatedDate;
    private Date LastModifiedDate;
    private String LastModifiedBy;
    
    public Contact(){}
    public Contact(String last_name, String first_name)
    {
        if(!last_name.isEmpty())
        {
            this.LastName(last_name);
            if(!first_name.isEmpty())
            {
                this.FirstName(first_name);
            }
            this.Id(RandomGen.createId());
        }
    }
    private void FirstName(String value)
    {
        if(!value.isEmpty())
        {
            this.FirstName = value;
        }
    }
    private void LastName(String value)
    {
        if(!value.isEmpty())
        {
            this.LastName = value;
        }
    }
    private void Id(String value)
    {
        if(!value.isEmpty())
        {
            this.Id = value;
        }
    }
    
    public String FirstName(){ return this.FirstName; }
    public String LastName(){ return this.LastName; }
    public String Id(){ return this.Id;}
    public String CreatedBy(){ return this.CreatedBy; }
    public Date CreatedDate(){ return this.CreatedDate; }
    public Date LastModifiedDate(){ return this.LastModifiedDate; }
    public String AccountId(){return this.AccountId; }
    public String LocationId(){ return this.LocationId; }
    public String LastModifiedBy(){return this.LastModifiedBy; }
    
}
