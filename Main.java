import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        //  Q1:
        System.out.print("------Q1------\n");
        String path1 = args[0];
        String path2 = args[1];
        CodeFile codeFile=new CodeFile(path1);
        double similarity = codeFile.calculateSimilarity(new CodeFile(path2)) * 100;
        System.out.println("相似文件：\n" + path1 + "\n" + path2 + "\n" + "相似度：" + similarity + " %");

        //  Q2:
        System.out.print("\n\n" + "------Q2------\n");
        ArrayList<String> urls = new ArrayList<>(Arrays.asList(args));
        ClosestCodeMatch closestCodeMatch = new ClosestCodeMatch(urls);
        closestCodeMatch.showQ2();

        //  Q3
        System.out.print("\n\n" + "------Q3------\n");
        closestCodeMatch.showQ3();

    }
}
