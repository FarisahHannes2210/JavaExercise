package Week3.ProgrammingExercise_5Dec;

 class MultiDimensionalArray {

    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
    };

    public MultiDimensionalArray(int[][] matrix){
        this.matrix = matrix;
    }

    //dont use this one welps
    int printLengthOfTheArray() {

        int countArray = 0;

        for(int row = 0; row < matrix.length; row++){

            for( int col = 0; col < matrix.length; col++){

               countArray++;
            }
        }

        return countArray;
    }

// print length of array
    public int printLengthOfSubArray(){

        int countSubArray = 0;

        for(int row = 0; row < matrix.length; row++){
            countSubArray++;

        }
        return countSubArray;
    }

    //Create Arrays for Different Data Types: Write a Java program that declares and initialises
    //arrays for the following data types without explicitly setting their values:
    //1. int
    //2. double
    //3. char
    //4. boolean
    //5. String

    //Arrays with different data types


    public void printLengthSubArray2(){

        int count = 1;
        for(int row = 0; row < matrix.length; row++){

               System.out.println("Array " + count++ + ": " + matrix[row].length);

        }

    }

    //print matrix in orderly manner
    void printMatrix(){
        for(int row = 0; row < matrix.length; row++){

            for(int col = 0; col < matrix[row].length; col++){

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MultiDimensionalArray obj = new MultiDimensionalArray(new int[][]{{1, 2, 3}, {4, 5, 6, 7}, {8, 9}});

//        System.out.println("Length of The Array: " + obj.printLengthOfTheArray());

        System.out.println("Length of Array: " + obj.printLengthOfSubArray());

        System.out.println("Length of Sub Array");
        obj.printLengthSubArray2();

        System.out.println("Matrix: ");
        obj.printMatrix();

    }

}
