package com.leetcode.leetcodejava.easy.ex0035;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        int target = 5;

        int index = searchInsertIdealSolution(nums, target);

        System.out.println("O índice de inserção é: " + index);
    }

    public static int searchInsertBruteForceSolution(int[] nums, int target) {

        // Percorre o array elemento por elemento
        for (int i = 0; i < nums.length; i++) {

            // Se o elemento atual é maior ou igual ao alvo
            if (nums[i] >= target) {
                // Retorna o índice do elemento atual
                return i;
            }
        }
        // Se o alvo é maior que todos os elementos, retorna o tamanho do array
        return nums.length;
    }

    public static int searchInsertIdealSolution(int[] nums, int target) {

        // Inicializa os ponteiros para o início e fim do array
        int low = 0;
        int high = nums.length - 1;

        // Enquanto o ponteiro inicial for menor ou igual ao ponteiro final
        while (low <= high) {

            // Calcula o índice médio
            int mid = low + (high - low) / 2;

            // Se o valor no índice médio for igual ao valor alvo, retorna o índice médio
            if (nums[mid] == target) {
                return mid;
            // Se o valor no índice médio for menor que o valor alvo, move o ponteiro inicial para a direita do meio
            } else if (nums[mid] < target) {
                low = mid + 1;
            // Se o valor no índice médio for maior que o valor alvo, move o ponteiro final para a esquerda do meio
            } else {
                high = mid - 1;
            }
        }

        // Se o valor alvo não for encontrado após a busca, retorna o ponteiro inicial
        // Isso representa o índice onde o valor alvo poderia ser inserido para manter o array ordenado
        return low;
    }
}
