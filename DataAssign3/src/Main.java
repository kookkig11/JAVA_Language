public class Main {
    public static int postToOrder (int[] arrayBase, int node) {
        if(arrayBase[2*node] > 10)
            postToOrder(arrayBase,2*node);
        if(arrayBase[(2*node)+1] > 10)
            postToOrder(arrayBase,(2*node)+1);

        int left = arrayBase[2*node];
        int right = arrayBase[(2*node)+1];
        switch(arrayBase[node]){
            case '+':
                arrayBase[node] = left + right;
                break;
            case '-':
                arrayBase[node] = left - right;
                break;
            case '*':
                arrayBase[node] = left * right;
                break;
            case '/':
                arrayBase[node] = left / right;
                break;
        }
        return arrayBase[1];
    }

    public static void main(String[] args) {
        int[] arrayBase = {'x', '-', '/', '+', '*', '+', '*', 6, '+', 3, '-', 2, 3, '-', 'x', 'x', 3, 1, 'x', 'x', 9, 5, 'x', 'x', 'x', 'x', 7, 4};
        System.out.println(postToOrder(arrayBase, 1));
    }
}