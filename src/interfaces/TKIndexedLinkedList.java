package interfaces;

public interface TKIndexedLinkedList<DATA_TYPE> {
    public void addFirst(DATA_TYPE dataToAdd);
    public void addLast(DATA_TYPE dataToAdd);
    public DATA_TYPE getData(Integer index);
    public int size(TKIndexedLinkedList<DATA_TYPE> tkList);
    public void remove(int index);
    public void set(int index, DATA_TYPE newData);
}
