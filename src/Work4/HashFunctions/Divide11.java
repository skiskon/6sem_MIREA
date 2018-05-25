package Work4.HashFunctions;

import Work4.HashFunction;

public class Divide11 implements HashFunction {
    @Override
    public int calc(int a) {
        return a % 11;
    }
}
