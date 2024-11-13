package sep14;

public class gar {
public void finalize(){
	System.out.println("student object is garbage collected");
}
public static void main(String[] args) {
	gar g1=new gar();
	System.out.println(g1);
	g1=null;
	System.out.println(g1);
	System.gc();
}
}
