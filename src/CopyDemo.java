class CopyDemo implements Cloneable {

    int[] arr = {10, 20, 30};

    // Shallow Copy
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep Copy
    CopyDemo deepCopy() {
        CopyDemo obj = new CopyDemo();
        obj.arr = arr.clone();   // new array banega
        return obj;
    }

    public static void main(String[] args) throws Exception {

        CopyDemo obj1 = new CopyDemo();

        CopyDemo obj2 = (CopyDemo) obj1.clone();   // shallow
        CopyDemo obj3 = obj1.deepCopy();           // deep

        obj2.arr[0] = 99;
        obj3.arr[1] = 77;

        System.out.println("Original:");
        System.out.println(obj1.arr[0] + " " + obj1.arr[1]);

        System.out.println("Shallow Copy:");
        System.out.println(obj2.arr[0] + " " + obj2.arr[1]);

        System.out.println("Deep Copy:");
        System.out.println(obj3.arr[0] + " " + obj3.arr[1]);
    }
}