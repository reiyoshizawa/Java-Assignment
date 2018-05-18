package Assignment;

import java.util.Scanner;

public class Rovarspraket {

    // String vowels = "AEIOUaeiou";
    // if (vowels.indexOf(some_str) >= 0 ) {
    //    // vowel
    // }

    // consonantは3文字に置き換えられる
    // 1文字目：consonant それ自体
    // 2文字目：consonant 最も近い母音（先頭に近い母音をprefer）
    // 3文字目：consonant 次の子音 (zの場合は次の子音もzになる）

    // 母音はそのまま

    // joy
    // jikoyuz

    // ham
    // hijamon

    public static void main(String[] args) {

        System.out.println("write something word");
        Scanner scan = new Scanner(System.in);

        String str = scan.next().toLowerCase();
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {

            // vowel
            if (a[i] == 'a' || a[i] == 'i' || a[i] == 'u' || a[i] == 'e' || a[i] == 'o' ) {
                System.out.print(a[i]);
            }

            // consonant
            if (!(a[i] == 'a' || a[i] == 'i' || a[i] == 'u' || a[i] == 'e' || a[i] == 'o' )) {
                // first consonant
                System.out.print(a[i]);

                // second consonant
                int secondConsonant = (int)a[i];

                int vowelA = 97;
                int vowelI = 105;
                int vowelU = 117;
                int vowelE = 101;
                int vowelO = 111;

                int[] vowelNumbers = {vowelA, vowelI, vowelU, vowelE, vowelO};
                int[] diff = new int[5];

                for ( int l = 0; l < vowelNumbers.length; l++ ) {
                    diff[l] = Math.abs(secondConsonant - vowelNumbers[l]);
                }

                int resultMin = diff[0];

                for ( int l = 0; l < vowelNumbers.length; l++ ) {
                    resultMin = Math.min(resultMin, diff[l]);
                }

                if (resultMin == diff[0]) {
                    System.out.print("a");
                } else if (resultMin == diff[1]) {
                    System.out.print("i");
                } else if (resultMin == diff[2]) {
                    System.out.print(("u"));
                } else if (resultMin == diff[3]) {
                    System.out.print(("e"));
                } else if (resultMin == diff[4]) {
                    System.out.print("o");
                }

//               System.out.println(resultMin);
//                System.out.println(diff[0]);
//                System.out.println(diff[1]);
//                System.out.println(diff[2]);
//                System.out.println(diff[3]);
//                System.out.println(diff[4]);

                // third consonant
                int next = (int)a[i] + 1;
                if (next == 97 || next == 105 || next == 117 || next == 101 || next == 111 ) {
                    int next2 = (int)a[i] + 2;
                    System.out.print((char)next2);
                } else if (next == 123){
                    System.out.print("z");
                }else {
                    System.out.print((char)next);
                }
            }

        }

        // joy
        // j:106, o:111, y:121
        // jikoyuz

        // ham
        // h:104, a:97, m:109
        // hijamon

        // a:97, i:105, u:117, e:101, o:111
    }

}
