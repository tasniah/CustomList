package com.customlists;

@SuppressWarnings("unchecked")
public class CustomList<T>{
	private Object[] list; 
	private int top;
	private int listCapacity = 10;
	
	CustomList(){
		list = new Object[listCapacity];
		top = -1;
	}
	
	private boolean isAvailable(int i) {
		if(list[i] != null)
			return true;
		return false;
	}
	
	public void add(T obj) {
		list[++top] = obj;
	}
	
	public boolean addAt(int i, T obj) {
		int index = ++top;
		while(index>=i) {
			list[index+1] = list[index];
			index--;
		}
		list[i] = obj;
		return true;
	}
	
	
	public boolean remove(T obj) {
		for(int i = 0; i <= top; i++)
		{
			if(obj.equals( (T)list[i]) ) {
				return removeAt(i);
			}
		}
		return false;
	}
	
	public boolean removeAt(int i) {
		if(isAvailable(i)) {
			while(i<this.top) {
				list[i]=list[i+1];
				i++;
			}
			list[top] = null;
			this.top--;
			return true;
		}
		return false;
	}
	
	public T get(int i) {
		return (T)list[i];
	}
	
	public int size() {
		return this.top+1;
	}

	@Override
	public boolean equals(Object obj) {
		CustomList<T> customList = (CustomList<T>) obj;
		if(this.size() == customList.size()) {
			for(int i = 0; i < this.size(); i++) {
				if(!customList.get(i).equals(this.get(i)))
					return false;
			}
			
			return true;
		}
		return false;

	}
	
	
	
}
