package Assignment_8;

class BSTNode{
    int info;
    BSTNode left,right;

    public BSTNode(int info){
        this.info=info;
        left=right=null;
    }

    public void insert(int info){
        if(info<this.info){
            if(left==null){
                left=new BSTNode(info);
            }else{
                left.insert(info);
            }
        }if(info>this.info){
            if(right==null){
                right=new BSTNode(info);
            }else{
                right.insert(info);
            }
        }
    }

    public void preorder(){
        preorderRec(this);
        System.out.println();
    }
    public void preorderRec(BSTNode root){
        if(root!=null){
            System.out.print(root.info+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }


    public void inorder(){
        inorderRec(this);
        System.out.println();
    }

    public void inorderRec(BSTNode root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.info+" ");
            inorderRec(root.right);
        }
    }
    

    public void postorder(){
        postorderRec(this);
        System.out.println();
    }

    public void postorderRec(BSTNode root){
        if(root!=null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.info+" ");
        }
    }

}
public class A8Q2 {
    public static void main(String[] args) {
        
        BSTNode root=new BSTNode(30);
        root.insert(20);
        root.insert(5);
        root.insert(15);
        root.insert(12);
        root.insert(17);
        root.insert(30);
        root.insert(25);
        root.insert(35);

        BSTNode.inrorder();
       
        System.out.println(root.info);
        System.out.println(root.left.info);
        System.out.println(root.right.info);
        System.out.println(root.left.left.info);
        System.out.println(root.left.right.info);

    } 
}
