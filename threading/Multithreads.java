package threading;

public class Multithreads {

	public static void main(String[] args) {
		Threadex work=new Threadex();
        Thread t1=new Thread(work);
        Thread t2=new Thread(work);
        t1.start();
        t2.start();
        

	}

}
