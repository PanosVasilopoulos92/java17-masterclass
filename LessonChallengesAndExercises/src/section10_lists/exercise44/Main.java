package section10_lists.exercise44;

public class Main {

    public static void main(String[] args) {
        MobilePhoneContact mobilePhoneContact1 = new MobilePhoneContact();
        System.out.println(mobilePhoneContact1);

        mobilePhoneContact1.addNewContact("John", "698746754");
        System.out.println(mobilePhoneContact1);

        mobilePhoneContact1.addNewContact("Despoina", "698746759");
        System.out.println(mobilePhoneContact1);
        System.out.println("---------\n");

        System.out.println(mobilePhoneContact1.getContacts());
        System.out.println("---------\n");

        Contact contact1 = new Contact("Billy", "698367277");

        mobilePhoneContact1.updateContact("John", "698746754", contact1);
        System.out.println(mobilePhoneContact1.getContacts());

    }
}
