package dev.nirmaljeffrey.dsalgo.datastructures.list.linkedlist;

public interface List<T> extends Iterable<T> {

void add(T data);
void addLast(T data);
void addFirst(T data);
void addAt(int index, T data);
T removeFirst();
T removeLast();
T removeAt(int index);
void clear();
int indexOf(T element);
boolean contains(T element);
boolean isEmpty();
int size();
T peekFirst();
T peekLast();
}
