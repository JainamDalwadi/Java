class sample {
    int x, y;

    void sum() { // Change return type to void
        System.out.println(x + y);
    }

    sample() {
        x = 4;
        y = 5;
    }

sample(int p, int q){
x=p;
y=q;
}
}
class summation {
    public static void main(String args[]) {
System.out.println("Calling default constructor");

        sample a = new sample();
        a.sum(); // Call the sum method to print the sum of x and y
System.out.println("Calling perametarized constructor");

     sample b = new sample(8,8);
     b.sum();
    }
}
