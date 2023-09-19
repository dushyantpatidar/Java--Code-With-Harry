import java.util.*; // Import all 
class tut57{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(55);
        l2.add(44);
        l2.add(33);
        //--
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1,4);
        l1.add(0,5);// we decalre 0 index of 5 

        l1.addAll(0,l2); // l2 add in l1 from 0 index 
        l1.set(1, 659);// decalre e element in LinkedList
        
        l1.addLast(5555); // Add in last of array 
        l1.addFirst(1111); // 
        // l1.clear(); for remove all element from the LinkedList
        for(int i = 0; i<l1.size();i++){
            //System.out.println(l1[i]);----Wrong way , bcz  not an LinkedList 
            System.out.println(l1.get(i)+" ");
        }
        System.out.println("\nFind the 5 : "+l1.contains(5)); // find any element in any array directly
        System.out.println("\nIndex of 55 :"+l1.indexOf(55)); // find the element index no. in LinkedList
    }
}
