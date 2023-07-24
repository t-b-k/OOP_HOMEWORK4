package myIndexedDoublyLinkedList;

// Узел двухсвязного списка содержит:
// 1)  уникальный индекс узла (накапливаемое значение; при удалении узлов
// данный индекс не возобновляется, остается пропущенным; используется для поиска, аналог ID в базе данных).
// 2) некоторые данные  - объект кастомного типа;
// 3) ссылку на предыдущий узел списка;
// 4) ссылку на последующий узел списка.

public class IndexedDoublyLinkedListNode<DATA_TYPE> {
    public Integer index;
    public DATA_TYPE data;
    public IndexedDoublyLinkedListNode<DATA_TYPE> prev;
    public IndexedDoublyLinkedListNode<DATA_TYPE> next;

    public IndexedDoublyLinkedListNode() {
        this.index = null;
        data = null;
        prev = null;
        next = null;
    }
    public IndexedDoublyLinkedListNode(Integer index, DATA_TYPE userData) {
        this.index = index;
        data = userData;
        prev = null;
        next = null;
    }
    public boolean single() {
        return prev == null && next == null;
    }
    public boolean first() {
        return prev == null && next != null;
    }
    public boolean last() {
        return next == null && prev != null;
    }
    @Override
    public String toString() {
        StringBuilder stringStorage = new StringBuilder("DoublyLinkedListNode");

        if (this.single()) stringStorage.append("(single node): Index =  ");
        else if (this.first()) stringStorage.append("(first node): Index = ");
        else if (this.last()) stringStorage.append("(last node): Index = ");
        else stringStorage.append("(middle node): Index = ");

        stringStorage.append(index);
        stringStorage.append(". Data = <");
        stringStorage.append(data);
        stringStorage.append(">\n");
        return stringStorage.toString();
    }
}
