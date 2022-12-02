public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,10};

        System.out.println(Recursive.addArray(array,array.length));

        System.out.println(Recursive.maxFactor(24,16));

        System.out.println(Recursive.maxValue(array,array.length));


        Recursive.recamanCycle(7);

        String string = "francisco";

        System.out.println(Recursive.numberofC(string,string.length()));
    }
}