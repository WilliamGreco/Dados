/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03;


import java.util.List;
import java.util.Map;

public interface Exe_00 {
	public String getStatement();
	
	public List<String> getInputNames();
	
	public void setInputMap(Map<String, String> input);
	
	public String getResultDescription();
	
	public void solve();
}