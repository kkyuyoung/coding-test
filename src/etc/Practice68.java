package etc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 백준 > 문자열 폭발(9935번)
 * 
 * @author gksrbdud
 *
 */
public class Practice68 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String boomb = sc.next();

		while(str.contains(boomb)) {
			str = str.replace(boomb, "");
		}
		if(str.length() > 0 ) {
		System.out.println(str);
		} else {
			System.out.println("FRULA");
		}

		/*
		 * while()로 str에 boomb가 포함되어잇을 때를 조건으로 걸고 str에서 boomb를 제거하세여
		 */
	}
}