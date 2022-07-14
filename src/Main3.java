class Queue
{
    private int maxsize;
    private int array[];
    private int rear;
    private int front;
    private int nItems;


    public Queue(int maxsize)
    {
        this.maxsize = maxsize;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
        this.array = new int[maxsize];
    }
    public void insert(int value)
    {
        if(this.rear == maxsize - 1)
        {
            //can not insert queue is full
            System.out.println("Queue is full");
        }
        else
        {
            nItems++;
            this.array[++this.rear] = value;
        }
    }
    public int remove()
    {
        if(this.nItems == 0)
        {
            //can not remove item queue is empty
           return -99;
        }
        else
        {
           nItems--;
           return this.array[this.front++];
        }
    }
    public int peekFront()
    {
        if(this.nItems == 0)
        {
            //can not remove item queue is empty
            return -99;
        }
        else
        {
            return this.array[this.front];
        }
    }
    public boolean isEmpty()
    {
        return (this.nItems == 0);
    }
    public boolean isFull()
    {
        return (this.nItems == maxsize);
    }
}
public class Main3
{
    public static void main(String args[])
    {
        Queue queue = new Queue(7);
        queue.insert(60);
        queue.insert(47);
        queue.insert(99);
        queue.insert(67);
        queue.insert(24);
        queue.insert(33);
        queue.insert(53);

        System.out.println("PeekFront :"+queue.peekFront());

        while(!queue.isEmpty())
        {
            System.out.println("Remove   :"+queue.remove());
        }
    }

}
