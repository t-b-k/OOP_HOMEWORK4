import myIndexedDoublyLinkedList.IndexedDoublyLinkedList;
import myIndexedDoublyLinkedList.IndexedDoublyLinkedListNode;

public class Main {
    public static void main(String[] args) {
        IndexedDoublyLinkedListNode<Integer> intNode = new IndexedDoublyLinkedListNode(5, 2309487);
        System.out.println(intNode);
        IndexedDoublyLinkedList<String> listOfStrings = new IndexedDoublyLinkedList<>();
        listOfStrings.addFirst("Самый первый элемент");
        System.out.println(listOfStrings.getFirst().prev);
        System.out.println(listOfStrings.getFirst().next);
        System.out.println(listOfStrings.getFirst().index);
        System.out.print(listOfStrings.getFirst());
        System.out.println("------------------------------------");
        listOfStrings.addFirst("Второй элемент (в начало)");
        System.out.println(listOfStrings.getFirst().prev);
        System.out.print(listOfStrings.getFirst().next);
        System.out.println(listOfStrings.getFirst().index);
        System.out.println(listOfStrings.getFirst());
        System.out.println("------------------------------------");
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        listOfStrings.addLast("Третий элемент (в конец)");
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        System.out.println("Изменим значение узла с индексом 2: ");
        listOfStrings.set(2, "Второй элемент");
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        System.out.println("Изменим значение узла с индексом 1: ");
        listOfStrings.set(1, "Первый элемент");
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        System.out.println("Изменим значение узла с индексом 3: ");
        listOfStrings.set(3, "Третий элемент");
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        System.out.println("Удалим узел с индексом 2: ");
        listOfStrings.remove(2);
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        System.out.println("Удалим узел с индексом 1: ");
        listOfStrings.remove(1);
        System.out.println(listOfStrings);
        System.out.println("------------------------------------");
        System.out.println("Удалим узел с индексом 3: ");
        listOfStrings.remove(3);
        System.out.println(listOfStrings);
//        System.out.println(listOfStrings.getFirstNode());
//        System.out.println(listOfStrings.getLastNode());

    }
}