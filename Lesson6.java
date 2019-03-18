public class Lesson6 {
    public static void main(String[] args) {
        int[]myRef = {1,2,3};
        System.out.print("Array(myRef): ");
        for(int array: myRef){
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.println("HashCodeMyRef: " + myRef.hashCode());
        int []arrayRef = myRef;
        arrayRef[0] = 2;
        System.out.print("Array(arrayRef): ");
        for(int array: arrayRef){
            System.out.print(array + " ");
        }
        System.out.println();
        int [] newArray = {4,5};
        arrayRef = newArray;
        System.out.println("HashCodeNewArray: " + newArray.hashCode());
        testRef(myRef);
        System.out.print("Array(myRef): ");
        for(int array: myRef){
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.println("HashCodeMyRef: " + myRef.hashCode());


    }
    static void testRef(int [] arrayRef){
        System.out.print("HashCodeArrayRef: " + arrayRef.hashCode());
        System.out.println();
    }
}
