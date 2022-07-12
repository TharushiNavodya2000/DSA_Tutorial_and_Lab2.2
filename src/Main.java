import java.util.Scanner;

class QueueX
{
    private int maxsize;
    private int rear;
    private int front;
    private int noItems;
    private int queueArr[];

    public QueueX(int maxsize)
    {
        this.maxsize = maxsize;
        this.rear = -1;
        this.front = 0;
        this.noItems = 0;
        this.queueArr = new int[maxsize];
    }
    public void insert(int value)
    {
        if(noItems == maxsize)
        {
            System.out.println("Can not insert Items");
        }
        else
        {
            noItems++;
            this.queueArr[++this.rear] = value;
        }
    }
    public int remove()
    {
        if(noItems == 0)
        {
            return 0;
        }
        else
        {
            noItems--;
           return this.queueArr[this.front++];
        }
    }
    public boolean isEmpty()
    {
        return (this.noItems == 0);
    }
    public boolean isFull()
    {
        return (this.noItems == maxsize);
    }
}
class evenQueue extends QueueX
{
    public evenQueue(int maxsize)
    {
        super(maxsize);
    }
}
class oddQueue extends QueueX
{
    public oddQueue(int maxsize)
    {
        super(maxsize);
    }
}
public class Main
{
    public static void main(String args[])
    {
        QueueX queueX = new QueueX(5);
        Scanner input = new Scanner(System.in);
        int value;
        int odd =0;
        int even = 0;

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter transction ID :");
            value = input.nextInt();
            queueX.insert(value);
            if(value%2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        evenQueue pc1 = new evenQueue(even);
        oddQueue pc2 = new oddQueue(odd);
        for(int i=0;i<5;i++)
        {
            int temp = queueX.remove();
            if(temp%2 == 0)
            {
                System.out.println("ID "+temp+" is sent to PC1");
                pc1.insert(temp);
            }
            else
            {
                System.out.println("ID "+temp+" is sent to PC2");
                pc2.insert(temp);
            }
        }
        int temp;
        System.out.println("PC1");
        while(!pc1.isEmpty())
        {
            temp = pc1.remove();
            System.out.print("Transaction  "+temp);
        }
        System.out.println("\nPC2");
        while(!pc2.isEmpty())
        {
            temp = pc2.remove();
            System.out.print("Transaction  "+temp);
            System.out.println("Hello");
        }
    }

}