package programowanie_podstawowe.listadwukierunkowa;

public class ListaDwukierunkowa {

    protected Element head;
    protected Element tail;

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public void add(Element element) {

        if (head == null) {
            head = element;
            tail = element;
        } else {
            tail.setNext(element);
            element.setPrev(tail);
            tail = element;
        }

    }

}
