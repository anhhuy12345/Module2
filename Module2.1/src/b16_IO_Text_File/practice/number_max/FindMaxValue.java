package b16_IO_Text_File.practice.number_max;

import java.util.List;

public class FindMaxValue {
    //contructor
    public FindMaxValue() {
    }

    // phương thức tìm số lớn nhất
    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
