public class App {
    public static void main(String[] args){
        
        LinkedList list = new LinkedList();

        for (int i = 0; i <= 5; i++){
            
            list.add(i);
        }

        list.printList();

        list.reverse();

        list.printList();
    }
}
