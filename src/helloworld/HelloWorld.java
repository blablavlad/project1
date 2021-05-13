package helloworld;

public class HelloWorld {
    public static void main (String[] args){
      String message = "Hello world!";
//        System.out.println("Hello world!");
//        System.out.println("123");
//        System.out.println(message);
        int i = 6;
        int j = 7;
        double answer = (double) j / (double) i;
        boolean isMoreThanOne;
        if (answer > 1) {
            isMoreThanOne = true;
        }
        else {
            isMoreThanOne = false;
        }
        System.out.println(isMoreThanOne);
//        String stringAnswer = answer +  " " + message;
//        System.out.println(stringAnswer);
    }
}