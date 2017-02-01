package adder;

public class Main {

    public static void main(String[] args) {
        try {
                if (args.length < 3 || args.length > 3){
                    throw  InvalidLength;
                }
                else {
                    if (args[0] != "-" || (args[i] > "0" && args[i] < "9")) {
                        throw InvalidCharacter;
                    } else {
                        for (int i = 1; i < args.length; i++) {
                            if (args[i] > "0" && args[i] < "9")
                                else{
                                throw InvalidCharacter;
                            }
                        }
                    }
                }
            int result = addArguments(args);
            System.out.println(result);
        } catch (InvalidCharacter e) {
            System.err.println("Invalid Character");
        }
        catch (InvalidLength e) {
            System.err.println("Please enter 3 arguemnts");
        }
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1] + Integer.valueOf(args[2]);
    }
}
