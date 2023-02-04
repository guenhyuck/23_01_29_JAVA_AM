package Korea.it;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Main {
	public static void main(String[] args) {
	System.out.println("== ���α׷� ���� ==");

	Scanner sc = new Scanner(System.in);
 
	int lastArticleId = 0;
	List<Article> articles = new ArrayList<>();

	while (true) {
		System.out.printf("��ɾ� ) ");
		String cmd = sc.nextLine();

		if (cmd.length() == 0) {
			System.out.println("��ɾ �Է��ϼ���");
			continue;
		}
		if (cmd.equals("system exit")) {
			break;
		}

		if (cmd.equals("article write")) {
			int id = lastArticleId + 1;
			lastArticleId = id;

			System.out.printf("���� : ");
			String title = sc.nextLine();
			System.out.printf("���� : ");
			String body = sc.nextLine();
			
			Article article = new Article(id , title , body);
			
			articles.add(article);
			

			System.out.printf("%d�� ���� �����Ǿ����ϴ�\n", id);

		} else if (cmd.equals("article list")) {
			if(articles.size() == 0) {
			System.out.println("�Խñ��� �����ϴ�");
			continue;
		}	
			for (int i = 0; i < articles.size(); i++){
				Article article = articles.get(i);
				System.out.printf("%d , %s\n", article.id, article.title);
			}
			
		} else {
			System.out.println("���� ��ɾ��Դϴ�");
		}
  }

	sc.close();
	System.out.println("== ���α׷� ���� ==");
}



class Article {
	int id;
	String title;
	String body;
	
	
	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
		
	}
