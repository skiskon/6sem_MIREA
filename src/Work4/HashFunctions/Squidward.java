package Work4.HashFunctions;

import Work4.HashFunction;

public class Squidward implements HashFunction{
    @Override
    public int calc(int a) {
        return a*a;
    }
}
