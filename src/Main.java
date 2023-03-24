public class Main
{
    public static void main(String[] args)
    {
        Nodo n1 = new Nodo(24);
        Nodo n2 = new Nodo(88);
        Lista l1 = new Lista();
        l1.start = n1;
        n1.next = n2;
    }
}