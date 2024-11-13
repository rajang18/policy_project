package sep24;
interface work{
void dowork();
}
class backenddeveloper implements work{
	public void dowork() {
		System.out.println("develope backend for website");
	}
}
class frontenddeveloper implements work{
	public void dowork() {
		System.out.println("develope frontend for website");
	}
}
class person
{
	void work(work w)
	{
		w.dowork();
	}
}
public class Main {
public static void main(String[] args) {
	person p = new person();
	p.work(new backenddeveloper());
	p.work(new frontenddeveloper());
	System.out.println("develop full stack application");
}
}
