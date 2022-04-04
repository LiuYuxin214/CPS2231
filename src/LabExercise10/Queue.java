package LabExercise10;

public class Queue {
    int[] element;
    int size;

    public Queue() {
        this.element = new int[8];
        this.size = 0;
    }

    public void enqueue(int v) {
        if (this.element.length == this.size) {
            int[] newElement = new int[this.size * 2];
            for (int i = 0; i < this.size; i++) {
                newElement[i] = this.element[i];
            }
            this.element = newElement;
        }
        this.element[this.size++] = v;
    }

    public int dequeue() {
        if (this.size == 0) {
            throw new IndexOutOfBoundsException();
        }
        int v = this.element[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.element[i] = this.element[i + 1];
        }
        this.size--;
        return v;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++) {
            q.enqueue(i);
        }
        while (!q.empty()) {
            System.out.println(q.dequeue());
        }
    }

}
