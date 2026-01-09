package Typecasting_Task;

//Typecasting long into other data types

public class program4 {
		public static void main(String[] args) {
			long l = 68l;
			byte by = (byte)l;
			short s = (short)l;
			int i = (int)l;
			double d = l;
			float f = l;
			char c = (char)l;
			
			System.out.println(l);
			System.out.println(by);
			System.out.println(s);
			System.out.println(i);
			System.out.println(d);
			System.out.println(f);
			System.out.println(c);
		}
}
