package HW9;

import HW7.Collection;

public class CustomCollectionService implements CustomCollection<String> {

    private Node<String> head;
    private int size;

    public CustomCollectionService() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean add(String str) {
        if (this.head == null) {
            this.head = new Node<>(str);
        } else {
            addNext(this.head, str);
        }
        this.size++;
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            String data = strColl.get(i);
            add(data);
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (0 == index) {
            this.head = this.head.getNext();
        } else {
            Node<String> parentNode = getNode(index - 1);
            if (index == this.size) {
                parentNode.setNext(null);
            } else {
                Node<String> nextNode = getNode(index + 1);
                parentNode.setNext(nextNode);
            }
        }
        this.size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        int nodeIndex = getNodeIndex(str);
        if (nodeIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        return delete(nodeIndex);
    }

    @Override
    public String get(int index) {
        if (index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<String> node = getNode(index);
        return node.getElement();
    }

    @Override
    public boolean contains(String str) {
        boolean contain = false;
        if (str != null) {
            getNodeIndex(str);
            contain = true;
        }
        return contain;
    }

    @Override
    public boolean clear() {
        if (this.size == 0) {
            return false;
        }
        this.head = null;
        this.size = 0;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean trim() {
        return true;
    }


    private class Node<T> {
        private final String element;
        private Node<String> next;

        public Node(String element) {
            this.element = element;
        }

        public String getElement() {
            return element;
        }

        public void setNext(Node<String> next) {
            this.next = next;
        }

        public Node<String> getNext() {
            return next;
        }
    }


    private void addNext(Node<String> head, String str) {
        if (null == head.getNext()) {
            head.setNext(new Node<>(str));
        } else {
            addNext(head.getNext(), str);
        }
    }


    private Node<String> getNode(int index) {
        if (index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node<String> currentNode = this.head;
        while (index > currentIndex && null != currentNode) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        return currentNode;
    }

    private int getNodeIndex(String str) {
        Node<String> currentNode = this.head;
        int currentIndex = 0;
        while (null != currentNode) {
            if (null != currentNode.getElement() && currentNode.getElement().equalsIgnoreCase(str)) {
                return currentIndex;
            }
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        return -1;
    }
}
