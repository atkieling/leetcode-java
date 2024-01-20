package com.leetcode.leetcodejava.easy.ex0028;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

        String haystack = "hello";
        String needle = "ll";

        int result = FindTheIndexOfTheFirstOccurrenceInAStringIdealSolution(haystack, needle);

        System.out.println("O índice da primeira ocorrência de '" + needle + "' em '" + haystack + "' é: " + result);
    }

    public static int FindTheIndexOfTheFirstOccurrenceInAStringBruteForceSolution(String haystack, String needle) {

        // Obtêm o comprimento das strings haystack e needle
        int L = needle.length(), n = haystack.length();

        // Percorre a string haystack do início ao fim
        for (int start = 0; start < n - L + 1; ++start) {

            // Para cada índice de início, obtêm uma substring de haystack do tamanho de needle e verifica se é igual à needle
            if (haystack.substring(start, start + L).equals(needle)) {
                // Se a substring for igual à needle, retorna o índice de início
                return start;
            }
        }

        // Se nenhuma correspondência for encontrada após percorrer toda a haystack, retorna -1
        return -1;
    }

    public static int FindTheIndexOfTheFirstOccurrenceInAStringIdealSolution(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
