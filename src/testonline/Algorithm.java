package testonline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi từ bàn phím: ");
        String str = scanner.next();            // Sử dụng next() vì chuỗi không chứa khoảng trắng
        long count = countOccurrences(str);
    }

    public static long countOccurrences(String str) {
        Pattern pattern = Pattern.compile("aa|aw|dd|ee|oo|ow|w");
        Matcher matcher = pattern.matcher(str);
        long count = 0;
        String answer = "";
        while (matcher.find()) {
            answer += matcher.group() +",";
            count++;
        }
        answer = answer.substring(0, answer.length() -1);

        System.out.print("Số lượng chữ cái Tiếng Việt được tạo thành là: " + count + " (" + answer + ")");

        return count;
    }
}
