package Operators;

public class UnaryOperators {
	

	/**
	* unary operators are categorized two types
	* 1.prefix Operators
	* a.pre-incre
	* b.pre-decre
	* 2.postfix operators
	* a.post-incre
	* b.post-decre
	*/


		public static void main(String[] args) {
		
		int a=100;

		
		++a;
		System.out.println("++a : "+a--+--a);
		
		--a;
		System.out.println("--a : "+a);
		
		a++;
		System.out.println("a++ : "+a);
		
		a--;
		System.out.println("a-- : "+a);
		--a;
		System.out.println("++a : "+a);
		}

		}


