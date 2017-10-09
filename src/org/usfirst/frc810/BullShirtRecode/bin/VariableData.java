package org.usfirst.frc810.BullShirtRecode.bin;

import java.util.HashMap;

public class VariableData {
	private static VariableData instance = null;
	public static VariableData getInstance() {
		if(instance == null)
			instance = new VariableData();
		return instance;
	}
	
	public HashMap<String,String> variableData = null;
	
	public VariableData() {
		variableData = new HashMap<>();
	}
	
	private void setDefaultValues() {
		update("safety","false");
		update("speed","1");
	}
	
	public void update(String key, String value) {
		if(variableData.containsKey(key)) {
			variableData.remove(key);
		}
		variableData.put(key, value);
	}
	
	public String getString(String key) {
		if(!variableData.containsKey(key))
			return null;
		return variableData.get(key);
	}
	
	public int getInt(String key) {
		if(getString(key) == null)
			return -1;
		return Integer.parseInt(getString(key));
	}
	
	public double getDouble(String key) {
		if(getString(key) == null)
			return -1;
		return Double.parseDouble(getString(key));
	}
	
	public boolean getBoolean(String key) {
		if(getString(key) == null)
			return false;
		return Boolean.parseBoolean(getString(key));
	}
	
	
	
}
