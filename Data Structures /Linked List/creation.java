

import org.w3c.dom.Node;

public class creation {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
        }
    
        public static class ll_implementation{
        Node head=null;
        Node tail=null;
        int size=0;
        void delete(int idx)
        {
            Node temp=head;
            for(int i=0;i<idx-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            if(idx==size-1)
                tail=temp;
            size--;
        }
        int getelement(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
        void insert(int idx,int value){
         Node t=new Node(value);
         Node temp=head;
         if(head==null)
         {
            head=tail=t;
         }
         if(idx==0)
         {
            insertAtbeginning(value);
         }
         if(idx==size-1){
            insertAtend(value);
         }
         else
         {
            for(int i=0;i<idx-1;i++)
            {
                temp=temp.next; 
            }
            t.next=temp.next;
            temp.next=t;
            
         }
         size++;
        }
        void insertAtbeginning(int value)
        {
            Node temp=new Node(value);
            if(head==null)
            {
                head=tail=temp;
            }
            else{
                temp.next=head;
            }
            head=temp;
            size++;
        }
        void insertAtend(int value)
        {
            Node temp =new Node(value);
            if(head==null)
            {
                head=tail=temp;
            }
            else
            {
                tail.next=temp;
                
            }
            tail=temp;
            size++;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                  temp=temp.next;
                   
            }    
        }
    }
    
    
    public static void main(String[] args) {
    ll_implementation  ll= new ll_implementation();
    
      ll.insertAtend(5);
        ll.insertAtend(9);
        ll.insertAtbeginning(8);
       
       
        ll.insert(2,3);
       
        ll.getelement(0);
        ll.delete(3);
        ll.display();

      
        System.out.println(ll.tail.data);
        ll.insert(0, 3);
        ll.display();
    }
}

