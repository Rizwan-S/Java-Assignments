import java.io.*;

public class Tree{

	Tree left;
	Tree right;
	int val;

	Tree(Tree left, Tree right, int val)
	{
		this.left = left;
		this.right = right;
		this.val = val;
	}

	int getval(){ return val;}
	Tree getleft(){ return left;}
	Tree getright() { return right;}

	void traverse(Tree current)
	{
		if (current == null) return;
		System.out.print(current.getval() + " ");
		traverse(current.getleft());
		traverse(current.getright());
	}

	public static void main(String[] args) {

		Tree a = new Tree(null, null, 4);
		Tree b = new Tree(a, null, 2);
		Tree c = new Tree(null, null, 5);
		Tree d = new Tree(null, null, 6);
		Tree e = new Tree(d, c, 3);
		Tree f = new Tree(b, e, 1);	
		f.traverse(f);
	}
}