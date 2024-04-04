import java.util.Arrays;

class mergeArr {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = m - 1; 
        int j = n - 1; 
        int k = m - 1; 

        while (i >= 0 && k >= 0) {
            if (X[k] != 0) {
                X[i] = X[k];
                i--;
            }
            k--;
        }

        i = 0;
        while (i < m && j >= 0) {
            if (k < 0 || Y[j] >= X[k]) {
                X[i] = Y[j];
                j--;
            } else {
                X[i] = X[k];
                k--;
            }
            i++;
        }
        Arrays.sort(X);
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        merge(X, Y);
   
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
