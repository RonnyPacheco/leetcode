# Trees in Data Structures

Trees are a fundamental data structure used in computer science to represent hierarchical relationships. Imagine a family tree where each person is connected to their descendants—trees in data structures are quite similar.

## Key Concepts

- **Node**: Each element in a tree is called a node.
- **Root**: The top node of the tree; it doesn't have a parent.
- **Child**: A node that descends from another node.
- **Parent**: A node that has children nodes.
- **Leaf**: A node that has no children.
- **Edge**: The connection between two nodes.

## Types of Trees

- **Binary Tree**: Each node has at most two children, referred to as left and right.
- **Binary Search Tree (BST)**: A binary tree where the left child contains values less than the parent, and the right child contains values greater than the parent.
- **AVL Tree**: A self-balancing binary search tree where the difference in height between left and right subtrees is no more than one for any node.
- **Red-Black Tree**: Another self-balancing binary search tree with a different balancing mechanism.
- **B-Tree**: A self-balancing tree data structure that maintains sorted data and allows searches, sequential access, insertions, and deletions in logarithmic time.

## Operations

- **Insertion**: Adding a node to the tree.
- **Deletion**: Removing a node from the tree.
- **Traversal**: Visiting all nodes in a specific order (e.g., in-order, pre-order, post-order).

## Example

Here’s a simple example of a Binary Search Tree:
       
         8
      /     \
     3       10
    /  \        \
    1   6       14
        / \     /
        4  7   13

In this tree:
- The root is 8.
- Node 3 is the left child of 8, and node 10 is the right child of 8.
- Node 1 is a leaf.

Feel free to explore each concept further or ask if you have any questions!
