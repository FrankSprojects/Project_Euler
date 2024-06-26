public class Sunday {
    public static void main(String[] args) {
        int count = 0;
        int dayStartOfMonth = 6;
        int[] howManyDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int startMonth = 1;
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                if (month == 2) {
                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))//for leap year
                        howManyDays[1] = 29;
                    else
                        howManyDays[1] = 28;
                }
                int index = month - 2;
                if (month == 1)
                    index = 11;
                dayStartOfMonth = (dayStartOfMonth + (howManyDays[index] % 28)) % 7;// Month Current
                if (dayStartOfMonth == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}



