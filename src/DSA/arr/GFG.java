package DSA.arr;


class Solution{
static int f(int arr[], int x, int n)
{
  int low = 0, high = n - 1,
      res = -1;
  while (low <= high)
  {
    int mid = (low + high) / 2;
    if (arr[mid] > x)
      high = mid - 1;
    else if (arr[mid] < x)
      low = mid + 1;
    else
    {
      res = mid;
      high = mid - 1;
    }
  }
  return res;
}
static int l(int arr[], int x, int n)
{
  int low = 0, high = n - 1,
      res = -1;
  while (low <= high)
  {
    int mid = (low + high) / 2;
    if (arr[mid] > x)
      high = mid - 1;
    else if (arr[mid] < x)
      low = mid + 1;
    else
    {
      res = mid;
      low = mid + 1;
    }
  }
  return res;
}
public static void main(String[] args) {
  int arr[] = {5,6,3,2,6,1,7,9};
  int n = arr.length;
  int x = 6;
  System.out.println("First Occurrence = " +
                      f(arr, x, n));
  System.out.println("Last Occurrence = " +
                      l(arr, x, n));
}
}