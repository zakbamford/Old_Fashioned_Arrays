package _02_diy_array_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<E> implements List<E> {

	private int size;
	private Object[] elements;

	public ArrayList() {
		elements = new Object[10];
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o))
				return true;
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		if (size == elements.length - 1) {
			expand();
		}
		elements[size] = e;
		size++;
		return true;
	}

	public void expand() {
		Object[] temp = new Object[size + 5];
		for (int i = 0; i < elements.length; i++) {
			temp[i] = elements[i];
		}
		elements = temp;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub

	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) {
		return (E) elements[index];
	}

	@Override
	public E set(int index, E element) {
		E ret = (E) elements[index];
		elements[index] = element;
		return ret;
	}

	@Override
	public E remove(int index) {
		E temp = (E) elements[index];
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size] = null;
		size--;
		return temp;
	}

	public void addAt(int index, E element) {
		for (int i = elements.length - 2; i >= index; i--)
			elements[i + 1] = elements[i];
		elements[index] = element;
		size++;
	}
}
