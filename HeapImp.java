
public class HeapImp {
    int heapSize;
    int heap[];

    public HeapImp(int[] heap) {
        this.heap = heap;
        this.heapSize = heap.length - 1;
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp; 
    }
    
    public void heapify(int index) {
        int largest = index;
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;
        if(leftChild <= heapSize && heap[leftChild] > heap[index]) {
            index = leftChild;
        }
        if(rightChild <= heapSize && heap[rightChild] > heap[index]) {
            index = rightChild;
        }

        if(largest != index) {
            swap(largest, index);
            heapify(index);
        }
    }

    public int extractMax() {
        int max = heap[0];
        swap(heapSize, 0);
        heapSize--;
        heapify(0);
        printHeap();
        return max;
    }

    public void increaseElement(int index, int value) {
        heap[index] = value;

        int parentInd = (int) (Math.ceil(index/2.0)) - 1;

        while(parentInd >= 0 && heap[index] > heap[parentInd]) {
            if(heap[parentInd] > heap[index]) {
                break;
            }
            swap(parentInd, index);
            index = parentInd;
            parentInd = (int) (Math.ceil(index/2)) - 1;
        }
        printHeap();
    }

    public void decreaseElement(int index, int value) {
        if(index < 0 || index > heapSize) return;

        heap[index] = value;
        heapify(index);
        printHeap();
    }

    public void buildHeap() {
        for(int i=((heapSize/2) - 1); i>=0; i--) {
            heapify(i);
        }
    }

    public void printHeap() {
        for(int i=0; i<=heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10,5,7,3,71};
        HeapImp heapImp = new HeapImp(arr);
        heapImp.buildHeap();
        heapImp.printHeap();
        // int max = heapImp.extractMax();
        // System.out.println(max);
        // heapImp.increaseElement(3, 15);
        heapImp.decreaseElement(0, 4);
    }
}
