//The sum of all the multiples of 3 or 5 below 1000

class Multiples3and5 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0)
                total += i;
        }
        System.out.println(total);
    }
}