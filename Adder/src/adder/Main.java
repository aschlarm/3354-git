package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please only provide numbers");
        }
    }

    private static int addArguments(int... intArrays) {
        int Sum;
        if (arg[0] = 1) {
            for (int i = 0; i < intArrays.length; i++) {
                Sum -= intArrays[i];
            }
        }
            else {
            for (int i = 0; i < intArrays.length; i++) {
                Sum += intArrays[i];
            }
        }
        return Sum;
    }
}
