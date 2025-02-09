import java.util.Scanner;

public class StaticArray {
    int max_number_of_elements = -1;
    int pointer = -1;
    int[] array = null;
    int number_of_elements = 0;
    int ELEMENT_SIZE = 4;

    public StaticArray(int max_number_of_elements) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nCreating new <StaticArray> obj...");
        init_static_array(max_number_of_elements);
        Thread.sleep(1000);
        System.out.println("\nSuccessfully created <StaticArray> obj with array[" + this.max_number_of_elements + "].");
    }

    private void init_static_array(int max_number_of_elements) throws InterruptedException {
        if (max_number_of_elements < 1) {
            Thread.sleep(1500);
            System.out.println("\nCannot create static array with max number of elements < 1.");
            Scanner scanner = new Scanner(System.in);
            Thread.sleep(1000);
            System.out.print("\tPlease enter a valid array size: ");
            int input_array_size = scanner.nextInt();
            while (input_array_size < 1) {
                System.out.println("\nCannot create static array with max number of elements < 1.");
                Thread.sleep(1000);
                System.out.print("\tPlease enter a valid array size: ");
                input_array_size = scanner.nextInt();
            }
            scanner.close();
            this.max_number_of_elements = input_array_size;
            this.array = new int[this.max_number_of_elements];
        } else {
            this.max_number_of_elements = max_number_of_elements;
            this.array = new int[this.max_number_of_elements];
        }
    }

    private boolean is_null() {
        if (this.array == null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean is_empty() {
        if (this.pointer == -1 && this.array != null) {
            return true;
        } else {
            return false;
        }
    }
}