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

    private static int addArguments(String... intArrays) {
        int Sum;
        for(int i = 0; i< intArrays.length; i++) {
            Sum += Integer.valueOf(intArrays[i]);
        }
        return Sum;
    }
}
