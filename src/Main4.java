class CircularQueue
{
    private int maxsize;
    private int front;
    private int rear;
    private int array[];
    private int nItems;

    public CircularQueue(int maxsize)
    {
        this.maxsize = maxsize;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
        this.array = new int[maxsize];
    }
    public void insert(int value)
    {
        if(this.nItems == maxsize )
        {
            System.out.println("Circular queue is full");
        }
        else
        {
            this.array[++this.rear] = value;
            nItems++;
            if(rear == maxsize-1)
            {
                rear = -1;
            }

        }
    }
    public int remove()
    {
        if(this.nItems == 0)
        {
            return -99;
        }
        else
        {
           int temp =  this.array[this.front++];
           if(front == maxsize)
           {
                front = 0;
           }
           nItems--;
           return temp;
        }
    }
    public int peekFront()
    {
        if(this.nItems == 0)
        {
            return -99;
        }
        else
        {
            return this.array[this.front];
        }
    }
    public boolean isEmpty()
    {
        return (this.nItems ==0);
    }
    public boolean isFull()
    {
        return (this.nItems == maxsize);
    }
}
public class Main4
{
    public static void main(String args[])
    {
        CircularQueue circularQueue = new CircularQueue(8);
        circularQueue.insert(10);
        circularQueue.insert(20);
        circularQueue.insert(30);
        circularQueue.insert(40);
        circularQueue.insert(14);
        circularQueue.insert(29);
        circularQueue.insert(33);
        circularQueue.insert(88);

        System.out.println("PeekFront   :"+circularQueue.peekFront());
        System.out.println("Remove      :"+circularQueue.remove());
        System.out.println("Remove      :"+circularQueue.remove());
        circularQueue.insert(90);
        circularQueue.insert(100);
        System.out.println("PeekFront   :"+circularQueue.peekFront());
    }

}
