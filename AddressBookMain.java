import java.util.*;
public class AddressBookMain {
	
	ArrayList<Address> persons;
	Scanner sc= new Scanner(System.in);
	 
	
	      public AddressBookMain() 
	      {
	            persons = new ArrayList<Address>();
	      }
	      public void AddName()
	      {
	   	  String a,b,c,d,e,f,g,h;
	    	  
	    	  System.out.println("Enter your details");
	    	  a=sc.nextLine();
	    	  b=sc.nextLine();
	    	  c=sc.nextLine();
	    	  d=sc.nextLine();
	    	  e=sc.nextLine();
	    	  f=sc.nextLine();
	    	  g=sc.nextLine();
	    	  h=sc.nextLine();
	    	  Address ad= new Address(a,b,c,d,e,f,g,h);
	    	  persons.add(ad);
	    	  System.out.println("Added succesfully");
	    	  for (int i = 0; i < persons.size(); i++)
	    	  { 
	    		   System.out.print(persons.get(i).firstname + " "); 
	          } 
	      }
	      
	      public static void main(String[] args) {
	    	  AddressBookMain book= new AddressBookMain();
	    	  book.AddName();
		}
	      
	 

}