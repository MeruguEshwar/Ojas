package com.ojas.bean.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Emolpyee {
	private int id;
	private String Ename;
	private Map<String, String> locations;

	public Emolpyee(int id, String ename, Map<String, String> locations) {
		this.id = id;
		Ename = ename;
		this.locations = locations;
	}

	public void hello() {
		System.out.println(id + "/" + Ename);

		for (Map.Entry m : locations.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
