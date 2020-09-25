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
    public void addBuddy(AddressBook address){
    for(int i=0; i<address.size(); i++) {
        this.addBuddy(address.get(i));
    }
    }

    public void removeBuddy(int index){
    if(index>=0) {
        this.remove(index);
    }
    }

    public static void main(String[] args){
    BuddyInfo buddy = new BuddyInfo("Tom","Carleton", "613");
    AddressBook addressBook= new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(buddy);
    }
}
