//B. Perform sorting of an array in descending order. CandidateName = Karan_Shewale www.shevalekaran1@gmail.com

function SortDesending(arr) {
    const length = arr.length;
    for (let i = 0; i < length - 1; i++) {
      for (let j = 0; j < length - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          // Swap the elements
          const temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
  
  // Example usage
  const array = [4, 2, 8, 1, 5];
  const sortedArray =  SortDesending(array);
  console.log(sortedArray);
  

  //OUTPUT = [ 8, 5, 4, 2, 1 ]
