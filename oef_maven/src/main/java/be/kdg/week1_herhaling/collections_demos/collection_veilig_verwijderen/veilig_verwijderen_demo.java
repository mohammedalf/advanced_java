package be.kdg.week1_herhaling.collections_demos.collection_veilig_verwijderen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class veilig_verwijderen_demo {
    private static int[] data = {5,6,3,2,4,1};
    
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        for (int i : data) {
            myList.add(i);
        }
        //ONVEILIG!!
/*        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i)%2==0){
                myList.remove(i);
            }
            
        }*/

        //VEILIG
        for (Iterator<Integer> it = myList.iterator(); it.hasNext(); ) {
            if(it.next()%2==0){
                it.remove();
            }

        }

        for (Integer i : myList) {
            System.out.println(i);
        }
        
    }
}
