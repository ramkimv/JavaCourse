package JavaBasics;

public class ObjectCreationInInheritance {


	public static void main(String[] args) {
		AA ob = new AA();
		BB ob3 = new BB();
		C ob1 = new C();
		C ob2 = new C(4);
	}
}	
	class AA{
		public AA() {
			System.out.println("Inside A const");
		}
		
		public AA(int i) {
			System.out.println("Inside A const int");
		}
	}
	
	class BB extends AA{
		public BB() {
			System.out.println("Inside B const");
		}
		public BB(int i) {
			System.out.println("Inside B const int");
		}
	}
	
	class C extends BB{
		public C() {
			System.out.println("Inside C const");
		}
		public C(int i) {
			System.out.println("Inside C const int");
		}
	}
