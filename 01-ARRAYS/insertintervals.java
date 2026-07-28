import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] intervals=new int[n][2];
        for(int i=0;i<n;i++){
            intervals[i][0]=sc.nextInt();
            intervals[i][1]=sc.nextInt();
        }
         int[] newinterval=new int[2];
         newinterval[0]=sc.nextInt();
         newinterval[1]=sc.nextInt();
         int[][] arr=new int[n+1][2];
         for(int i=0;i<n;i++){
             arr[i][0]=intervals[i][0];
             arr[i][1]=intervals[i][1];
         }
         arr[n][0]=newinterval[0];
         arr[n][1]=newinterval[1];
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]> result=new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            int[] last=result.get(result.size()-1);
            if(arr[i][0]<=last[1]){
                last[1]=Math.max(arr[i][1],last[1]);
            }
            else{
                result.add(arr[i]);
            }
        }
        System.out.print("[");
        for(int i=0;i<result.size();i++){
            System.out.print("["+result.get(i)[0]+","+result.get(i)[1]+"]");
            if(i!=result.size()-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}