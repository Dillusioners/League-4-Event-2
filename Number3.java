class Number3 {
    public static boolean isReversible(long n) {

        long number = n;
        if (n % 10 == 0)
            return false;

        long reversed = 0;
        while (number > 0) {
            reversed = 10 * reversed + number % 10;
            number /= 10;
        }

        reversed += n;

        while (reversed > 0) {
            if ((reversed % 10) % 2 == 0)
                return false;
            reversed /= 10;
        }

        return true;
    }

    public static void main(String args[]) {
        int count = 0;
        int limit = 1000;
        for (long i = 1; i < limit; i++) {
            if (isReversible(i))
                count++;
        }
        System.out.println(count);
    }
}
