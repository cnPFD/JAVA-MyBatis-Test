package lcw.Demo.Domain;

import java.io.*;

/**
 * Created by soft01 on 2017/5/10.
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String ff = "D:\\MyGit\\Project_cnPFD\\JAVA-MyBatis-Test\\src\\main\\java\\MyBatis\\example\\lcw\\XML\\tt.txt";
        File f=new File(ff);
        FileOutputStream fos=new FileOutputStream(f,true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        OutputStreamWriter osw=new OutputStreamWriter(bos,"utf-8");
        PrintWriter pw=new PrintWriter(osw);
        pw.println();
        pw.close();
    }
}
