package dev.nirmaljeffrey.dsalgo.datastructures.stack;

import org.jetbrains.annotations.NotNull;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArrayStack<T> implements Stack<T> {
    private Object[] array;
    private int length = -1;

    public DynamicArrayStack() {
        array = new Object[5];
    }

    @Override
    public int size() {
        return length + 1;
    }

    @Override
    public boolean isEmpty() {
        return length == -1;
    }

    @Override
    public void push(T data) {
      if (length == array.length - 1) {
          increaseArrayCapacity();
      }
      array[++length] = data;
    }

    @Override
    public T pop() {
        if (length == -1) {
            throw new EmptyStackException();
        }
        T data = (T) array[length];
        --length;
        return data;
    }

    @Override
    public T peek() {
        if (length == -1) {
            throw new EmptyStackException();
        }
        return (T) array[length];
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int temp = length;
            @Override
            public boolean hasNext() {
                return temp != -1;
            }

            @Override
            public T next() {
                if (temp == -1) {
                    throw new NoSuchElementException();
                }
                return (T) array[temp--];
            }
        };
    }

    private void increaseArrayCapacity() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}


