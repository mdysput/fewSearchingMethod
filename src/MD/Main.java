package MD;

public class Main {

    public static void main(String[] args) {

        int[] tab= {1, 2, 5, 6, 7, 9};
        int liczba= binarySearch(tab, 6);
        if(liczba != -1){
            System.out.println(liczba);
        }
    }

    private static int binarySearch(int[] tab, int find){
        int first=0;
        int last= tab.length-1;

        while(first<=last){
             int medium=(first+last)/2;

             if(tab[medium]== find){
                 return tab[medium];
             }
             else if(tab[medium]<find){
                 first= medium+1;
             }
             else
                 last= medium-1;
        }
        return -1;
    }

}

