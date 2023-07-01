package etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 나이순 정렬(10814번)
 * 
 * @author gksrb
 *
 */
public class Practice56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            members.add(new Member(age, name));
        }

        members.sort(new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return members.indexOf(m1) - members.indexOf(m2);
                }
                return m1.age - m2.age;
            }
        });

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}


class Member {
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
