import util.SinglyLinkedList;
import util.Node;

public class Main {

    public static void removeOddIndices(SinglyLinkedList list) {

        Node IT = list.head;
        while (IT.next != null) { //While it is not the tail node.
            IT.next = IT.next.next;
            IT = IT.next;


        }
    }

    public static void removeEvenIndices (SinglyLinkedList list) {

        if(list.head == null) {
            return;
        }

        list.head = list.head.next; //Removes the head

       for( Node IT = list.head; IT != null && IT.next != null; IT = IT.next) {

           IT.next = IT.next.next;

       }

    }

    //Q4
    public static void reverse (SinglyLinkedList list) {

        Node prev = list.head;

        if( prev == null){
            return;
        }
        Node cur = prev.next, rest;
        prev.next = null; // Head becomes new tial

        while( cur != null){

         rest = cur.next;
         cur.next = prev;
         prev = cur;
         cur = rest;
        }
        list.head = prev;

    }

    public static void main(String[] args) {

        //1
        Node tail = new Node(7, null);
        Node middle =  new Node( 6,tail);
        Node head = new Node( 5, middle);
        SinglyLinkedList list = new SinglyLinkedList(head);
        System.out.println(list);

        //2
        list = new SinglyLinkedList(new Node(0, new Node(1,
                new Node(2, new Node(3, new Node(4, new Node(5,
                        new Node(6, new Node(7, new Node(8, null ))))))))));


//            removeOddIndices(list);
//            System.out.println(list);
//
//         removeEvenIndices(list);
//          System.out.println(list);

            reverse(list);
            System.out.println(list);

        }



    }
