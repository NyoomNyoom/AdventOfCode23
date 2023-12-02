public class test {
    public static void main(String[] args) {
        String tempString = "";
        char output = 'f';

        String line = "zclvhfz91zbdkrreightbzqttdxrone";
        String[] listIn = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "1", "2", "3", "4",
                "5", "6", "7", "8", "9" };

        int num = 0;

        for (String number : listIn) {
            num++;

            System.out.println(number);

            for (int i = 0; i < line.length(); i++) {
                if (number.charAt(0) == line.charAt(i)) {
                    if (Character.isDigit(line.charAt(i))) {
                        output = line.charAt(i);
                    }

                    try {
                        if (number.charAt(1) == line.charAt(i + 1)) {
                            output = (char) num;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        System.err.println("Whoops");
                    }

                }
            }
        }

        System.out.println(output);
    }
}
