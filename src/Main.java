import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {

        try {
            Person Osoba1 = new Person();
            Osoba1.SetNameAndAge("Monika", 150);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        }

        int x = MathUtils.add(10,6);
        System.out.println(x);


        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Addition result:" + x);

    }


    }
