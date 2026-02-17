public class HeapSort {
    int[] heap;
    int heapCapacity;

    public HeapSort(int[] arr) {
        heap = arr;
        heapCapacity = arr.length - 1;
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

        if(leftChild <= heapCapacity && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }
        if(rightChild <= heapCapacity && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        if(largest != index) {
            swap(largest, index);
            heapify(largest);
        }
    }

    public void buildHeap() {
        for(int i=0; i < (heapCapacity + 1 / 2); i++) {
            heapify(i);
        }
        printHeap();
    }

    public void extractMax() {
        swap(0, heapCapacity);
        heapCapacity--;
        heapify(0);
    }

    public void heapSort() {
        while(heapCapacity >= 0) {
            extractMax();
        }
        heapCapacity = heap.length - 1;
        printHeap();
    }

    public void printHeap() {
        for(int i=0; i<=heapCapacity; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort exm = new HeapSort(new int[] {4,10,3,5,1});
        exm.buildHeap();
        exm.heapSort();
    }
}
