package CodingChallenge1;

public class alternativlyarrange {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int[] arr2={2,2,2,2,2};
        //1 2 1 2 1 2 1 2 1
        int[] arr3 = new int[arr.length+arr2.length];//10
        int j=0;int k=0; int l=0;
        for(int i=1;i<=arr3.length; i++)
        {
            if((i%2==0))
            {
                arr3[i]=arr[j];
                j++;
                i++;

            }
            else {
                arr3[i]=arr2[k];
                k++;
                i++;
            }
        }

        for (int i = 0; i <=arr3.length; i++) {
            System.out.print( arr3[i] +" ");
        }
    }
}
