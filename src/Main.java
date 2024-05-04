import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {

        try {
            Person Osoba1 = new Person();
            Osoba1.SetNameAndAge("Monika", 150);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        }


        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Witam i o zdrowie pytam.");

    }


    }
