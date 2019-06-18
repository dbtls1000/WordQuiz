package com.biz.word.exec;

import java.io.IOException;

import com.biz.word.service.WordService;

public class WordExec_02 {
	public static void main(String[] args) throws IOException {
		
		WordService ws = new WordService("src/com/biz/word/exec/word.txt");
		
		try {
			ws.inputWordList();
			ws.readWordList();
			while(true) {
				
				ws.makeQuiz();
				if(ws.pickQuiz()) break;
			}
		}catch(Exception e) {
			
		}
		
		System.out.println("Game Over");
		
	}
}
