package inheritance.abstaction;

public class Test {

    public static void main(String[] args) {
        Phone nokia = new Nokia3310(5);
        nokia.makeCall(885447184);
        nokia.sendSms(885447184,"cześć");
        Computer pc = new PC();
        pc.browseInternet();
        pc.sendEmail("ghys@wp.pl", "temat");

        Phone smartPhone = new SmartPhone();
        smartPhone.sendSms(885447184,"hello");
        smartPhone.makeCall(885447184);

        Computer smartPhone2 = new SmartPhone();
        smartPhone2.sendEmail("ghys@wp.pl" ,"Cześć");
        smartPhone2.browseInternet();

    }
}
