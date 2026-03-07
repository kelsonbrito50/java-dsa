# 🧠 Java DSA — Data Structures & Algorithms

[![CI](https://github.com/kelsonbrito50/java-dsa/actions/workflows/ci.yml/badge.svg)](https://github.com/kelsonbrito50/java-dsa/actions)
![algorithms](https://img.shields.io/badge/algorithms-30+-blue)
![Java](https://img.shields.io/badge/Java-17+-orange)

Interview prep implementations in **Java 17** with JUnit 5 tests and complexity analysis.

## 📋 Catalog

| Category | Algorithm | Complexity | File |
|---|---|---|---|
| 📦 Arrays | Two Sum (HashMap) | O(n) | [arrays/TwoSum.java](src/arrays/TwoSum.java) |
| 📦 Arrays | Sliding Window (max sum) | O(n) | [arrays/SlidingWindow.java](src/arrays/SlidingWindow.java) |
| 📦 Arrays | Kadane's Algorithm | O(n) | [arrays/Kadane.java](src/arrays/Kadane.java) |
| 📦 Arrays | Two Pointers | O(n) | [arrays/TwoPointers.java](src/arrays/TwoPointers.java) |
| 🔤 Strings | Anagram, Reverse, First Unique | O(n) | [strings/StringOps.java](src/strings/StringOps.java) |
| 🔗 Linked Lists | Singly (push, pop, reverse) | O(1)/O(n) | [linkedlists/SinglyLinkedList.java](src/linkedlists/SinglyLinkedList.java) |
| 📚 Stacks | Stack + Valid Parentheses | O(1) | [stacks/StackProblems.java](src/stacks/StackProblems.java) |
| 📬 Queues | Queue (ArrayDeque-based) | O(1) | [queues/QueueProblems.java](src/queues/QueueProblems.java) |
| #️⃣ Hash Maps | Custom HashMap (open addressing) | O(1) avg | [hashmaps/CustomHashMap.java](src/hashmaps/CustomHashMap.java) |
| 🌳 Trees | BST (insert, search, in-order) | O(log n) | [trees/BinarySearchTree.java](src/trees/BinarySearchTree.java) |
| ⛰️ Heaps | Kth Largest, Top K Frequent | O(n log k) | [heaps/HeapProblems.java](src/heaps/HeapProblems.java) |
| 🌐 Graphs | BFS, DFS (iterative + recursive) | O(V+E) | [graphs/GraphTraversals.java](src/graphs/GraphTraversals.java) |
| 📊 Sorting | Quick Sort (in-place) | O(n log n) | [sorting/QuickSort.java](src/sorting/QuickSort.java) |
| 📊 Sorting | Merge Sort | O(n log n) | [sorting/MergeSort.java](src/sorting/MergeSort.java) |
| 📊 Sorting | Heap Sort | O(n log n) | [sorting/HeapSort.java](src/sorting/HeapSort.java) |
| 🔍 Searching | Binary Search | O(log n) | [searching/BinarySearch.java](src/searching/BinarySearch.java) |
| 🧮 Matrix | Rotate 90°, Spiral Order | O(n²) | [matrix/MatrixOps.java](src/matrix/MatrixOps.java) |
| 🔄 DP | Fibonacci, Climbing Stairs | O(n) | [dynamicprogramming/Fibonacci.java](src/dynamicprogramming/Fibonacci.java) |
| 🔙 Backtracking | Permutations, Subsets | O(n!/2^n) | [backtracking/Permutations.java](src/backtracking/Permutations.java) |

## 🚀 Run

```bash
# Compile
javac -d out src/**/*.java

# Run tests
java -cp out:lib/* org.junit.platform.console.ConsoleLauncher --scan-classpath

# Or with Gradle (recommended)
./gradlew test
```

## 💡 Patterns Learned

- **Two pointers** eliminates O(n²) brute force on sorted arrays — always ask "is it sorted?"
- **Sliding window** replaces nested loops for subarray/substring problems
- **Kadane's** is a rolling max — once you see it, you can't unsee it
- **BFS** = shortest path (unweighted), **DFS** = explore all paths
- **Dynamic programming** = recursion + memoization → start top-down, optimize bottom-up
- **Backtracking** = DFS on a decision tree — add, recurse, undo
- **PriorityQueue** solves any "top K" problem efficiently (min-heap by default in Java)
- **Valid parentheses** is the canonical stack problem — learn the pattern, solve 10 variants

## 📊 Progress

Daily problem-solving log — one problem per day, every day.

| Date | Problem | Category | Difficulty |
|---|---|---|---|
| 2026-03-07 | Two Sum | Arrays | Easy |

## License

MIT
