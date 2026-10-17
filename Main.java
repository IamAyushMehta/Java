int linearSearch(int arr[], int tar) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == tar) {
            return i;
        }
    }
    return -1;
}

int binarySearch(int arr[], int tar) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] < tar) {
            low = mid + 1;
        } else if (arr[mid] > tar) {
            high = mid - 1;
        } else {
            return mid;
        }
    }
    return -1;
}

int[] bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

int[] selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        int small = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[small] > arr[j]) {
                small = j;
            }
        }
        if (arr[i] > arr[small]) {
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
    }
    return arr;
}

int[] insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
        int curr = arr[i];
        int prev = i - 1;
        while (prev > 0 && arr[prev] > curr) {
            arr[prev + 1] = arr[prev];
            prev--;
        }
        arr[prev + 1] = curr;
    }
    return arr;
}

void main() {
    int arr[] = { 1, 5, 2, 1, 5, 7, 3 };
    // int tar = 7;
    // int res = linearSearch(arr, tar);
    // int res = binarySearch(arr, tar);
    // System.err.println(res);
    // bubbleSort(arr);
    // selectionSort(arr);
    insertionSort(arr);
    for (int x : arr) {
        System.err.print(x + " ");
    }
}