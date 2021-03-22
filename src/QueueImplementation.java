public class QueueImplementation<E> implements Queue<E> {

    private E[] datos;
    private int p;

    public boolean Full(){
        return this.p>=this.datos.length;
    }

    public boolean Empty(){
        return this.p==0;
    }

    public int Size(){
        return this.p;
    }


    public QueueImplementation(int longitud){
        this.p=0;
        this.datos=(E[]) new Object[longitud];
    }

    @Override
    public void push(E e) throws FullQueueException {
        if (this.Full()) throw new FullQueueException();
        this.datos[this.p++] = e;
    }

    @Override
    public E pop() throws EmptyQueueException {
        if (this.Empty()) throw new EmptyQueueException();
        E e = this.datos[0];
        for (int i = 0; i < this.p; i++) {
            this.datos[i] = this.datos[i + 1];
        }
        this.p--;
        return e;
    }

    @Override
    public int size() {
        return 0;
    }
}
