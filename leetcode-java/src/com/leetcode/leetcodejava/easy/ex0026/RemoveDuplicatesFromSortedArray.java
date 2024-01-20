package com.leetcode.leetcodejava.easy.ex0026;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int uniqueElementsCount = removeDuplicatesIdealSolution(nums);

        System.out.println("Número de elementos únicos: " + uniqueElementsCount);

        System.out.print("Array após remover duplicatas: ");

        for (int i = 0; i < uniqueElementsCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicatesBruteForceSolution(int[] nums) {

        // Verifica se o array está vazio
        if (nums.length == 0) return 0;

        // Cria um novo array para armazenar os elementos únicos
        int[] uniqueNums = new int[nums.length];

        // Adiciona o primeiro elemento ao novo array
        uniqueNums[0] = nums[0];

        // Inicializa o contador de elementos únicos
        int count = 1;

        // Percorre o array original
        for (int i = 1; i < nums.length; i++) {
            // Se o elemento atual é diferente do último elemento no novo array
            if (nums[i] != uniqueNums[count - 1]) {
                // Adiciona o elemento ao novo array
                uniqueNums[count] = nums[i];
                // Incrementa o contador
                count++;
            }
        }

        // Copia os elementos únicos de volta para o array original
        for (int i = 0; i < count; i++) {
            nums[i] = uniqueNums[i];
        }

        // Retorna o número de elementos únicos
        return count;
    }

    public static int removeDuplicatesIdealSolution(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            int j = i;

            // Enquanto os elementos forem iguais, avança o índice j
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }

            // Substitui o elemento na posição k pelo elemento na posição i
            nums[k++] = nums[i];
            // Atualiza o índice i para j - 1
            i = j - 1;
        }

        // Retorna a quantidade de elementos únicos no array
        return k;
    }
}
