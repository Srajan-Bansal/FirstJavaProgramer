package com.company;

public class Practise_Set6 {
    public static void main(String[] args) {

        // Problem 1
//        int [] marks = { 92, 74, 76, 69, 88};
//        int sum = 0;
//        for (int element:marks){
//            sum = sum + element;
//        }
//        System.out.println("The sum of Array is " + sum);

//         Problem 2
//           int [] a = { 1, 2, 3, 4, 5};
//           int num = 2;

//        case 1 :
//        for (int i=0; i<a.length; i++){
//            if (a[i]==num){
//                System.out.println("Value is found at index: " + i);
//            }
//        }


//        case 2 :
//           boolean isInArray = false;
//           for (int element:a){
//               if(num==element){
//                   isInArray = true;
//                   break;
//               }
//           }
//           if (isInArray){
//              System.out.println("The value is present in the Array");
//           }
//           else {
//              System.out.println("The value is not present in the Array");
//            }



          // Problem 3
//        int [] marks = {1,2,3,40,5};
//        float sum = 0;
//        for (int element:marks){
//            sum = sum + element;
//        }
//        System.out.println("The average of marks is " + sum/ marks.length);


        // Problem 4
//        int [][] mat1 = {{1,0,0},
//                          {0,1,0},
//                           {0,0,1}};
//        int [][] mat2 = {{1,0,0},
//                          {0,1,0},
//                           {0,0,1}};
//        int [][] result = {{0,0,0},
//                            {0,0,0},
//                             {0,0,0}};
//        for (int i=0; i<mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }


        // Problem 5
//        int [] arr = {1,2,3,4,5};
//        int n = Math.floorDiv(arr.length,2);
//        for (int i=0; i<n; i++){
//            // Swap a[i] and a[l-i-1]
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        for (int element:arr){
//            System.out.print(element+" ");
//        }


        // Problem 6
//        int [] arr = {1,2,3,4,5,-2100};
//        int max = 0;
//        for(int element:arr) {
//            if (element > max) {
//                max = element;
//            }
//        }
//        System.out.println("The maximum value in arr is " + max);


        // Problem 7
//        int [] arr = {1,2,3,4,5,-2100};
//        int min = Integer.MIN_VALUE;
//        for(int element:arr) {
//            if (element < min) {
//                min = element;
//            }
//        }
//        System.out.println("The maximum value in arr is " + min);


        // Problem 8
        int [] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted");
        } else {
            System.out.println("The Array is not Sorted");
        }
    }
}
