public class Main {

	public Main() {
	}

	public static void main(String[] args) {//אי אפשר לראות את הזמן ריצה כי הקונסול מתמלא ב5000 שמות , צריך לבטל את שורות ההדפסה כדי לראות
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
