package Classes;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ronnie Payne
 */
public class TestObjects 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        checkDuplicateAccounts();
        checkDuplicatePackages();
    }
    
    /*
        Creates 240 Package objects to determine if the unique Id generation is in fact unique    
    */
    public static void checkDuplicatePackages()
    {
         List<String> pkgIds = new ArrayList<>();
        // Test The Account Object to ensure that it is creating without error and without duplicates 
        for(int i = 0; i < 250; i++)
        {
            Package pkg = new Package("Somewhere", new Account("Fake Account"));
        
            pkgIds.add(pkg.Id());
            
            System.out.print("\nPackage: " + pkg.Id());
            System.out.print("\nPackage Name: " + pkg.Name());
            System.out.print("\nDestination: " + pkg.Destination());
        }
        System.out.print("\nSearching for Duplicates");
        System.out.print("\npkgIds size: " + pkgIds.size());
        // loop through list and return if duplicate found
        
        Integer count = 0;
        for(Integer i = 0; i < pkgIds.size(); i++)
        {
            count = 0;
            for(Integer a = 1; a < pkgIds.size(); a++)
            {
                if(pkgIds.get(i).equals(pkgIds.get(a)))
                {
                    ++count;
                    if(count == 2)
                    {
                        System.out.print("\nDuplicate found at index: " 
                                        + a 
                                        + "\nId Value at index [i]: " 
                                        + pkgIds.get(i) 
                                        + "\nId Value at index[a]: " 
                                        + pkgIds.get(a));
                    }
                }                               
            }            
        }
        if(count == 1)
        {
            System.out.print("\nNo Duplicates found!");
        }
        System.out.print("\npkgIds size: " + pkgIds.size());
        System.out.print("\n");
    }
    /*
        Creates 240 Account objects to determine if the unique Id generation is in fact unique    
    */
    public static void checkDuplicateAccounts()
    {
         List<String> accIds = new ArrayList<>();
        // Test The Account Object to ensure that it is creating without error and without duplicates 
        for(int i = 0; i < 250; i++)
        {
            Account acc = new Account("Test Account Name");
        
            accIds.add(acc.Id());
            
            System.out.print("Account: " + acc.Id());
            System.out.print("\n");
            System.out.print("Account Name: " + acc.Name());
            System.out.print("\n");
        }
        System.out.print("\nSearching for Duplicates");
        System.out.print("\nAccIds size: " + accIds.size());
        // loop through list and return if duplicate found
        
        Integer count = 0;
        for(Integer i = 0; i < accIds.size(); i++)
        {
            count = 0;
            for(Integer a = 1; a < accIds.size(); a++)
            {
                if(accIds.get(i).equals(accIds.get(a)))
                {
                    ++count;
                    if(count == 2)
                    {
                        System.out.print("\nDuplicate found at index: " 
                                        + a 
                                        + "\nId Value at index [i]: " 
                                        + accIds.get(i) 
                                        + "\nId Value at index[a]: " 
                                        + accIds.get(a));
                    }
                }                               
            }            
        }
        if(count == 1)
        {
            System.out.print("\nNo Duplicates found!");
        }
        System.out.print("\nAccIds size: " + accIds.size());
        System.out.print("\n");
    }
}

