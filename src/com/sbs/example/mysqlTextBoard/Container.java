package com.sbs.example.mysqlTextBoard;

import java.util.Scanner;

import com.sbs.example.mysqlTextBoard.controller.ArticleController;
import com.sbs.example.mysqlTextBoard.controller.Controller;
import com.sbs.example.mysqlTextBoard.controller.MemberController;
import com.sbs.example.mysqlTextBoard.service.ArticleService;
import com.sbs.example.mysqlTextBoard.service.MemberService;

public class Container {

	public static Scanner scanner;
	
	public static MemberService memberService;
	public static ArticleService articleService;
	
	public static Controller articleController;
	public static Controller memberController;

	static {
		scanner = new Scanner(System.in);

		memberService = new MemberService();
		articleService = new ArticleService();
		
		articleController = new ArticleController();
		memberController = new MemberController();

	}

}
