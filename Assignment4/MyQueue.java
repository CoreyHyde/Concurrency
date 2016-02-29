public class MyQueue implements FIFOQueue {

    private int length;
    private Element head;

    private static class Element {
        private Item data;
        private Element next;

        Element( Item it, Element elem ) {
            this.data = it;
            this.next = elem;
        }
    }

    public void enqueue( Item item ) {
        length++;
        Element newHead = new Element(item, head);
        this.head = newHead;
    }

    public Item dequeue() {
        if( !isEmpty() ) {
            Element node = head;
            Element temp;
            if( getQueueLength() == 1 ) {
                head = null;
                length = 0;
                return node.data;
            }
            for( int i = 0; i < (length - 2); i++ ) {
                node = node.next;
            }
            temp = node.next;
            node.next = null;
            length--;
            return temp.data;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if( getQueueLength() == 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public int getQueueLength() {
        return length;
    }
}
