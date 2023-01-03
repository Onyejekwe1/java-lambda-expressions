interface Addition {
    int add (int a, int b);
}

class additionImpl implements Addition {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class LambdaParamsExample {
    public static void main (String[] args){
        Addition add = (a, b) -> a + b;
        System.out.println(add.add(2, 4));
    }
}
