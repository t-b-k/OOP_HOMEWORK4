package myIndexedDoublyLinkedList;

import interfaces.TKIndexedLinkedList;

// Двусвязный список, все элементы в котором проиндексированы уникальными целочисленными индексами.
// Вставка может производиться либо в начало, либо в конец.
// Индексы используются для идентификации данных исключительно.
public class IndexedDoublyLinkedList<DATA_TYPE> implements TKIndexedLinkedList<DATA_TYPE> {
    private IndexedDoublyLinkedListNode<DATA_TYPE> firstNode;
    private IndexedDoublyLinkedListNode<DATA_TYPE> lastNode;
    private int size; // длина списка (сколько в нем элементов)
    private Integer lastIndex; // последний задействованный индекс. Индексы начинаются с 1.
    public IndexedDoublyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
        this.lastIndex = 0;
    }
    public IndexedDoublyLinkedListNode<DATA_TYPE> getFirst() {
        return this.firstNode;
    }
    public IndexedDoublyLinkedListNode<DATA_TYPE> getLast() {
        return this.lastNode;
    }
    public int getSize() {
        return this.size;
    }
    public int getLastIndex() {
        return this.lastIndex;
    }
    public boolean empty() {
        return this.firstNode == null;
    }
    @Override
    public void addFirst(DATA_TYPE dataToAdd) {
        IndexedDoublyLinkedListNode<DATA_TYPE> newNode = new IndexedDoublyLinkedListNode<>();
        newNode.data = dataToAdd;
        this.size++;
        this.lastIndex++;
        newNode.index = this.lastIndex;
        newNode.next = this.firstNode;
        if (!this.empty()) this.firstNode.prev = newNode;
        else this.lastNode = newNode;
        newNode.prev = null;
        this.firstNode = newNode;
    }

    @Override
    public void addLast(DATA_TYPE dataToAdd) {
        IndexedDoublyLinkedListNode<DATA_TYPE> newNode = new IndexedDoublyLinkedListNode<>();
        newNode.data = dataToAdd;
        this.size++;
        this.lastIndex++;
        newNode.index = this.lastIndex;
        newNode.prev = this.lastNode;
        if (!this.empty()) this.lastNode.next = newNode;
        else this.firstNode = newNode;
        newNode.next = null;
        this.lastNode = newNode;
    }

    @Override
    public DATA_TYPE getData(Integer index) {
        IndexedDoublyLinkedListNode<DATA_TYPE> resultedNode = getNodeByIndex(index);
        if (resultedNode != null) return resultedNode.data;
        else return null;
    }
    private IndexedDoublyLinkedListNode<DATA_TYPE> getNodeByIndex(int index) {
        IndexedDoublyLinkedListNode<DATA_TYPE> node = this.firstNode;
        while (node!= null && node.index != index) node = node.next;
        return node;
    }

    @Override
    public int size(TKIndexedLinkedList<DATA_TYPE> tkList) {
        return this.size;
    }

    @Override
    public void remove(int index) {
        IndexedDoublyLinkedListNode<DATA_TYPE> node = getNodeByIndex(index);
        if (node.single()) {
            this.firstNode = null;
            this.lastNode = null;
        }
        else if (node.first()) {
            this.firstNode = node.next;
            node.next.prev = null;
        } else if (node.last()){
            this.lastNode = node.prev;
            node.prev.next = null;
        } else {
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }
        this.size--;
    }

    @Override
    public void set(int index, DATA_TYPE newData) {
        getNodeByIndex(index).data = newData;
    }

    @Override
    public String toString() {
        StringBuilder stringStorage = new StringBuilder ("myIndexedDoublyLinkedList.IndexedDoublyLinkedList: \n");
        IndexedDoublyLinkedListNode<DATA_TYPE> nextNode = this.firstNode;
        while (nextNode != null) {
            stringStorage.append(nextNode.toString());
            nextNode = nextNode.next;
        }
        return stringStorage.toString();
    }

}
