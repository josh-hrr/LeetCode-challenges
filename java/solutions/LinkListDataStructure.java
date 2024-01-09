/* 

A linkList is a data Structure that will allow to store values by using nodes and a pointer so we can have a reference to the value that is store next, we have to traversally read the linkList

*/

class HelloWorld {
    public static void main(String[] args) { 
        LinkList head = new LinkList(1,
                        new LinkList(2,
                        new LinkList(3,
                        new LinkList(4,
                        new LinkList(5))))); 
                        
        System.out.println("Reading the LinkList: ");
         head.printLinkList(); 
         System.out.println("");
         
         System.out.println("LinkList length: ");
         head.lengthLinkList();
         System.out.println("");
         
         System.out.println("Middle node value: " + head.middleNode(head));
         
    }
}

class LinkList {
    int value;
    LinkList next; 
    LinkList() { 
    }
    
    LinkList(int value){
        this.value = value;
    }
    
    LinkList(int value, LinkList next){
        this.value = value;
        this.next = next;
    }
    
    void printLinkList(){
        LinkList current = this;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
    
    void lengthLinkList(){
        LinkList current = this;
        int counter = 0;
        while (current != null) { 
            counter = counter + 1;
            current = current.next;
        }
        System.out.println(counter);
    }
    
    public int middleNode(LinkList head){
        LinkList middle = head;
        LinkList end = head;
        
        while(end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle.value;
    } 
}
