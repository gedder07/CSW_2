package Assignment_7;

import java.util.LinkedList;
import java.util.Queue;

class Country{
    String name;
    int population;
    Country(String name, int population){
        this.name=name;
        this.population=population;
    }
}

class BNode{
    Country info;
    BNode left, right;
    BNode(Country info){
        this.info=info;
        left=right=null;
    }
}

class BST{
    BNode root;
    BST(){
        root=null;
    }

    void insert(Country country){
        root=insertNode(root, country);
    }

    BNode insertNode(BNode root,Country country){
        if(root==null){
            return new BNode(country);
        }
        if(country.name.compareTo(root.info.name)<0){
            root.left=insertNode(root.left,country);
        }else if(country.name.compareTo(root.info.name)>0){
            root.right=insertNode(root.right,country);
        }
        return root;
    }

    BNode findMax(){
        return findMaxRec(root);
    }

    BNode findMaxRec(BNode root){
        if(root==null || root.right==null) return root;
        return findMaxRec(root.right);
    }

    BNode findMin(){
        return findMinRec(root);
    }

    BNode findMinRec(BNode root){
        if(root==null || root.left==null) return root;
        return findMinRec(root.left);
    }

    void levelOrderTraversal(){
        if(root==null)
            return;
        Queue<BNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BNode currNode=queue.poll();
            System.out.println(currNode.info.name+": "+currNode.info.population);

            if(currNode.left!=null) queue.offer(currNode.left);
            if(currNode.right!=null) queue.offer(currNode.right);
        }
    }

}
public class A8Q3 {
    public static void main(String[] args) {
        
        BST list=new BST();

        Country india=new Country("India", 140);
        Country china=new Country("China", 139);
        Country pakistan=new Country("Pakistan", 25);
        Country bangladesh=new Country("Bangladesh", 15);
        Country russia=new Country("Russia", 14);

        list.insert(india);
        list.insert(china);
        list.insert(russia);
        list.insert(bangladesh);
        list.insert(pakistan);

    }
}
