# from operator import index


class SelectionSort:
  def __init__(self,arr):
      self.arr = arr
  def iterative(arr):
      for i in range(len(arr)):
          min_ind  = i
          for j in range(i+1,len(arr)):
              if arr[j] < arr[min_ind]:
                  min_ind = j
          arr[min_ind],arr[i] = arr[i],arr[min_ind]
      return arr
print(SelectionSort.iterative([5,2,5,1,6,1,3]))