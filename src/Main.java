public class Main {

	public Main() {
	}

	public static void main(String[] args) {//�� ���� ����� �� ���� ���� �� ������� ����� �5000 ���� , ���� ���� �� ����� ������ ��� �����
		int size=5000;
		Factory f=new Factory(size);
		f.printArray();
		f.BubbleSort();
		f.printArray();
		f.shuffleWorkerArray();
		f.manageMergeSort(0,size-1);
		f.printArray();
	}

}
