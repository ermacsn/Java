package lession;

import java.io.File;

public class lession_2 {
    public static void main(String[] args) {
//        String str = "";
//
//        for (int i = 0; i < 1_000_000; i++) {
//            str += "+";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1_000_000; i++) {
//            sb.append("+");
////        }
//        String[] name = {"С", "е", "р", "г", "е", "й"};
//        String sk ="СЕРГЕЙ";
//        System.out.println(sk.toLowerCase());
//        System.out.println(String.join("", name));
//        System.out.println(String.join("","С","е","р","г","е","й"));
//        System.out.println(String.join(",","С","е","р","г","е","й"));
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String patchFIle = pathProject.concat("/file.txt");
//            File file = new File((patchFIle));
//            if (file.createNewFile()) {
//                System.out.println("file.created");
//            } else {
//                System.out.println("file.exited");
//            }
//        } catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }

        try {
            String pathProject = System.getProperty("user.dir");
            String patchFIle = pathProject.concat("/files");
            File dir = new File((patchFIle));
            if (dir.mkdir()) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }

    }
}
