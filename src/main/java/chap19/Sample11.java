package chap19;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample11 {
    public static void main(String[] args) {
        String sPath = "f:" + File.separator + "workspace" + File.separator 
                     + "firstApp" + File.separator;
        //모든 파일과 디렉터리 수집
        String files[] = new File(sPath).list();
        List<String> fileList = 
            Arrays.stream(files)
                  .map(x -> {
                       File fileDir = new File(x);
                       return (fileDir.isDirectory())?"디렉터리: " + x :"파일: " + x;
                   })
                  .collect(Collectors.toList());
        
        fileList.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

