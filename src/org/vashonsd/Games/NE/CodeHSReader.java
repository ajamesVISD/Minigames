package org.vashonsd.Games.NE;

import java.util.Scanner;

public class CodeHSReader {
    private Scanner input;

    public CodeHSReader() {
        this.input = new Scanner(System.in);
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        int n = this.input.nextInt();
        this.input.nextLine();
        return n;
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        String str = this.input.nextLine();
        return str;
    }
}
