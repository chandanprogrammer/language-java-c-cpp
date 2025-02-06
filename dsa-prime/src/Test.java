public class Test {
    public static void main(String[] args) {
            int M =9, N =15;
                //You can code here
                int count = 0;
                while(true){
                    int temp = M;
                    M = N;
                    N = N-temp;
                    count++;
                    if(M==1 || N==1) break;
                }
                count += M ;
        System.out.println(count-1);
    }
}



