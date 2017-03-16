//Postorder Inorder, Preorder   ::: BFS OR LEVEL ORDER

public void printPostorder(Node node){
        if (node == null) return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
 
 public void printInorder(Node node){
        if (node == null) return;

        printPostorder(node.left);
        System.out.print(node.key + " ");
        printPostorder(node.right);
       
    }
    
    public void printPreorder(Node node){
        if (node == null) return;
        
        System.out.print(node.key + " ");
        printPostorder(node.left);
        printPostorder(node.right);
    }
 
 
 
 //---------------------------------LEVEL ORDER----------------------------------------------------
  /* function to print level order traversal of tree*/
   void printLevelOrder() 
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {
 
            /* poll() removes the present head.
            For more information on poll() visit 
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
 
            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
