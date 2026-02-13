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

        if(leftChild <= heapSize && heap[leftChild] < heap[index]) {
            index = leftChild;
        }
        if(rightChild <= heapSize && heap[rightChild] < heap[index]) {
            index = rightChild;
        }

        if(largest != index) {
            swap(largest, index);
            heapify(index);
        }
    }

    public void buildHeap() {
        for(int i=((heapSize/2) - 1); i<=0; i--) {
            heapify(i);
        }

        for(int i=0; i<heap.length; i++) {
            System.out.println(heap[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10,5,7,3,71};

        HeapImp heapImp = new HeapImp(arr);
        heapImp.buildHeap();
    }
}
