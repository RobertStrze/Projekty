public class Lesson6 {
    public static void main(String[] args) {
        int[]myRef = {1,2,3};
        testRef(myRef);
        System.out.println("HashCodeMyRef: " + myRef.hashCode());
        System.out.print("MyRef: ");
        for(int array: myRef){
            System.out.print(array + " ");
        }

    }
    static void testRef(int [] arrayRef){
        System.out.print("HashCodeArrayRef: " + arrayRef.hashCode());
        System.out.println();
        arrayRef[0] = 2;
        arrayRef = new int[]{4,5};
        System.out.println("HashCodeArrayRef: " + arrayRef.hashCode());
        System.out.print("ArrayRef: ");
        for(int array: arrayRef){
            System.out.print(array + " ");
        }

        System.out.println();
    }
}
