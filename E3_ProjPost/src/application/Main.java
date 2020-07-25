package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String title = "Traveling to new Zealand";
		int likes = 12;
		Date postDate = sdf.parse("25/07/2020 10:25:44");
		String content = "I`m going to visit this wanderful country!";
		
		Post p = new Post(postDate, title, content, likes);
		
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			String Commented = sc.nextLine();
			Comment c = new Comment(Commented);
			p.addComment(c);
		}
		
		System.out.println(p);
		
		sc.close();

	}

}
