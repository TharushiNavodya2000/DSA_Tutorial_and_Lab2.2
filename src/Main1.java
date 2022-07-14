class Stack
{
    private int top;
    private int maxsize;
    private int array[];

    public Stack(int maxsize)
    {
        this.top = -1;
        this.maxsize = maxsize;
        this.array = new int[maxsize];
    }
    public void push(int value)
    {
        //chaek array is full
        if(this.top == maxsize-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            //++top
            //this.array[top] = value;
            this.array[++top] = value;
        }
    }
    public int peek()
    {
        //cheak the array is empty
        //if empty return -99
        if(this.top == -1)
        {
            //error
            return -99;
        }
        else
        {
            //top most value return
            return this.array[top];
        }
    }
    public int pop()
    {
        //cheak the array is empty
        //if empty return -99
        if(this.top == -1)
        {
            //error
            return -99;
        }
        else
        {
            //without this method can not do this task
            return this.array[this.top--];
        }
    }
    public boolean isEmpty()
    {
        return (this.top == -1);
    }
    public boolean isFull()
    {
        return (this.top == maxsize);
    }
}
public class Main1
{
    public static void main(String args[])
    {
        Stack stack = new Stack(10);
        stack.push(30);
        stack.push(80);
        stack.push(100);
        stack.push(25);

        while(!stack.isEmpty())
        {
            System.out.println("Remove   :"+stack.pop());
        }
    }
}
