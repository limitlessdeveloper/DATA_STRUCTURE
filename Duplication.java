
void printRepeating( int arr[], int n)
{
    // First check all the values that are
    // present in an array then go to that
    // values as indexes and increment by
    // the size of array
    for (int i = 0; i < n; i++)
    {
        int index = arr[i] % n;
        arr[index] += n;
    }
 
    // Now check which value exists more
    // than once by dividing with the size
    // of array
    for (int i = 0; i < n; i++)
    {
        if ((arr[i]/n) > 1)
            cout << i << " ";
    }
}
 
// Driver's code
int main()
{
    int arr[] = {1, 6, 3, 1, 3, 6, 6};
    int arr_size = sizeof(arr)/sizeof(arr[0]);
 
    cout << "The repeating elements are: \n";
    printRepeating( arr, arr_size);
    return 0;
} 	