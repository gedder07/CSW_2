package Assigment_8;

class BSTnode {
    int info;
    BSTnode left, right;

    public BSTnode(int info) {
        this.info = info;
        left = right = null;
    }
    public void insert(int info){
        if(info<this.info){
            if(left==null){
                left=new BSTnode(info);
            }else{
                left.insert(info);
            }
        }if(info>this.info){
            if(right==null){
                right= new BSTnode(info);
            }else{
                right.insert(info);
            }
        }
    }

}

public class A8Q1 {
    public static void main(String[] args) {
        BSTnode root = new BSTnode(30);
        root.insert(20);
        root.insert(45);
        root.insert(10);
        root.insert(60);

        System.out.println(root.info);
        System.out.println(root.left.info);
        System.out.println(root.right.info);

    }
}
