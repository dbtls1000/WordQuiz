package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {

	Scanner scan;
	List<String> wordList;
	String word;
	FileReader fileReader;
	BufferedReader buffer;

	public WordService(String cord) throws FileNotFoundException {

		scan = new Scanner(System.in);
		wordList = new ArrayList<String>();
		word = new String();
		fileReader = new FileReader(cord);
		buffer = new BufferedReader(fileReader);

	}

	/*
	 * word.txt파일로부터 단어 리스트를 읽어서 wordList에 추가
	 */
	public void readWordList() throws IOException {
		// 리스트의 데이터만 지우는 method
		// remove() 1개씩만 지우는 method
		wordList.clear();
		String reader = "";

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			wordList.add(reader);
		}
		
	}

	public void inputWordList() {
		wordList.clear();
		
		wordList.add("Korea");
		wordList.add("America");
		wordList.add("England");
		wordList.add("Germany");
		wordList.add("Africa");
		wordList.add("France");

	}

	public void makeQuiz() {

		Collections.shuffle(wordList);
		word = wordList.get(0);

		String[] arrWord = word.split("");
		List<String> apList = new ArrayList<String>(Arrays.asList(arrWord));
		Collections.shuffle(apList);
		System.out.println("============================");
		System.out.println(apList);
		System.out.println("============================");

	}

	public boolean pickQuiz() {
		System.out.println("제시된 알파벳의 단어를 맞추시오");
		System.out.println("종료 : --END");
		String strKeyInput = scan.nextLine();
		if (strKeyInput.equals("--END"))
			return true;
		if (word.equalsIgnoreCase(strKeyInput)) {
			System.out.println("참 잘했어요");
		} else {
			System.out.println("단어 선택을 잘못했네요");
		}
		return false;
	}

}
