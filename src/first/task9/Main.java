package first.task9;

public class Main {

    public static void main(String[] args) {
        int year, month, day;
        year = 2020;
        month = 2;
        day = 29;
        if (month == 1 || month == 3 || month == 5 || month == 1 || month == 7
                || month == 8 || month == 10) {
            if (!(1 > day) && !(day > 30)) {
                day++;
                System.out.println(year + "." + month + "." + day);
            } else if (day == 31) {
                day = 1;
                month++;
                System.out.println(year + "." + month + "." + day);
            }
        } else if (month == 2) {
            if (!(0 > year) && !(year > 3000))
                if (year % 400 == 0) {
                    if (!(1 > day) && !(day > 28)) {
                        day++;
                        System.out.println(year + "." + month + "." + day);
                    } else if (day == 29) {
                        day = 1;
                        month++;
                        System.out.println(year + "." + month + "." + day);
                    }
                } else if (year % 4 == 0 && year % 100 != 0) {
                    if (!(1 > day) && !(day > 28)) {
                        day++;
                        System.out.println(year + "." + month + "." + day);
                    } else if (day == 29) {
                        day = 1;
                        month++;
                        System.out.println(year + "." + month + "." + day);
                    }
                } else {
                    if (!(1 > day) && !(day > 27)) {
                        day++;
                        System.out.println(year + "." + month + "." + day);
                    } else if (day == 28) {
                        day = 1;
                        month++;
                        System.out.println(year + "." + month + "." + day);
                    }
                }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (!(1 > day) && !(day > 29)) {
                day++;
                System.out.println(year + "." + month + "." + day);
            } else if (day == 30) {
                day = 1;
                month++;
                System.out.println(year + "." + month + "." + day);
            }
        } else if (month == 12) {
            if (!(1 > day) && !(day > 30)) {
                day++;
                System.out.println(year + "." + month + "." + day);
            } else if (day == 31) {
                day = 1;
                year++;
                month = 1;
                System.out.println(year + "." + month + "." + day);
            }
        }
    }
}
