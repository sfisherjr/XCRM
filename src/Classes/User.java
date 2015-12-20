
package Classes;

/**
 *
 * @author Ronnie Payne
 */
public final class User {
    
    String Name;
    String Id;
    String FirstName;
    String LastName;
    Account Account;
    String AccountId;
    
    public User(String first, String last)
    {        
        this.FirstName(first);
        this.LastName(last);
        this.Id(RandomGen.createId());
        this.Name(this.FirstName(), this.LastName());
    }
    
    public User(String first, String last, String acctId)
    {
        this.FirstName(first);
        this.LastName(last);
        this.AccountId(acctId);
        this.Id(RandomGen.createId());
        this.Name(this.FirstName(), this.LastName());
    }
    
    
    private void Id(String value)
    {
        if(!value.isEmpty())
        {
            this.Id = value.trim();
        }
    }
    private void FirstName(String value)
    {
        if(!value.isEmpty())
        {
            this.FirstName = value.trim();
        }
    }
    private void LastName(String value)
    {
        if(!value.isEmpty())
        {
            this.LastName = value.trim();
        }
    }
    private void AccountId(String value)
    {
        if(!value.isEmpty())
        {
            this.AccountId = value.trim();
        }
    }
    
    private void Name(String first, String last)
    {
        if(!first.isEmpty() && !last.isEmpty())
        {
            this.Name = first.trim() + ' ' + last.trim();
        }
    }
    public String Id(){ return this.Id; }
    public String LastName(){ return this.LastName; }
    public String FirstName(){ return this.FirstName; }
    public String AccountId(){ return this.AccountId; }
    public String Name(){ return this.Name; }
   
}
