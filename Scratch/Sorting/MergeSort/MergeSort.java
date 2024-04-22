package Scratch.Sorting.MergeSort;

import java.util.LinkedList;

public class MergeSort {
    public void sortList(LinkedList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        int middle = list.size() / 2;
        LinkedList<Integer> left = new LinkedList<>(list.subList(0, middle));
        LinkedList<Integer> right = new LinkedList<>(list.subList(middle, list.size()));

        sortList(left);
        sortList(right);

        merge(list, left, right);
    }

    private void merge(LinkedList<Integer> list, LinkedList<Integer> left, LinkedList<Integer> right) {
        int leftIndex = 0, rightIndex = 0, index = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                list.set(index++, left.get(leftIndex++));
            } else {
                list.set(index++, right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            list.set(index++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            list.set(index++, right.get(rightIndex++));
        }
    }

    public static void main(String[] args) {
        MergeSort solution = new MergeSort();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(25);
        list.add(8);
        list.add(72);
        list.add(73);

        solution.sortList(list);

        System.out.println("Lista ordenada:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
