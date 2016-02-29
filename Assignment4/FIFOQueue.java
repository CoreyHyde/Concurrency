package Assignment4;

interface FIFOQueue {
    void enqueue(Item item);// never fails
    Item dequeue();         // returns null if empty,
                            // else returns items in order queued
    boolean isEmpty();      // true if nothing in queue
    int getQueueLength();   // returns number currently in queue
}