// Camilla Novaes Mendes - 202011231

import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(int data, char c, HuffmanNode left, HuffmanNode right) {
        this.data = data;
        this.c = c;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public int compareTo(HuffmanNode node) {
        return data - node.data;
    }
}

public class HuffmanCompression {
    private static HashMap<Character, String> huffmanCodes;
    private static HuffmanNode root;

    public static void main(String[] args) {
        String text = "Yo soy inevitable";

        huffmanCodes = new HashMap<>();
        String encodedText = compress(text);
        System.out.println("Encoded text: " + encodedText);

        String decodedText = decompress(encodedText);
        System.out.println("Decoded text: " + decodedText);
    }

    public static String compress(String text) {
        int[] frequency = buildFrequencyTable(text);
        root = buildHuffmanTree(frequency);
        buildHuffmanCodes(root, new StringBuilder());

        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCodes.get(c));
        }

        return encodedText.toString();
    }

    public static String decompress(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode current = root;

        for (int i = 0; i < encodedText.length(); i++) {
            if (encodedText.charAt(i) == '0') {
                current = current.left;
            } else {
                current = current.right;
            }

            if (current.isLeaf()) {
                decodedText.append(current.c);
                current = root;
            }
        }

        return decodedText.toString();
    }

    private static int[] buildFrequencyTable(String text) {
        int[] frequency = new int[256];

        for (char c : text.toCharArray()) {
            frequency[c]++;
        }

        return frequency;
    }

    private static HuffmanNode buildHuffmanTree(int[] frequency) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();

        for (char c = 0; c < 256; c++) {
            if (frequency[c] > 0) {
                priorityQueue.offer(new HuffmanNode(frequency[c], c, null, null));
            }
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode parent = new HuffmanNode(left.data + right.data, '\0', left, right);
            priorityQueue.offer(parent);
        }

        return priorityQueue.poll();
    }

    private static void buildHuffmanCodes(HuffmanNode node, StringBuilder code) {
        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            huffmanCodes.put(node.c, code.toString());
        }

        code.append('0');
        buildHuffmanCodes(node.left, code);
        code.deleteCharAt(code.length() - 1);

        code.append('1');
        buildHuffmanCodes(node.right, code);
        code.deleteCharAt(code.length() - 1);
    }
}