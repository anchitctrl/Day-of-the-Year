class Solution {
    public int dayOfYear(String date) {
        int d=Integer.parseInt(date.substring(8)); 
        int m=Integer.parseInt(date.substring(5,7)); 
        int y=Integer.parseInt(date.substring(0,4));
        if(m==1) return d;
        int[] arr=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if((y%100==0 && y%400==0) || (y%4==0 && y%100!=0)){
            arr[1]=29;
        }
        int day=0;
        for(int i=0;i<m-1;i++){
            day=day+arr[i];
        }
        day=day+d;
        return day;
    }
}
