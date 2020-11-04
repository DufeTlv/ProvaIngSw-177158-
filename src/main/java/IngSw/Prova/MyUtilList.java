package IngSw.Prova;

import java.util.ArrayList;
import java.util.List;

public class MyUtilList {
	
		public MyUtilList() {}
		
		public List<Integer> ordinaCrescente(List<Integer> myList) {
			for(int i = 0; i<myList.size(); ++i) {
				for(int j = i+1; j<myList.size(); ++j) {
					if(myList.get(i) > myList.get(j)) {
						int temp = myList.get(j);
						myList.set(j, myList.get(i));
						myList.set(i, temp);
					}
				}
			}
			return myList;
		}
		
		public List ordinaDecrescente(List<Integer> myList) {
			for(int i = 0; i<myList.size(); ++i) {
				for(int j = i+1; j<myList.size(); ++j) {
					if(myList.get(i) < myList.get(j)) {
						int temp = myList.get(j);
						myList.set(j, myList.get(i));
						myList.set(i, temp);
					}
				}
			}
			return myList;
		}
}
