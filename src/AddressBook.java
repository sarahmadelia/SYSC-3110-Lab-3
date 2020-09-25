import javax.swing.*;

public class AddressBook extends DefaultListModel<BuddyInfo>{

public AddressBook(){
    super();
}

public AddressBook(AddressBook address){
    super();
}

    public void addBuddy(BuddyInfo buddy){
        this.addElement(buddy);
    }
public void removeBuddy(BuddyInfo buddy){
    this.removeElement(buddy);
}
    public static void main(String[] args){
    System.out.println("Address Book");
    }
}
