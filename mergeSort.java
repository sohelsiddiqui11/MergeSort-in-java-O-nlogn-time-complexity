public class mergeSort {
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;     //mid elemnt
        mergesort(arr,si,mid);     // left sort
        mergesort(arr,mid+1,ei);    //right sort
        merge(arr,si,mid,ei);        

    }
    // merge method to merge two sorted array
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//idx for first sorted part
        int j=mid+1;//idx for second sorted part
        int k=0;//idx for temp var
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else
            {
                temp[k]=arr[j];
                j++;k++;
            }
        }
        //for leftover elemnt of first sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // for rightover elemnt of second soted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int si=0;
        int ei=arr.length-1;
        mergesort(arr,si,ei);
        printarray(arr);
    }
    
}
