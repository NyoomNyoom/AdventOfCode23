public class test {
    public static char findFirstNumber(String[] listIn, String line) {
        char output = 'f';
        for (int i = 0; i < line.length(); i++) {
            for (String number : listIn) {
                if (line.charAt(i) == number.charAt(0)) {
                    if (Character.isDigit(line.charAt(i))) {
                        output = line.charAt(i);
                        System.out.println("Digit output: " + output);
                        return output;
                    }
                }

                try {
                    if (line.charAt(i) == number.charAt(0)) {
                        if (line.charAt(i + 1) == number.charAt(1)) {
                            int num = 0;

                            for (String answer : listIn) {
                                num++;
                                if (answer.equals(number)) {
                                    output = (char) (num + '0');
                                }
                            }
                            System.out.println("Letter output: " + output);
                            return output;
                        }
                    }
                } catch (StringIndexOutOfBoundsException e) {

                }
            }
        }

        return output;
    }

    public static char findLastNumber(String[] listIn, String line) {
        char output = 'n';

        for (int i = 0; i < line.length(); i++) {
            for (String number : listIn) {
                if (line.charAt(i) == number.charAt(0)) {
                    if (Character.isDigit(line.charAt(i))) {
                        output = line.charAt(i);
                    }
                }

                try {
                    if (line.charAt(i) == number.charAt(0)) {
                        if (line.charAt(i + 1) == number.charAt(1)) {
                            int num = 0;

                            for (String answer : listIn) {
                                num++;
                                if (answer.equals(number)) {
                                    output = (char) (num + '0');
                                }
                            }
                        }
                    }
                } catch (StringIndexOutOfBoundsException e) {

                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String tempString = "";
        char output = 'f';

        String line = "zclvsevenhfz91zbdkrreightbzqttdxrone";
        String[] listIn = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "1", "2", "3", "4",
                "5", "6", "7", "8", "9" };

        char firstNum = findFirstNumber(listIn, line);
        char lastNum = findLastNumber(listIn, line);

        System.out.println("First number: " + firstNum + ", last number: " + lastNum);

    }
}
