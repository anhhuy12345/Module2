package Binary;

public class CountSame {
    public static void countSame(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i+1; j < b.length; j++) {
                if(a[i]==a[j]) {
                    count++;
                    b[j] = 0;
                }
            }
            if(b[i] != 0) b[i] = count;
        }
        System.out.println("ket qua la: ");
        for (int i = 0; i < b.length; i++) {
            if(b[i] != 0) {
                System.out.println("so "+a[i]+" xuat hien "+b[i]+" lan");
            }
        }
    }
}
