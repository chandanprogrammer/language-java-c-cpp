package questionProblem;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 5, k = 3;
        System.out.println(Josephus(n, k));
    }
    public static int Josephus(int n, int k)
    {
        k--;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        int cnt = 0, cut = 0, num = 1;
        while (cnt<(n- 1))
        {
            while (num<= k)
            {
                cut++;
                cut = cut% n;

                if (arr[cut] == 1) {
                    num++;
                }
            }
            num = 1;
            arr[cut] = 0;
            cnt++;
            cut++;
            cut = cut % n;
            while (arr[cut]== 0)
            {
                cut++;
                cut = cut% n;
            }
        }
        return cut+ 1;
    }
}

