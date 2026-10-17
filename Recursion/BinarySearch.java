int binarySearch(int arr[], int tar, int low, int high) {
    if (low > high) {
        return -1;
    }
    int mid = low + (high - low) / 2;
    if (arr[mid] == tar) {
        return mid;
    } else if (arr[mid] < tar) {
        return binarySearch(arr, tar, mid + 1, high);
    } else {
        return binarySearch(arr, tar, low, mid - 1);
    }
}

void main() {
    int arr[] = { 1, 2, 3, 4, 5 };
    int tar = 2;
    IO.print(binarySearch(arr, tar, 0, arr.length - 1));
}
