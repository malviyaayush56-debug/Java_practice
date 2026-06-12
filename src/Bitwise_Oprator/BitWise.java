void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Enter a Number: ");
    int n = sc.nextInt();

    int temp = n;   // original value safe rakhne ke liye
    int count = 0;

    while (temp != 0) {
        if ((temp & 1) != 0) {
            count++;
        }
        temp = temp >> 1;
    }

    IO.println("Set bit count: " + count);

    // Even/Odd check (optional)
    if ((n & 1) == 0) {
        IO.println("Even");
    } else {
        IO.println("Odd");
    }
}