package inheritance.abstaction;

public class PC implements Computer {


    @Override
    public void sendEmail(String addres, String content) {
        System.out.println("Sending emaill " + content + "to adderess" + addres + " using PC");
    }

    @Override
    public void browseInternet() {
        System.out.println( "Brwsing Internet using PC ");
    }
}
