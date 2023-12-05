public class test {
    public static void main(String[] args) {
        String tempString = "";
        char output = 'f';

        String line = "zclvhfz91zbdkrreightbzqttdxrone";
        String[] listIn = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "1", "2", "3", "4",
                "5", "6", "7", "8", "9" };

        for(int i = 0; i < line.length(); i++){

            for (String number : listIn) {
                if(line.charAt(i) == number.charAt(0)){
                    if(Character.isDigit(line.charAt(i))) {
                        output = line.charAt(i);
                        System.out.println("Digit output: " + output);
                    }
                }

                try{
                    if(line.charAt(i) == number.charAt(0)){
                        if(line.charAt(i+1) == number.charAt(1)){
                            int num  = 0;
                            int numOut = 0;
                            for(String answer : listIn){
                                num++;
                                if(answer.equals(number)){
                                    numOut = num;
                                }
                            }
                            System.out.println("Letter output: " + numOut);
                        }
                    }
                } catch (StringIndexOutOfBoundsException e) {

                }
            }
        }

        System.out.println("Output: "+ output);
    }
}
