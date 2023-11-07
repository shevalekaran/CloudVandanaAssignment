// A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. CandidateName = Karan_Shewale www.shevalekaran1@gmail.com
  

import java.util.Random;

public class ArrayShuffler {
public static void main(String[] args) {
int[] array = {1, 2, 3, 4, 5, 6, 7};
        
shuffleArray(array);

for (int num : array) {
System.out.print(num + " ");
    }
    }
public static void shuffleArray(int[] array) {
Random rand = new Random();
        
for (int i = array.length - 1; i > 0; i--) {
     int j = rand.nextInt(i + 1);
     int temp = array[i];
     array[i] = array[j];
     array[j] = temp;
    }
    }
    }


//OUTPUT = 7 1 5 2 4 6 3
