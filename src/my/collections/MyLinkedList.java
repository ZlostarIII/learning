package my.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    Node<E> head;
    Node<E> tail;
    int size;

	private static class Node<E> {
		E elem;
		Node<E> prev, next;

        public Node(E elem, Node<E> prev, Node<E> next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		Node<E> node = head;

		while(node != null) {
			if(node.elem.equals(o)) {
				return true;
			}
			
			node = node.next;
		}
		
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		Object[] linkedArray = new Object[size];
		Node<E> node = head;
		int index = 0;
		
		while(node != null) {
			linkedArray[index] = node.elem;
			index++;
			node = node.next;
		}
		
		return linkedArray;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
	    boolean sizeChanged = false;
	    
	    Node<E> newNode = new Node<>(e, null, tail);

        if (head == null) {
            head = newNode;
            tail = head;
            sizeChanged = true;
        } else {
            tail.next = newNode;
            sizeChanged = true;
        }
        size++;

        return sizeChanged;
	}
	
	public boolean addFirst(E e) {
		boolean sizeChanged = false;
		
		Node<E> node = head;
		Node<E> newNode = new Node<>(e, node, null);

        if (head == null) {
            head = newNode;
            tail = head;
            sizeChanged = true;
        } else {
            tail.prev = newNode;
            sizeChanged = true;
        }
        size++;
        
		return sizeChanged;
	}

	@Override
	public boolean remove(Object o) {
		boolean sizeChanged = false;
		Node<E> node = head;

		while(node != null) {
			
			if(node.elem.equals(o)) {
				
				if (node.prev == null) {
					head = node.next;
				} else {
					node.prev.next = node.next;
					node.prev = null;
				}

				if (node.next == null) {
					tail = node.prev;
				} else {
					node.next.prev = node.prev;
					node.next = null;
				}

				node.elem = null;
				
				sizeChanged = true;
			}
			
			size--;
			node = node.next;
		}
		
		return sizeChanged;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		Node<E> node = head;
		
		while(node != null) {
			Node<E> newNode = node;
			node.elem = null;
			node.next = null;
			node.prev = null;
			
			node = newNode.next;
		}
	}

	@Override
	public E get(int index) {
		Node<E> node = head;
		int counter = 0;
		
		while(node != null) {
			if(counter == index) {
				return node.elem;
			}
			counter++;
			node = node.next;
		}
		
		return null;
	}

	@Override
	public E set(int index, E element) {
		Node<E> node = head;
		E el = null;
		int counter = 0;

		while(node != null) {
			if(counter == index) {
				el = node.elem;
				node.elem = element;
			}
			counter++;
			node = node.next;
		}
		
		return el;
	}

	@Override
	public void add(int index, E element) {
		Node<E> node = head;
		int counter = 0;

		while(node != null) {
			if(counter == index) {
				
				if (node.prev == null) {
					head = node;
				} else {
					node.prev = node;
				}

				if (node.next == null) {
					tail = node;
				} else {
					node.next = node;
				}

				node.elem = element;
			}
			
			size++;
			node = node.next;
		}
		
	}

	@Override
	public E remove(int index) {
		Node<E> node = head;
		E el = null;
		int counter = 0;

		while(node != null) {
			if(counter == index) {
				
				if (node.prev == null) {
					head = node.next;
				} else {
					node.prev.next = node.next;
					node.prev = null;
				}

				if (node.next == null) {
					tail = node.prev;
				} else {
					node.next.prev = node.prev;
					node.next = null;
				}

				el = node.elem;
				node.elem = null;
			}
			
			size--;
			node = node.next;
		}
		
		return el;
	}

	@Override
	public int indexOf(Object o) {
		int index = 0;
		Node<E> node = head;

		while(node != null) {
			if(node.elem.equals(o)) {
				return index;
			}
			index++;
			node = node.next;
		}
		
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = size;
		Node<E> node = tail;

		while(node != null) {
			if(node.elem.equals(o)) {
				return index;
			}
			index--;
			node = node.prev;
		}
		
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
