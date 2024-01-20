package com.leetcode.leetcodejava.easy.ex0027;

public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};

        int val = 3;

        int newLength = removeElementIdealSolution(nums, val);

        System.out.println("O novo comprimento do array é: " + newLength);

        System.out.println("O array após a remoção é: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static int removeElementBruteForceSolution(int[] nums, int val) {

        // Cria um novo array com o mesmo tamanho do array original
        int[] newArray = new int[nums.length];

        // Inicializa um contador para rastrear a posição atual no novo array
        int j = 0;

        // Itera sobre cada elemento do array original
        for (int i = 0; i < nums.length; i++) {

            // Se o elemento atual não é igual ao valor que queremos remover
            if (nums[i] != val) {
                // Adiciona o elemento ao novo array na posição atual
                newArray[j] = nums[i];
                // Incrementa o contador
                j++;
            }
        }

        // Copia os elementos do novo array de volta para o array original
        for (int i = 0; i < j; i++) {
            nums[i] = newArray[i];
        }

        // Retorna o novo comprimento do array
        return j;
    }

    public static int removeElementIdealSolution(int[] nums, int val) {

        // Inicializa o contador para a nova posição do array
        int i = 0;

        // Itera sobre o array
        for (int j = 0; j < nums.length; j++) {

            // Se o elemento atual não é o valor que queremos remover
            if (nums[j] != val) {
                // Movemos esse elemento para a posição i
                nums[i] = nums[j];
                // Incrementa o contador
                i++;
            }
        }

        // O novo comprimento do array é i
        return i;
    }
}
