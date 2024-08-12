class sample {
    int x, y;

    void sum() { // Change return type to void
        System.out.println(x + y);
    }

    sample() {
        x = 4;
        y = 5;
    }
}

class summation {
    public static void main(String args[]) {
        sample a = new sample();
        a.sum(); // Call the sum method to print the sum of x and y
    }
}
