package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordExec_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> words = new ArrayList<String>();
		
		words.add("Korea");
		words.add("America");
		words.add("England");
		words.add("Germany");
		words.add("Africa");
		words.add("France");
		
		// 단어목록을 뒤섞음
		Collections.shuffle(words);
		
		// 뒤섞인 목록에서 0번째 단어를 읽어
		// 알파벳으로 분해하여 문자열 배열로 생성
		String[] alpha = words.get(0).split("");
		//문자열 배열을 String형 List로 변환하고
		// 알파벳 조각들이 List로 생성
		List<String> apList = new ArrayList<String>(Arrays.asList(alpha));
		
		// 알파벳 조각들을 다시 섞어주고
		Collections.shuffle(apList);
		
		// 섞인 알파벳 조각을 화면에 보여주고
		System.out.print("다음에서의 단어를 맞게 입력하시오");
		System.out.println(apList);
		// 맞는단어를 키보드로 입력
		String keyInput = scan.nextLine();
		
		// 맞앗는지 틀렸는지 검사
		if(words.get(0).equalsIgnoreCase(keyInput)) {
			System.out.println("참 잘했어요");
		}else {
			System.out.println("잘못 입력했어요");
		}
		
		
		
	}
}
