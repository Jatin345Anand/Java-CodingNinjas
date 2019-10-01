package Recursion;

public class TOH {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==1) {
			System.out.println("S : "+source+" D : "+destination);
			return;
		}
		towerOfHanoi(disks-1, source , destination,auxiliary);
		System.out.println("S : "+source+" D :"+destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);
	}
	public static void main(String[] args) {
		char S='a';
		char A='b';
		char D='c';
	    int disks = TakeData.TakeInt();
	    towerOfHanoi(disks, S, A, D);
	    
	}
}
