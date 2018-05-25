package Work3;

import java.util.ArrayList;

public class Dynamic {
    public ArrayList<Integer> BiggstSubSequence(ArrayList<Integer> one, ArrayList<Integer> two) {
        int[][] buffer = new int[one.size() + 1][two.size() + 1];
        for (int i = 0; i < one.size() + 1; i++)
            for (int j = 0; j < two.size() + 1; j++) {
                buffer[i][j] = l(buffer, one, two, i, j);
            }

        return getList(buffer, one, two);
    }

    private int l(
            int[][] buffer,
            ArrayList<Integer> one, ArrayList<Integer> two,
            int i,
            int j) {
        if (i == 0 || j == 0)
            return 0;
        if (one.get(i - 1).equals(two.get(j - 1)))
            return buffer[i - 1][j - 1] + 1;
        return Math.max(buffer[i - 1][j], buffer[i][j - 1]);
    }

    private ArrayList<Integer> getList(
            int[][] buffer,
            ArrayList<Integer> one, ArrayList<Integer> two
    ) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = buffer.length - 1;
        int j = buffer[i].length - 1;
        while (i != 0 && j != 0) {
            if (buffer[i][j] - 1 == buffer[i - 1][j - 1]) {
                list.add(0, two.get(j - 1));
                i--;
                j--;
                continue;
            }
            if (buffer[i - 1][j] > buffer[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return list;
    }
}
