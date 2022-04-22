class BubbleSort:
    def iterative(arr):
        for i in range(len(arr)):
            for j in range(len(arr)):
                if arr[i] < arr[j]:
                    arr[i], arr[j] = arr[j],arr[i]
        return arr

arr = [53,21,52,14,63,31,52]
print(BubbleSort.iterative(arr))


