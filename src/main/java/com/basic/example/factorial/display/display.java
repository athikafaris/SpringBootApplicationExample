package com.basic.example.factorial.display;

import java.util.Scanner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class display {
	@RequestMapping("/factorial")	
	public void solve(){
	int n;
    Scanner s = new Scanner(System.in);
    System.out.println("**************************************");
    System.out.println("Enter the number to find factorial");
    n = s.nextInt();
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact = fact * i;
    }
    System.out.println("The factorial of "+n +" "+"is " + fact);
    System.out.println("**************************************");
	}
}
