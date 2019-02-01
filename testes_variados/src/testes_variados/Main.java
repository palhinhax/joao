package testes_variados;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		String teste = "eeeee";
		
		
		
		char c = getCfor('.',1);
		
		
		System.out.println(c);
		
		
		
//
//		new jTest();
//
//	
//		
//	
//
//	String a = "5302";
//	
//	String[] nif = a.split("");
//	String[] sRet = nif;
//	
////		25537 2192
////		25537 5301
////		5301
//		
//		int ncti =0; // number of chars to ignore
//		int nlcti =1; // number of chars to ignore
//		
//		for (int i = ncti; i < nif.length-(nlcti); i++) {	
//			int x = Integer.parseInt(nif[i]);		
//			sRet[i]=String.valueOf(getIfor(x, i-ncti));			
//		}
//			String finale = "";
//	
//	for (String ss : sRet) {
//		finale=finale.concat(ss);
//		}		
//		System.out.println(finale);
		
	}

	public static int getIfor(int i, int j) {
		
		return (((6 + j) % 9)+(i+1))%10;

	}
	
	
	
	
public static char getCfor(char c, int position) {
	
	   
	int ascii = (int) c;
	
	String key = "agridtoolspasskey";//17
	
	String acdario = "abcdefghijklmnopqrstuvwxyz";
	
	System.out.println(key.length());//26
	
	
	char r = key.charAt(position%key.length());
	
	
		
		return r;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
