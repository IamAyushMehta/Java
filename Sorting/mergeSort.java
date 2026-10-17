void merge(int arr[], int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = 0;
    int temp[] = new int[high - low + 1];

    while (i <= mid && j <= high) {
        if (arr[i] < arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= high) {
        temp[k++] = arr[j++];
    }

    for (int x = 0; x < temp.length; x++) {
        arr[low + x] = temp[x];
    }
}

void mergeSort(int arr[], int low, int high) {
    if (low >= high) {
        return;
    }
    int mid = low + (high - low) / 2;
    mergeSort(arr, low, mid - 1);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
}

void main() {
    int arr[] = { 4, 2, 6, 1, 3 };
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
}