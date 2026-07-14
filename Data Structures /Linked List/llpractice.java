package linked_list;

class Node{
      int data;
      Node next;
      Node (int data)
      {
        this.data =data;
      }
} 

class implement{
    Node head=null;
    Node tail=null;
    
    void insertatend(int val){
        Node temp=new Node(val);
        if (head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }
    }
    void delete_from_end(int n)
    {
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        
        while (fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }
    void insertatbeginning(int val)
    {
        Node temp=new Node(val);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }

    void insertat(int idx,int val)
    {
        if(idx==0)
        {
            insertatbeginning(val);
        }
        else{
        Node t=new Node(val);
        Node temp=head;
        for(int i=0;i<idx-1;i++)
        {
            temp=temp.next;
        }
         t.next=temp.next;
            temp.next=t;
    }
    }
    void get_element(int idx){
        Node temp=head;
        for(int i=0;i<idx;i++)
        {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    void delete_at(int idx){
     Node temp=head;
     for(int i=0;i<idx-1;i++)
     {
        temp=temp.next;
     }
     temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
public class llpractice {
    public static void main(String[] args) {
    
        implement ll=new implement();
        
        ll.insertatend(3);
        ll.insertatend(6);
        ll.insertatend(23);
        ll.insertatend(4);
        ll.insertatend(34);
        
        ll.insertatbeginning(5);
        ll.insertatbeginning(44);
        ll.insertatbeginning(23);
       
        ll.insertat(2,96 );
        ll.insertat(4,48 );
        ll.insertat(0, 54);
        
        ll.display();
       

      System.out.println();
        ll.delete_at(3);
        ll.display();
        System.out.println();
        ll.delete_from_end(9);
        ll.display();
        
    }
}
