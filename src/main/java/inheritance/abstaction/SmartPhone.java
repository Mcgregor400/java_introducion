package inheritance.abstaction;

public class SmartPhone implements Computer, Phone {
    @Override
    public void sendEmail(String addres, String content) {
        System.out.println("Sending emaill " + content + "to adderess" + addres + " using PC");
    }

    @Override
    public void browseInternet() {
        System.out.println( "Brwsing Internet using PC ");
    }

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending sms to  " + number +"with content " + "using nokia 3310 ");
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number + " using Nokia 3310");
    }
}
