/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist.using.queue;

public class linkListQueues
{      
    Node front;
    Node rear;
    
    class Node
    {
        String data;
        Node next;

        Node(String data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    
    // 1st EnQueue() Function
    public void enQueue (String data)
    {
        Node queue = new Node(data);
                
        if (front == null) 
        {
            front = rear = queue;
            return;
        }
                
        rear.next = queue;
        rear = queue;    
    }
        
    // 2nd DeQueue() Function 
    public void deQueue ()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty!");
            return;
        }
        
        front = front.next;
        
        if (front == null)
        {
            rear = null;
        }
    }
    
    // 3rd isEmpty() Function
    public boolean isEmpty ()
    {
        return front == null;
    }
    
    // 4th Display() Function
    public void display ()
    {
        Node temp = front;
        System.out.println("------------------");
        
        while (temp != null)
        {
            System.out.println("Data is : " +temp.data);
            temp = temp.next;
        }
        System.out.println("------------------");
        System.out.println("------------------");
    }
    
    public static void main(String[] args)
    {
        linkListQueues queue = new linkListQueues();
               
        queue.enQueue("Ali");
        queue.enQueue("Ayesha");
        queue.enQueue("Babar");
        queue.enQueue("Afra");
        queue.enQueue("Cheeku");
        queue.display();
                     
        queue.deQueue();
        queue.display();        
        
    }
}