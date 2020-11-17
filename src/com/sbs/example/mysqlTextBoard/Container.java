package com.sbs.example.mysqlTextBoard;

import java.util.Scanner;

import com.sbs.example.mysqlTextBoard.controller.ArticleController;
import com.sbs.example.mysqlTextBoard.controller.Controller;
import com.sbs.example.mysqlTextBoard.controller.MemberController;
import com.sbs.example.mysqlTextBoard.service.ArticleService;
import com.sbs.example.mysqlTextBoard.service.MemberService;
import com.sbs.example.mysqlTextBoard.session.Session;

public class Container {

	public static Scanner scanner;
	
	public static MemberService memberService;
	public static ArticleService articleService;
	
	public static Controller articleController;
	public static Controller memberController;

	public static Session session;

	static {
		scanner = new Scanner(System.in);
		
		session = new Session();

		memberService = new MemberService();
		articleService = new ArticleService();
		
		articleController = new ArticleController();
		memberController = new MemberController();

	}

}
