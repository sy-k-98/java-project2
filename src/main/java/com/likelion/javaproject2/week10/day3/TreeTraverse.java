package com.likelion.javaproject2.week10.day3;

public class TreeTraverse {
    private int nodes;
    private int[] arr;  // 이진 트리를 표현하기 위한 배열

    // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

    // 전위 순회 V -> L -> R
    // preorder(): System.out.print(V) -> preorder(L) -> preorder(R)
    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", ");   // 방문
            this.traversePreorder(node * 2);      // 왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            this.traversePreorder(node * 2 + 1);  // 오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출
        }
    }

    // 중위 순회 L -> V -> R
    // inorder(): inorder(L) -> System.out.print(V) -> inorder(R)
    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2);      // 왼쪽 자식(i * 2)을 루트로 다시 inorder 호출
            System.out.print(arr[node] + ", ");   // 방문
            this.traverseInorder(node * 2 + 1);  // 오른쪽 자식(i * 2 + 1)을 루트로 다시 inorder 호출
        }
    }

    // 후위 순회 L -> R  -> V
    // postorder(): postorder(L) -> postorder(R) -> System.out.print(V)
    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2);      // 왼쪽 자식(i * 2)을 루트로 다시 postorder 호출
            this.traversePostorder(node * 2 + 1);  // 오른쪽 자식(i * 2 + 1)을 루트로 다시 postorder 호출
            System.out.print(arr[node] + ", ");   // 방문
        }
    }

    public static void main(String[] args) {
        TreeTraverse tree = new TreeTraverse();
        tree.setArr(new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });

        tree.traversePreorder(1);
        System.out.println();
        tree.traverseInorder(1);
        System.out.println();
        tree.traversePostorder(1);
        System.out.println();
    }


}
