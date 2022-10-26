package Kunal_Kushwaha.Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {
        if (this.isFull()) {
            // double the array
            int[] temp = new int[data.length * 2];

            // copy all the item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

//            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(3);

        stack.push(1);
        stack.push(2);
        stack.push(2);

        System.out.println(stack);
    }
}
