package programowanie_podstawowe.listadwukierunkowa;

public class ListaDwukierunkowaProgram {

    public static void main(String[] args) {

        ListaDwukierunkowa lista = new ListaDwukierunkowa();

        for (int i = 1; i <= 10; i++) {
            lista.add(new Element(i));
        }

        Element element = lista.getHead();

        do {

            System.out.println(element);
            element = element.getNext();

        } while (element.getNext() != null);



    }
}
