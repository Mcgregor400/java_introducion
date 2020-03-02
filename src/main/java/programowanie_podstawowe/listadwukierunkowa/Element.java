package programowanie_podstawowe.listadwukierunkowa;

public class Element {

    private Element next;
    private Element prev;
    private int value;
/////////konstruktory
    public Element(int value) {
        this.value = value;
    }


///////getery
    public Element getNext() {
        return next;
    }

    public Element getPrev() { return prev; }
/////setery
    public void setNext(Element next) {
        this.next = next;
    }

    public void setPrev(Element prev) { this.prev = prev; }

    @Override
    public String toString() {
        return "Element{" +

                ", value=" + value +
                '}';
    }
}
