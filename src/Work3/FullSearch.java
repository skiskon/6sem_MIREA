package Work3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FullSearch {
    public ArrayList<Integer> BiggestSubSequence(ArrayList<Integer> one, ArrayList<Integer> two) {
        ArrayList<Integer> best = new ArrayList<>();
        int oneMax = (int)Math.pow(2, one.size()) - 1;
        int twoMax = (int)Math.pow(2, two.size()) - 1;
        for (int i = 0; i <= oneMax; i++) {
            for (int j = 0; j <= twoMax; j++){
                ArrayList<Integer> valOne = values(one, indexes(i));
                ArrayList<Integer> valTwo = values(two, indexes(j));
                if (valOne.size() > best.size() && valOne.equals(valTwo))
                    best = valOne;
            }
        }
        Collections.reverse(best);
        return best;
    }

    private ArrayList<Integer> values(ArrayList<Integer> source, ArrayList<Integer> indexes){
        ArrayList<Integer> result = new ArrayList<>();
        for (int index : indexes) {
            result.add(source.get(index));
        }
        return  result;
    }

    private ArrayList<Integer> indexes(int value) {
        ArrayList<Integer> result = new ArrayList<>();
        String str = Integer.toString(value, 2);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                result.add(str.length() -1 - i);
        }
        return result;
    }
}
