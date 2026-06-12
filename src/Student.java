class Student implements Cloneable {

    String name;
    int age;
    int[] marks;

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Shallow Copy using clone()
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep Copy Method
    Student deepCopy() {
        int[] newMarks = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            newMarks[i] = marks[i];
        }

        return new Student(name, age, newMarks);
    }

    void display() {
        System.out.println(name + " " + age);
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        int[] arr = {90, 80, 70};

        Student s1 = new Student("Ayush", 22, arr);

        // Shallow Copy
        Student s2 = (Student) s1.clone();

        // Deep Copy
        Student s3 = s1.deepCopy();

        s2.marks[0] = 50;
        s3.marks[1] = 40;

        System.out.println("Original:");
        s1.display();

        System.out.println("Shallow Copy:");
        s2.display();

        System.out.println("Deep Copy:");
        s3.display();
    }
}