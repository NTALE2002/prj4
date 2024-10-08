package PrJ_5_3;

public class ParentClass {
    String firstName;
    String lastName;
    public ParentClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
public void showDetails(){
    System.out.println("firstName: "+firstName+"\n"+
                        "lastName: "+lastName
            );


}
 final public void displayMessage(){
     System.out.println("This method " +
             "is final indicating it cannot be overriden by subclasses");
  }

}
