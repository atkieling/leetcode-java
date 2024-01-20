package com.leetcode.leetcodejava.easy.ex0021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.followingNode = new ListNode(2);
        l1.followingNode.followingNode = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.followingNode = new ListNode(3);
        l2.followingNode.followingNode = new ListNode(4);

        ListNode result = mergeTwoListsIdealSolution(l1, l2);

        while (result != null) {

            System.out.print(result.val + " ");
            result = result.followingNode;
        }
    }

    // Classe para representar um nó em uma lista
    public static class ListNode {

        // Valor do nó
        int val;
        // Referência ao próximo nó na lista
        ListNode followingNode;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode followingNode) {
            this.val = val;
            this.followingNode = followingNode;
        }
    }

    public static ListNode mergeTwoListsBruteForceSolution(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        List<Integer> list = new ArrayList<>();

        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.followingNode;
        }
        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.followingNode;
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        for (int num : list) {
            current.followingNode = new ListNode(num);
            current = current.followingNode;
        }

        return dummy.followingNode;
    }

    public static ListNode mergeTwoListsIdealSolution(ListNode l1, ListNode l2) {

        // Se a lista 1 estiver vazia, retorne a lista 2
        if (l1 == null) return l2;
        // Se a lista 2 estiver vazia, retorne a lista 1
        if (l2 == null) return l1;

        ListNode handler;

        if (l1.val < l2.val) {
            // Se o valor de l1 for menor que o de l2, faz de l1 o próximo nó na lista mesclada
            handler = l1;
            // Faz uma chamada recursiva para mesclar o restante de l1 e l2
            handler.followingNode = mergeTwoListsIdealSolution(l1.followingNode, l2);
        } else {
            // Se o valor de l2 for menor ou igual ao de l1, faz de l2 o próximo nó na lista mesclada
            handler = l2;
            // Faz uma chamada recursiva para mesclar o restante de l1 e l2
            handler.followingNode = mergeTwoListsIdealSolution(l1, l2.followingNode);
        }

        // Retorna o nó inicial da lista mesclada
        return handler;
    }
}
