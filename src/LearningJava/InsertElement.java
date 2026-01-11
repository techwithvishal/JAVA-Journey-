
//🔹 Case 1: New Array bana kar element insert karna (Basic / Exam way)
//👉 Problem:
//
//Array me ek element insert karna hai (index pe).
//
//        🔹 Logic:
//Naya array banao (size +1)
//Insert position tak copy
//Element insert karo
//Baaki elements copy karo


package LearningJava;

public class InsertElement {
    public static void main(String[] args) {

        // Original array
        int[] arr = {10, 20, 30, 40};

        // Insert karne wala element
        int element = 25;

        // Jis index par insert karna hai
        int index = 2;

        // New array (size + 1)
        int[] newArr = new int[arr.length + 1];

        // Index se pehle ke elements copy
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Element insert
        newArr[index] = element;

        // Baaki elements shift karke copy
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // 🔹 NORMAL for loop se array print
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
