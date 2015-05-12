package LTS;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Database {

	Set<Toll> tollSet;
	private static Database instance = null;
	private final Lock lock = new ReentrantLock();
	
	private Database(){
		tollSet = new HashSet<Toll>();
		
	}
	
	private static Database getInstance(){
		if(instance == null)
			instance = new Database();
		return instance;
	}
	
	public Set<Toll> getTollSet() {
		return tollSet;
	}

	public Lock getLock() {
		return lock;
	}

	public void setTollSet(Set<Toll> tollSet) {
		this.tollSet = tollSet;
	}

	public static void setInstance(Database instance) {
		Database.instance = instance;
	}

	
	
}
