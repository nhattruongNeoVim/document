package fpt.clc.btjb.unit06.threading.synchronizedblock;

public class TestSynchronizedBlock {
	public static void main(String args[]) {
		Data obj = new Data();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
