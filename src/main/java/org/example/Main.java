package org.example;

import java.util.*;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("tanaka");
        names.add("yamada");
        names.add("suzuki");

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        Map<String, String> userDate = new HashMap<>();
        userDate.put("tanaka", "大阪に住んでいます");
        userDate.put("yamada", "東京に住んでいます");
        userDate.put("suzuki", "名古屋に住んでいます");

        if (userDate.containsKey("tanaka")) {
            System.out.println("この人は存在しています。");
            System.out.println("この人は" + userDate.get("tanaka"));
        } else {
            System.out.println("この人は存在していません");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください");
        String name = scanner.nextLine();
        try {
            if (userDate.containsKey(name)) {
                System.out.println("この人は登録されています" + userDate.get(name));
            } else {
                throw new UserNotFoundException("この人は登録されていません。");
            }
        } catch (UserNotFoundException e) {
            System.out.println("この人は登録されていません。再度入力願います");
        }
    }
}
